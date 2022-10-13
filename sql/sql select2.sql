select *
from customer;

select* 
from book;

select*
from orders;

--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.

--(1) 도서번호가1인도서의이름
select bookname
from book
where bookid = 1;

--(2) 가격이20,000원이상인도서의이름
select bookname
from book
where price>=20000;
​

--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.

--(3) 모든고객의이름, 주소
select name, address
from customer;


--(4) 2014년7월4일~7월7일 사이에 주문받은 도서의 주문번호
select orderid
from orders
where orderdate between '14/07/04' and '14/07/07';


--(5) 2014년7월4일~7월7일사이에 주문받은 도서를 제외한 도서의 주문번호
select orderid
from orders
where orderdate < '14/07/04' and orderdate <'14/07/07' or orderdate > '14/07/07';

--(6) 성이‘김’씨인 고객의 이름과 주소
select name, address
from customer
where name like '김%';


--(7) 성이‘김’씨 이고 이름이 ‘아’로 끝나는 고객의 이름과 주소
select name, address
from customer
where name like '김%아';
