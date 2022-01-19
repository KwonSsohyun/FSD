-- 주석
-- 한줄 주석밖에 없다.


-- 테이블 목록 확인
-- 4개의 가상 더미 데이터 확인해볼 수 있다. 
select tname from tab;

-- 사원정보 테이블(emp)
select * from emp;

-- 부서정보 테이블(dept)
select * from dept;

-- dbms (데이터베이스 관리 시스템) 쿼리를 통해서 정보 입출력함
-- 관계형 데이터베이스 모델 (RDBMS)
-- 순서가 없는 집합


-- 테이블 : 세로줄(컬럼)과 가로줄(row, 레코드)의 모델을 이용하여 정렬된 "데이터 집합"(값)의 모임
-- 집합은 순서가 없다. (쿼리문장을 통해서 정해줘야함 순서를 정하고 싶으면)
-- 레코드 자체에는 순서가 없다.
-- 기본단위는 테이블
-- 집합의 단위가 테이블
-- 테이블을 통해서 데이터를 관리

-- < sql 종류 >
-- DML - 데이터 조작 (select - dql코칭하기도함)
-- DDL - 데이터 설계&정의
-- DCL - 데이터베이스 컨트롤 (데이터베이스 자체 제어)
-- TCL - 트렌젝션 제어 (두개의 쿼리문장 수행 - 반드시 동시에 일어나게 할것이냐 말것이냐) (콘솔이냐 웹이냐 진행가능)



select * from dept;
select * from emp;

select deptno, dname from dept; -- 컬럼명만 올 수 있다. select와 from 사이에 말이다. 컴마로 구분

-- 사원의 이름과 급여와 입사일자만을 출력하는 SQL문을 작성해보자.
select ename, sal, hiredate from emp;  -- 쿼리문장의 특징은 대소문자의 구분이 없다.

-- 중복처리 : distinct
select distinct deptno from emp;
select deptno from emp;

select * from emp;

-- 별칭 : as
select deptno as "부서번호", dname as "부서명" from dept;

-- 조건처리 : where
select * from emp where deptno =10;
-- 테이블 EMP중에서 급여가 2000미만 사원정보중에 사번과 이름,급여 출력
select empno, ename, sal from emp where sal < 2000;
-- scott 이름을 가진 사람의 사번,이름,얼마 출력
select empno, ename, sal from emp where ename = 'SCOTT'; -- 벨류값은 대소문자 구분함 (쿼리문장만 대소문자만 구분안함)
-- 이름이 밀러인 사람의 사원번호, 사원명, 직급 출력
select empno, ename from emp where ename = 'MILLER';

-- 81년도에 입사한 사람들 출력
select ename, hiredate from emp where hiredate >= '1981/01/01' AND hiredate <= '1981/12/31'; -- 날짜는 문자열로 포맷 맞추면 되더라~

-- 급여가 1000에서 3000사이에 있는 사원
select ename, sal from emp where sal >= 1000 and sal <= 3000; -- 그냥 넣으면 숫자
select ename, sal from emp where sal between 1000 and 3000;

-- 급여가 1500과 2500 사이인 사원의 사번, 이름, 급여를 출력하라.
select empno, ename, sal from emp where sal between 1500 and 2500; 

-- 사원번호가 7844이거나 7654이거나 7521인 사원
select empno, ename from emp where empno=7844 or empno=7654 or empno=7521;
select empno, ename from emp where empno in (7844, 7654, 7521);


-- 테이블 몇개 가지고 있는지 확인
select tname from tab;


