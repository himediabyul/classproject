-- 20221018

-- inline view - rownum
-- from 절 뒤에 오는 서브쿼리 -> inline view
-- select -> 결과도 테이블

select rownum, emp.*
from emp order by hiredate;

-- rownum : 사용자가 생성하는 컬럼이 아니다!, 시스템에서 제공하는 컬럼

select rownum, t.*
from (select * from emp order by hiredate)t
;

-- top3
-- 입사일이 가장 오래된 3명을 출력해보자
select rownum, t.*
from (select * from emp order by hiredate)t
where rownum <= 3
;


create table emp01 (
    empno number(4) constraint emp01_empno_pk primary key, 
    ename varchar2(10) constraint emp01_ename_NN not null,
    job varchar2(9) constraint emp01_job_UK unique,
    sal number(7,2) constraint emp01_sal_CK check (sal between 500 and 5000),  -- 500~5000
    gender char(1)  constraint emp01_gen_CK check (gender in ('M','F')), -- 남자 M 여자 F
    deptno number(2) constraint emp01_deptno_FK references DEPT(deptno),
    hiredate date
    );

insert into emp01 (empno, ename, sal, job, gender, deptno) 
            values(1111, 'KING', 5000, '대표', 'M', 10);

insert into emp02 (empno, ename, sal, job, gender, deptno) 
            values(1112, 'KING', 1500, '대표', 'F', 20);
            
insert into emp02 values(1111, 'SON', '대리', 500, 'M', 40, '2022-10-17');  --생략시 desc의 순서와 같게 입력해야됨  
insert into emp02 (empno, ename) values (1113,'SCOTT'); 
-- 지정 입력되지 않은 컬럼에는 NULL 값이 등록 : 암묵적인 입력방법
insert into emp02 values(1114, 'HOT', null, null, null, null, null);
insert into emp02 values(1115, 'COOL', '', '', '', '', '');
drop table emp02;
create table emp02 (
    empno number(4), 
    ename varchar2(10) constraint emp02_ename_NN not null,
    job varchar2(9),
    sal number(7,2),  
    gender char(1), 
    deptno number(2),
    hiredate date default sysdate,
    constraint emp02_empno_pk primary key (empno),
    constraint emp02_job_uk unique (job),
    constraint emp02_sal_ck check(sal between 500 and 5000),
    constraint emp02_gen_ck check(gender in('M','F')),
    constraint emp02_deptno_fk foreign key(deptno) references dept(deptno)
    );

desc emp02;
select * from emp02;

--------------------------------------------------------------------------------------------
-- 데이터 수정
-- uptade 테이블이름 set 컬럼이름 = 새로운값, 컬럼이름 = 새로운값 where 행 선택 조건 

drop table emp03;
create table emp03 as select * from emp;

select * from emp03;

-- 모든 사원의 부서번호를 30으로 변경
update emp03 set deptno=30;

-- 모든 사원의 급여를 10% 인상
update emp03 set sal = sal*1.1;

-- 모든 사원의 입사일을 오늘 날짜로 변경
update emp03 set hiredate = sysdate;

-- 부서번호가 10번인 사원의 부서번호를 30번으로 변경
update emp03 set deptno=30 where deptno=10;

-- 급여가 3000 이상인 사원들의 급여를 10% 인상
update emp03 set sal = sal * 1.1 where sal >= 3000;

-- SCOTT 사원을 40번 부서로 이동, 직급을 MANAGER로 변경
update emp03 set deptno=40, job = 'MANAGER' where ename = 'SCOTT';

-- SMITH 사원을 SCOTT의 부서로 이동
update emp03 set deptno = (select deptno from emp03 where ename='SCOTT')where ename='SMITH';

drop table dept01;
create table dept01 as select * from dept;
select * from dept01;

-- 부서번호가 20번인 지역명과 부서명을 40번인 부서와 동일하게 변경
update dept01 set (dname,loc) = (select dname,loc from dept01 where deptno=40) where deptno = 20;


--------------------------------------------------------------------------
-- 테이블의 행삭제
-- delete from 테이블이름 where 행선택조건

--delete 문으로 부서 테이블 모든행 삭제
delete from dept01;

select * from emp03;

-- 대표 사퇴
delete from emp03 where empno = 7839;


--40번 부서의 모든 사원의 삭제
delete from emp03 where deptno=40;

--  sales 부서의 사원이 모두 퇴사
delete from emp03 where deptno=(select deptno from dept where dname ='SALES');





