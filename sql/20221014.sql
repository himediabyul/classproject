-- 20221014

-- join : 관계있는 테이블의 스키마를 붙이는 것
select * 
from emp, dept --equi join
where emp.deptno = dept.deptno;

-- 14*4 => cross join의 결과 행
select *
from emp cross join dept;


select ename, dname
from emp, dept
where emp.deptno = dept.deptno;


select e.ename, d.dname
from emp e, dept d --별칭 지정
where e.deptno = d.deptno;


-- mysql사용 시
select  *
from emp inner join dept
on emp.deptno = dept.deptno;

select  *
from emp inner join dept
using(deptno);

-- 별칭사용 없이 데이터 추출가능
select deptno
from emp inner join dept
using(deptno);


select *
from emp natural join dept;  -- 이름이 같은 열을 조인

-- self join : 자기 자신의 테이블과 조인
-- emp => mgr : 상사의 사원번호
-- 각 사원들의 이름과 상사의 이름을 출력
select ename, mgr
from emp;

select e1.ename as "사원이름", e2.ename as "상사이름"
from emp e1, emp e2
where e1.mgr = e2.empno(+)  -- (+)일치하는 조건 외의 것 출력
;

select e1.ename, e2.ename
 from emp e1 left outer join emp e2 --왼쪽에 테이블을 출력
 on e1.mgr = e2.empno
 ;

select e1.ename, e2.ename
 from emp e1 right outer join emp e2 
 on e1.empno=e2.mgr
 ;

-- SCOTT 사원의 사원번호와 이름 직급 부서이름 부서위치를 출력
select empno, ename, job, dname, loc
from emp e, dept d
where e.deptno = d.deptno
    and e.ename = 'SCOTT';
    
select empno, ename, job, dname, loc
from emp e join dept d
on e.deptno = d.deptno
where e.ename = 'SCOTT';

select empno, ename, job, dname, loc
from emp e natural join dept d
where e.ename = 'SCOTT';


--salgrade 테이블을 참조해서 사원들의 사번, 이름, 급여, 급여 등급을 출력
select * from salgrade;

select empno, ename, sal, grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal;

--mysql
select enmae, losal, sal, hisal, grade
from emp e join salgrade s
on e.sal between s.losal and s.hisal;


-- 판매내역 : 판매 정보, 판매 서적의 정보, 고객의 정보
desc orders;

select orders.orderdate, customer.name, book.bookname, book.price, orders.saleprice
from book, customer, orders
where orders.custid = customer.custid
    and orders.bookid = book.bookid
order by orderdate desc
;


--mysql
select o.orderdate, c.name, b.bookname, b.price, o.saleprice
from orders o join customer c
on o.custid = c.custid
join book b
on o.bookid = b.bookid
where name = '박지성'
;

select * from customer;

select c.name, count(*) as "구매횟수"
from orders o join customer c
on o.custid = c.custid
join book b
on o.bookid = b.bookid
group by c.name
;