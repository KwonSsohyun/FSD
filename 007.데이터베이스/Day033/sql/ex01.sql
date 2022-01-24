-- 14개 레코드
select * from emp;
select sal from emp;
select avg(sal) from emp;
select sum(sal) from emp;
select sal from emp where 2073.21 >= 2000 group by sal ;

select sal+empno from emp;
-- 문법오류  |  select sum(sal,empno); 


-- << 그룹함수 >> (1개의 레코드 반환) !! 세로!!
--    : 특정컬럼의 레코들의 합 - sum (세로축으로 더해짐)
--      하나의 레코드로 반환
select sum(sal) from emp;
select count(sal) from emp;
-- 다중 가능
select avg(deptno), sum(sal) from emp;
-- ▶
select sum(sal), avg(sal), max(sal), min(sal) from emp;



-- ▶ count : 그룹함수 중 유일 * 허용
-- 단, 컬럼값이 null일 경우 카운팅에서 제외
-- 레코드 갯수구하는 함수 - count
-- 컬럼이 뭐가 들어가도 상관없다.(*)
select count(*) from emp; 
-- null은 갯수(카운트)에서 제외함
select count(sal), count(*), count(comm) from emp; -- 14 | 14 | 3
select count(ename), sum(sal) from emp;

----------------------------------------------------------------------------------------------------

-- ▶▶ GROUP BY
--   : 그룹묶는 것
-- ex) 각 부서별 연봉의 합계
select sum(sal) from emp where deptno=10;
select sum(sal) from emp where deptno=20;
select sum(sal) from emp where deptno=30;

-- 이것을 한번에 출력
-- deptno로 그룹을 지었기 때문에, deptno가 다 똑같기 때문에 뭔지가 출력가능
select deptno, sum(sal) from emp group by deptno;
select deptno, avg(sal) from emp group by deptno;
-- group by deptno 그룹지었기 때문에 > 앞에 deptno 붙을 수 있는것

-- ▶▶ 그룹에 조건을 거는것 → HAVING 
--    (group by deptno)부서별 / (having avg(sal) >= 2000) 평균연봉의 2000보다 높은 /  (avg(sal) 사람들의 평균
-- 그룹짓고 그 그룹의 조건을 담 -> 거기서 또 원하는 값 구함
select deptno, avg(sal) from emp group by deptno having avg(sal) >= 2000;
-- where 하면, 그룹짓기 전에 조건처리가 됨 -> (테이블에서 조건을 거는것) (수행시점 빠름) (어디나 다 올 수 있음)
-- group by 그룹을 묶은 거에 -> 조건을 다는 것 having (수행시점이 늦음) (항상 group by 와 함께 존재 : 그룹에 조건을 다는 거니까)

-- order by(정렬 | 테이블에 있는것들을 알아야 해서) 가장 느리고  >  having (그룹을 해놔야 조건을 다니까 | 그룹을 알아야 하니까)



----------------------------------------------------------------------------------------------------

-- DML의 적용 (대상 | insert, update, delete)
commit;
-- 마지막 커밋시점으로 돌아가는 명령
rollback;


----------------------------------------------------------------------------------------------------

-- ▶▶ 시퀀스
select * from test01;
select * from test02;

-- ▶ 사용할 테이블
create table test01(
	num number,
	name varchar2(10)
);

-- ▷ 순번 체킹할 테이블
create table test02(
	num number
);

-- 순번체킹 테이블에 값 넣기 
insert into test02 values (0); -- 숫자 0 넣음
select num+1 from test02;      -- +1을 해서 → 1로 만듬

-- 사용할 테이블 값 넣기
insert into test01 values (1, 'test1');
-- test02테이블(순번체킹테이블) 넘버를 바꿔줌 
update test02 set num = num+1;


select max(num)+1 from test01;

------------------------------------------------------------------------------

-- 카운팅해주는 것이 시퀀스 (1부터 시작 - 자동으로 넘버링)
-- ▶ 시퀀스 만듬 
--   시퀀스명 : test01_seq
--   어떤 테이블을 사용할 > test01테이블에서 쓸 시퀀스 (네이밍 패턴)
create sequence test01_seq;

-- 시퀀스 삭제하는 명령어
drop sequence test01_seq;


-- ▶ 사용방법 
--   숫자 카운팅 (다음숫자 넘어가면 다시 못 돌아감)
--   ≫ 확인용 테이블 → dual
select test01_seq.nextval from dual;


-- 테이블 test01 에 값 넣음
insert into test01 values (test01_seq.nextval,'test1');





