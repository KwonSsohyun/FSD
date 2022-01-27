--■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

-- ≪ old join ≫
--     1. Cross Join
--   ★ 2. Equi Join
--     3. NonEqui Join
--   ★ 4. Outer Join
--   ★ 5. Self Join

--------------------------------------------------------------------------------------------------------------

-- ▶ 테이블 지우기
drop table ex01;
drop table ex02;

-- ▶ 테이블 만들기
create table ex01(
	idx number,
	name varchar2(10),
	num number
);

create table ex02(
	num number,
	loc varchar2(6)
);

-- ▶ 값 넣기
insert into ex01 values (1, 'user1', 1111);
insert into ex01 values (2, 'user2', 2222);
insert into ex01 values (3, 'user3', 3333);
insert into ex01 values (4, 'user4', 5555);


insert into ex02 values (1111, '서울');
insert into ex02 values (2222, '부산');
insert into ex02 values (3333, '대전');
insert into ex02 values (4444, '제주');

-- ▶ 테이블 보기
select * from ex01;
select * from ex02;


-- ▶ 커밋
commit;

--------------------------------------------------------------------------------------------------------------

-- ▶▶ Cross Join
-- 레코드 갯수만큼 무작위 붙혀버림
select * from ex01,ex02;


-- ▶▶ Equi Join
-- 조건을 걸어서 의미있는 것만 보이게 하기
select * from ex01, ex02 where ex01.num = ex02.num; 
-- ex01에 있는 num과 ex02에 있는 num 이 같으면 보여줘라


-- ▶▶ NonEqui Join
select * from ex01, ex02 where ex01.num != ex02.num; 
-- ex01에 있는 num과 ex02에 있는 num 이 안 같으면 보여줘라


-- << 관계형 데이터 >>
--    : 테이블 둘로 쪼개는 이유
--      중복된 데이터 필요없어지니까
--      데이터 효율적으로 관리
select ename, loc from emp, dept where emp.deptno = dept.deptno;


--------------------------------------------------------------------------------------------------------------

-- ▶▶ Outer Join
--    : 한쪽 테이블에 붙히는것
--      붙힐쪽 테이블에다가 (+) 기호 붙혀준다.
--      기준은 아무것도 안붙힘!

--  ex01.num 이 기준이 되서 다 나오고,
--  ex02.num(+)은 붙혀지는 쪽이라서, 기준이 되는 ex01.num 에 같은 값이 없으면 NULL 이라고 나온다.
--  그리고, ex01.num에 정의되어있는 값이 기준만 나오는거지 → ex02.num(+)에 새로 있는 값이면 ex02.num은 기준이 아니니 안나온다. 
select * from ex01, ex02 where ex01.num = ex02.num(+);


-- 기준인 ex02가 다 나오고, 
-- ex01.num(+)은 기준인 ex02에 조건 적합한것만 나옴
select * from ex01, ex02 where ex01.num(+) = ex02.num;




--------------------------------------------------------------------------------------------------------------

-- ▶▶ Self Join
--    : 자기자신 조인
--      자기자신 테이블을 다시 한번 더 조인
--      반드시 별칭 필요함

-- << 테이블 별칭 부여 >>
-- 테이블 별칭 붙히면 간편
-- 테이블명 별칭명 (as키워드 쓰면 안됨)
-- 컬럼별칭할때는 as 키워드 쓴다.
select a.idx, a.name, a.num, b.num, b.loc from ex01 A, ex02 B where A.num = B.num; 
-- 쿼리문장은 대소문자 구분 안함
-- 그래서 별칭을 A라고 대문자로 해도 쓸때 a 소문자 써도 문제없다.

select * from emp, emp;
select * from emp A, emp B; -- 14 곱하기 14


-- 문제) 내가 사수가 누구냐
-- 풀이) 내 테이블 2개 조인해야하는 사항
select a.ename, b.ename from emp A, emp B where A.mgr = B.empno;


--------------------------------------------------------------------------------------------------------------


