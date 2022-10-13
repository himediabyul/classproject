--20221013

--함수 : 단인행 함수, 집합 함수

select ename, sal, nvl(comm, 0) as comm
from emp
where comm >= 0;

--문자 함수

select lower('SCOTT') from dual;
select ename, lower(ename) from emp;

select Upper('scott') from dual;

select initcap('scott') from dual;

--substr(원본, 시작포인트, 반환할 개수)
select substr('안녕하세요. 안유진입니다.', 2, 5)from dual;
select substr('안녕하세요. 안유진입니다.', 5)from dual;

select length ('안녕하세요. 안유진입니다.') from dual;

-- lpad, rpad 특정 자릿수 지정하고 자릿수에 데이터가 없는경우 특정 패턴으로 채우는 함수
-- 00010,00020,00030,00040
select dname, deptno, lpad(deptno, 5, '0'), rpad(deptno, 5, 'A')
from dept;

-- 공백을 없애는 함수
select '      ABC', trim('      ABC'), '    ABC  ', trim('    ABC  ')
from dual;

-- 대체 함수
select replace('Steven King', 'Steven', 'S.'),  replace('Steven King', 'Steven', ' ')
from dual;

