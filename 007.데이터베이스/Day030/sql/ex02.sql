-- < 테이블 만들기 >
--   ▶ create table 테이블명 (컬럼명 자료형, 컬럼명 자료형, ...);
create table ex03(
	num number,       -- 40자리 이하로 정수 가능
	name varchar2(3), -- 영문으로는 3글자, 한글으로는 1글자 
	num2 number(2),   -- 숫자 2자리 (num2는 컬럼명 (내맘대로지음) (※소숫점 자리수 외 날림)
	num3 number(3,1)  -- 숫자 3자리 & 소숫점 1자리 (※소숫점 자리수 외 날림)
);

-- < 만든 테이블에 값 넣기 >
--   : 컬럼명 앞에 안적으면 다 넣어줘야 한다.
select * from ex03;
insert into ex03 values (1, 'aaa', 11, 12.3);
insert into ex03 values (2, 'bbb', 222, 12.3); -- (오류남) 222 > 이 열에 대해 지정된 전체 자릿수보다 큰 값이 허용됩니다.
-- 소숫점 자리수 외 날림
insert into ex03 values (2, 'bbb', 33.33, 12.3); -- 33.33 > 자리수 외 날라감!
insert into ex03 values (2, 'bbb', 44, 12.34);   -- 12.3  > 자리수 외 날라감!

insert into ex03 values (5, 'bbb', 55, 112.34); -- (오류남) 112.34 > 이 열에 대해 지정된 전체 자릿수보다 큰 값이 허용됩니다.
insert into ex03 values (1.1, 'bbb', 66, 12.4); -- 1.1 > 들어올수 있음! (소수점은 언제든지 들어와도됨)

insert into ex03 values (6, '한', 66, 12.4);
insert into ex03 values (6, '한글', 66, 12.4);  -- 한글 한글자가 3byte -> 한글로 2글자 들어오니까 오류남

--------------------------------------------------------------------------------------------------------------

-- < 테이블 만들기 >
create table ex04(
	num number,     -- 정수가 최대 40자리 이하
	name char(3),   -- 국문 1글자 / 영문 3글자
	nalja date      -- 날짜
);

-- < 테이블 전체 확인 >
select * from ex04;

-- < 만든 테이블에 값 넣기 >
-- (날짜) 디폴트시간 0시0분0초 로 들어감
insert into ex04 values (1, 'abc', '2022/01/19');
insert into ex04 values (2, 'abc', '2022-01-19');
insert into ex04 values (3, 'abc', '20220119');

-- 현재날짜,현재시간 함수 ▶ sysdate
-- 알던 함수는 ()괄호가 있는데 없는건, 어규먼트값이 없으면 안들어감 
insert into ex04 values (4, 'now', sysdate);


--------------------------------------------------------------------------------------------------------------

-- < 테이블 만들기 >
create table ex05 (num number); -- 정수가 최대 40자리 이하

-- < 테이블 전체 확인 >
select * from ex05;

-- 데이터 넣기
insert into ex05 values (1111);
insert into ex05 values (2222);
insert into ex05 values (3333);

-- 있는 테이블 변경 (ALTER)
-- ▶ 새로운 컬럼 추가 (◆ add)
--   : 기존의 데이터가 있는데 새로운 컬럼이 추가되니 없으면 null로 기본값 됨
alter table ex05 add name varchar2(3); -- 국문 1글자 / 영문 3글자

-- ▶ 있는 컬럼 변경 (내부에서는 삭제가 일어나고 생성되는것임) (◆ modify)
--   : 기존데이터 바이트값보다 더 줄이면 당연히 값의 누락이 되서 오류떨어짐 (최대를 기준)
--     inser into ex05 values (4444, 'abc');
--     alter table ex05 modify name varchar2(3); ▶ (1) 이렇게 안된다는것 → 'abc' 영문 3글자 3byte 이기 때문(최소 3이상부터가능)
alter table ex05 modify name varchar2(6);  -- 국문 2글자 / 영문 6글자

-- ▶ 있는 컬럼 삭제 (◆ drop column)
alter table ex05 drop column name; -- name 컬럼 삭제

-- < 테이블 삭제 > 
--   : 테이블 자체를 삭제함 ㄷㄷ
drop table ex05; 

-- < 테이블 이름 변경 >  ▶ rename
--   : 있는거 변형이니까 alter가 앞에 붙는것임
alter table ex05 rename to ex55;
select * from ex55;

-- < 테이블에 있는 내용을 날릴때 > ▶ truncate
-- delete from 은 조건검사를 하면서 하나씩 지움 → 데이터가 많으면 뭐가 지워지는지 눈에 보임(느림)
-- truncate 가르키는 포인터가 아예 잘라버림 (가르키는게 없다) → 데이터가 많던 적던 속도가 빠름
truncate table ex55;

--------------------------------------------------------------------------------------------------------------

-- < 내 계정에서 모든 테이블 확인 >
select * from tab;
-- < 테이블명만 확인 >
select tname from tab;

-- < 테이블에 정의된 컬럼 확인 & 데이터타입까지도 확인 가능 >
--   : 스키마 정의된 순서대로 나옴 
--   : 콘솔(cmd)에서만 가능 / 이클립스에서는 안보임
desc ex04;