-- 부산에 있는 사람만 보고싶다.
-- 조건 묶은 것에 and를 붙혀서 추가 조건 후행 조건 붙힌다.
select a.idx, a.name, a.num, b.num, b.loc from ex01 A, ex02 B where a.num=b.num and B.loc='부산';



--■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

-- ≪ ANSI join ≫

-- ▶ cross join
--   : 테이블 조인
--     old join의 Cross Join 과 같다.
--     레코드 갯수만큼 무작위 붙혀버림

select * from ex01 cross join ex02; 
-- ex01테이블 → 4개 레코드존재 
-- ex02테이블 → 4개 레코드존재
-- 4 x 4 = 16개 레코드 나옴.


-- ▶ inner join
--   : 뭐랑 뭐가 같은지 조건검 -> on 
--   : 합집합
--     old join의 Equi Join 과 같다.
--     ▶ 이건 꼭 컬럼명 일치 안해도 됨
--       왜냐? 내가 일일히 명세하는 것이라서  →  ex01.num = ex02.num;
select * from ex01 inner join ex02 on ex01.num = ex02.num;


-- 같은조건을 좀 간편하게 적을 수 없을까? 
-- ▶ inner join using (중복된컬럼명)
--   전재조건) 두 개의 테이블에 컬럼명이 같아야함
--             중복된 컬럼명이 하나 이상 필수

-- ex01 과 ex02 테이블에 각각 동일하게 있는 num컬럼을 조인해라 ▶  using (num)
-- 결과값 보면 inner join on에는 2개의 테이블에 있는 num 컬럼 2개가 출력시 다 나왔는데
-- 이건 num 컬럼 하나만 나온다.
select * from ex01 inner join ex02 using (num);



-- ▶ 테이블명 natural join 테이블명
--   : 두개의 테이블에 컬럼에 반드시 일치하는게 ▶ 반드시! "하나"만 있어야함
--     반드시 하나의 컬럼명이 중복되어야함
--     왜냐면 위처럼 컬럼명을 명세하는 것이 아니라, 중복되는 컬럼이 다중이라면 컴퓨터는 계산을 할 수 없음.
--     ex01테이블과 ex02테이블에 각각 같은 컬럼이 딱 하나씩 존재해야 한다는 것! (여기서는 num 컬럼)
select * from ex01 natural join ex02;
-- 결과값 보면 inner join on에는 2개의 테이블에 있는 num 컬럼 2개가 출력시 다 나왔는데
-- 이건 num 컬럼 하나만 나온다.


-- 부산에 근무하는 사람 
-- 조건 묶은 것에 where 붙혀서 추가 조건 후행 조건 붙힌다.
-- 똑같은 코드) old join - Equi Join
select * from ex01 inner join ex02 on ex01.num=ex02.num where loc = '부산';


-- ▶ Outer Join
--   : left / right 처럼 방향에 맞게 지목된게 기준점이 됨.
--     기준점이 된것이 다 나오고, 기준점에 대조했을때 값 없는 것은 NULL 표기됨.
--   : old join - Outer Join ▶ (+) 처럼 어느쪽에 붙을지 정해줘야한다.
select * from ex01 left outer join ex02 using (num);
-- ▶ 조건처리  :  using (num) || on ex01.num = ex02.num
--                using (num) 은 테이블 2개에 다 있는 컬럼 num이 하나만 찍혀서 나옴
--                on ex01.num = ex02.num 은 테이블 2개 다 있는 컬럼 num이 둘 다 찍혀서 나옴
select * from ex01 left outer join ex02 on ex01.num = ex02.num;
select * from ex01 right outer join ex02 on ex01.num = ex02.num;
-- select * from ex01 right join ex02 on ex01.num = ex02.num;


-- ▶ full join 
--   : left outer join 나 right outer join 은 기준점을 잡고, 기준점에 상대방테이블에 없으면 NULL을 뱉어냈다면,
--     기준점이 없고, 상대방 테이블에 있건 없건 다 나온다.
--     없으면 NULL값 뱉음
select * from ex01 full outer join ex02 on ex01.num = ex02.num;



