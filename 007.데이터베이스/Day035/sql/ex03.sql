
-- ▶ 서브쿼리
--   메인쿼리 문장 안에 들어가는 또 다른 쿼리문장
--   DML 위치 어디든지 올 수 있다.
--   DDL 에서 읽어올 수 있다.

--             필드자리       테이블자리        조건자리
--   ▶ select (서브쿼리) from (서브쿼리) where (서브쿼리)
--     필드자리에 서브쿼리 올 수 있고, 
--     테이블자리에 올 수도 있다.
--     조건자리에 올 수도 있다.

--   : 두개 이상의 테이블의 정보가 필요한 경우 서브쿼리를 사용한다.
--     괄호안쪽에 있는 문장이 (서브쿼리)
--     서브쿼리 먼저 실행 하고 → 메인쿼리 실행됨.

select ename, (select ename from emp b where b.empno=a.mgr) from emp a;


-- ▶ 1. 테이블 자리
--      : 입력, 수정해봤자 안됨. 없는 테이블임. 
--        ▶▶ select 쿼리에 의미를 지님
--           단, 자유롭게 가능
select * from (select * from dept);
select * from (select dname, loc from dept);
select * from (select 'add', dname from dept); -- 없는 컬럼 만듬(보여지는것만)
select * from (select sal+nvl(comm,0) from emp);


-- ▶ 2. 필드 자리
--      : 괄호안은 하나만 나와야함
--        단일결과값 (컬럼, 결과도 하나여야 함)
--        ▶▶ 단일 컬럼 & 단일 레코드
select ename, (select loc from dept where dept.deptno=emp.deptno) from emp; -- emp테이블 20과 dept테이블 20 같은것만 뽑아라 & emp테이블에 있는 ename 출력
select 'test' from dept; --> 레코드갯수만큼 문자열 출력 -- 쿼리문장은 대소문자 구분안함 

-- 단일 컬럼만! dname, loc XXXXX
select ename, (select dname, loc from dept where dept.deptno=emp.deptno) from emp; 
-- 여러값들 안됨 (단일결과값)  XXXXX
select ename, (select loc from dept where dept.deptno>emp.deptno) from emp; 


-- ▶ 3. 조건 자리
--      : 결과값이 상황에 따라 다름
--        ① 단일값이 나와야 하는 경우
--        ② 단일값이 안나와도 되는 경우
--            ⇒ in (그룹집합)
--              : where 테이블명 in (그룹집합) 
--                in 연산자는 (,)콤마로 구분하여 괄호 내에 묶으며,
--                이 값 중에 하나 이상과 일치하면 조건에 맞는 것으로 평가

-- 서브쿼리() 먼저 계산되고, 나와서 비교함
select ename, sal from emp where sal>=(select avg(sal) from emp);
-- select avg(sal) from emp; -- 2073.21429 (평균 구하고) -> 이거보다 크게 받냐?


select ename, deptno from emp where deptno in (select deptno from dept where deptno<30);
--                                            ( ⇒ 2개 레코드 나옴 ⇒      10, 20       )

-- ▶ in(그룹집합) : 이런것들은 단일값이 아니어도 됨.
--     DEPTNO   ⇒ (OOOOO 집합은 됨 OOOOO)
--   ---------
--      10
--      20

--  ⇒ 두개의 컬럼 (XXXXX 이런게 안된다. XXXXX)
--    → select 10, 20 from dual;
--      10        20
--    -------  -------
--      10        20


-- ▶ select가 밖에 있고, 괄호 안에 insert 는 안됨.
--   : select 안에서 DML 안됨
--     select (insert into ex05 values (111,'test')) from ex05   ▶ 안됨
select * from ex02;
insert into ex02 (select 6666,'대구' from dual);
insert into ex02 (select 7777,'수원' from dept); -- dept 레코드가 4개 있으니까 -- 집합을 통채로 인서트 테이블에 값 넣은것임.
select 7777,'수원' from dept;


----------------------------------------------------------------------------------------------------------------------------------


-- ≪ 테이블 전체 그대로 복사 ≫
create table ex03 as (select * from dept); -- (내용 복사한것임 - 깊은복사)
select * from ex03; -- dept 테이블처럼 보인다. (복사해서 그런것)

insert into ex03 values (50, 'test', 'test'); -- 복사한거니까, 당연 ex03 여기만 적용되죠~
select * from dept; -- 원본이었던 얘는 값은 그대로 -> 왜냐? 원본이고 값 조작한거 없다.
drop table ex03;


-- ≪ 테이블 컬럼 선택해서 복사 ≫
--   : 괄호안에 어떤 컬럼 선택해서 복사할건지 적는다.
create table ex04 as (select deptno, loc from dept);
select * from ex04;
drop table ex04;


-- ≪ 테이블 스키마만 복사 ≫
--   : 스키마만 가져올꺼니까 컬럼명만 가져오고, 데이터는 필요없는 것
--     ▶ 컬럼만 가져오고, 레코드는 없으면 됨
--        ⇒ 조건 false 하면 됨
--          false ▶ where 0>1
create table ex05 as (select deptno, loc from dept where 0>1); 
-- where조건이 true가 되는 값들이 select 한 선택한 컬럼에 데이터들이 들어가서 보여지는건데,
-- false가 되니까 맞는 조건이 없으니, select 한 선택한 컬럼에는 데이터들이 안들어가게됨.

select * from ex05; -- 선택된 레코드가 없다고 나옴 - 레코드 값이 없을뿐 컬럼은 있다.
desc ex05; -- cmd에서만 확인가능
drop table ex05;
























