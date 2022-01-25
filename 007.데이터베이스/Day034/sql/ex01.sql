-- ≪ 테이블 만들때 제약조건 만들기 ≫
--   : 데이터베이스 제약조건 (벨류데이션)
--     중복값이나 특정값 안들어가게 하기

-- 기존테이블들 지움
drop table ex05;

-- ▶ 테이블 만들기
create table ex01(
	num1 number not null,       -- null ▶ 비허용 not null
	num2 number,
	name varchar2(10) not null, -- null ▶ 비허용 not null
	sub varchar2(10)
);

-- ▶ 값 입력
insert into ex01 values (1000, 1111, 'test1', 'test2');
insert into ex01 values (2000, null, 'test1', null);  -- null만 아니면 입력됨.
insert into ex01 (num1, name) values (3000, 'test2'); -- null만 아니면 입력됨. (꼭 해당 null 안되게 값 줘야함)
insert into ex01 values (4000, 4444, '', '');         -- 문자열 비어있으면, null 이라 불가능 xxxxx
insert into ex01 values (4000, 4444, 'null', '');     -- 문자열 그대로 그냥 문자가 null 이건 가능 ooooo
insert into ex01 values (5000, '', 'test1', 'test2'); -- 숫자 '' → null / 0이면 0이지 null이 아님

insert into ex01 values ('7000', '7777', 'test1', 'test2'); -- 숫자임에도 불구하고, 문자열넣어도 가능하다.
                                                            -- ▶ 문자열을 사용했지만, 숫자다. (테이블에서 숫자로 데이터타입 사용함)
                                                            --   함수형언어이기 때문. (문자열언어)
                                                            --   자신없으면 문자열 사용해도 됨.

-- ▶ 확인
select * from ex01;


-----------------------------------------------------------------------------------------------------------------------------------------

-- ≪ 중복 불허 ≫
--   : 유니크 → 동일한 컬럼에서 같은 값이 있으면 허용을 안함

-- ▶ 테이블 만들기
create table ex02(
	num1 number unique,       -- unique ▶ 중복 비허용 
	num2 number,
	msg1 varchar2(10) unique, -- unique ▶ 중복 비허용
	msg2 varchar2(10)
);


-- ▶ 값 입력
insert into ex02 values (1111, 1111, 'test1', 'test1');
insert into ex02 values (2222, 2222, 'test2', 'test2');
insert into ex02 values (3333, 3333, 'test3', 'test3');

insert into ex02 values (2222, 2222, 'test2', 'test2'); -- 중복나게 값 넣음 (오류 xxxxx)
                                                        -- 제약조건에 걸림 (값 중복)
insert into ex02 values (4444, 2222, 'test2', 'test4'); -- 같은 문자열 들어와서 걸림 (오류 xxxxx)

insert into ex02 values (4444, 4444, null, 'test4'); -- null은 값이 아니기 때문에 중복이 아님 (가능 ooooo)
insert into ex02 values (5555, 4444, null, 'test4'); -- 유니크는 중복을 허용하지 않을 뿐, null은 허용
                                                     -- (둘다 허용싫으면) unique 와 not null 을 같이 주면된다.

-- ▶ 확인
select * from ex02;


-----------------------------------------------------------------------------------------------------------------------------------------

-- ≪ null값 & 동일값 불허 ≫
--   : primary key → 유일키 값 
--     유니크(unique) 하고 낫널(not null)
--     → 레코드를 선별할 수 있는 기준 다른레코드와 구분되는 당연히 값이 있어야하고, 기존값과 중복되면 안됨
--     ▶ 테이블 당 하나의 컬럼만 가능 (index라는 옵션도 가지고 있다.)(하나만 부여가능 - 신중)
--       다중으로 주고 싶다면 unique not null

-- ▶ 테이블 만들기
create table ex03(
	num1 number primary key,           -- primary key ▶ 유니크(unique) & 낫널(not null) | 다중부여안됨(테이블당 하나의 컬럼)
	num2 number unique not null,
	msg1 varchar2(10) unique not null, -- unique not null ▶ 중복 & null 비허용
	msg2 varchar2(10)
);

-- ▶ 값 입력
insert into ex03 values (1111, 1111, 'test1', 'test1');
insert into ex03 values (2222, 2222, 'test2', 'test2');
insert into ex03 values (3333, 3333, 'test3', 'test3');

insert into ex03 values (4444, 2222, 'test4', 'test4'); -- 기존에 값이 있으니 제약조건 걸림 (불가 xxxxx)
insert into ex03 values (4444, null, 'test4', 'test4'); -- null 제약조건 걸림 (불가 xxxxx)

insert into ex03 values (null, 5555, 'test4', 'test4'); -- null 제약조건 걸림 (불가 xxxxx)
insert into ex03 values (2222, 5555, 'test4', 'test4'); -- 기존에 값이 있으니 제약조건 걸림 (불가 xxxxx)


-- ▶ 확인
select * from ex03;

-----------------------------------------------------------------------------------------------------------------------------------------

-- ≪ 자식테이블에서 부모테이블 컬럼값들만 사용하기 ≫
--   : foreign key 
--     자식테이블 필드에서 → 부모테이블 필드 참조해서 해당 값만 사용하고 싶다면 
--     ▶▶ references 부모테이블명(컬럼명)

-- ▶ 테이블 만들기 (2개 필요)
-- ▶▶ 부모 테이블
create table ex04(
	num1 number primary key, -- primary key ▶ 유니크(unique) & 낫널(not null) | 다중부여안됨(테이블당 하나의 컬럼)
	num2 number
);
-- ▶▶ 자식 테이블 
create table ex05(
	num1 number primary key, -- primary key ▶ 유니크(unique) & 낫널(not null) | 다중부여안됨(테이블당 하나의 컬럼)
	num2 number references ex04(num1) -- 부모에 num1 에 있는 값만 넣을 수 있다.
	                                  -- 자식테이블에서 부모 참조하고 싶다면 ▶▶ references 부모테이블명(컬럼명)
);


-- ▶ 값 입력
insert into ex04 values (1111, 1111);
insert into ex05 values (1111, 1111); -- 무결성 제약 걸림 (부모 키가 없습니다.) (이것부터 실행해서임 부모실행안하고)
                                      -- 부모 해당 참조하는 값이 있어야 쓸 수 있다. 
                                      -- 부모의 그 해당하는 타입에 값이 배정되어 있어야, 그값에 한에서만 사용가능
                                      -- 부모의 있는 값들만 올 수 있다.
                                  
insert into ex04 values (2222, 2222);
insert into ex04 values (3333, 3333);
insert into ex05 values (2222, 2222);
insert into ex05 values (3333, 3000); -- 수행안됨


-- ▶ 테이블 지우기
drop table ex05; -- ex05를 먼저 지우고 (자식을 먼저 지워야함)
drop table ex04; -- ex04를 다음에서야 지울 수 있다.


-----------------------------------------------------------------------------------------------------------------------------------------

-- ≪ 체크 조건 ≫
--   : 조건을 만족하는 것만 올 수 있다.
--     ▶▶ check (해당필드명 in (선택할수 있는 항목 데이터형식맞게))

-- ▶ 테이블 만들기
create table ex06(
	num1 number primary key, 
	name varchar2(10),
	gender char(3) check (gender in ('남', '여')) -- 갯수가 정해져있을때, 선택해서 사용
	                                              -- ▶▶ check (해당필드명 in (선택할수 있는 항목 데이터형식맞게))
);

-- ▶ 값 입력
insert into ex06 values (1111, 'test1', '남');
insert into ex06 values (2222, 'test2', '여');

insert into ex06 values (3333, 'test3', '외');  -- 제약조건에 걸림 
                                                -- check 선언이 안되어있어서 걸림
                                                -- in 키워드 -> 집합 중 선택
                                                -- in(선택할 수 있는 항목)

-- ≪ 범위설정 ≫ 
create table ex07(
	num1 number primary key, 
	name varchar2(10),
	age number check (age between 1 and 80) -- 범위 설정도 가능
	                                        -- ▶▶ check (해당필드명 in (선택할수 있는 항목 데이터형식맞게))
);

-- ▶ 값 입력
insert into ex07 values (1, 'test1', 1);
insert into ex07 values (2, 'test2', 10);
insert into ex07 values (3, 'test3', 15);
insert into ex07 values (4, 'test4', 80);

insert into ex07 values (5, 'test5', 0); -- 범위 벗어나면 안됨 (제약조건 위배 xxxxx)

-----------------------------------------------------------------------------------------------------------------------------------------

-- ≪ 디폴트 ≫
--   : null을 집어넣어야 null
--     아예 값을 안집어넣어야 디폴트값 들어간다.

-- ▶ 테이블 만들기
create table ex08(
	num1 number primary key, 
	num2 number default 100,
	sub varchar2(12) default '제목없음' 
);

-- ▶ 값 입력
insert into ex08 values (1111, 1111, 'test1'); -- 1111 | 1111 | test1
insert into ex08 (num1) values (2222);         -- 2222 | 100  | 제목없음 ▶ 디폴트값 들어간다.

insert into ex08 values (3333, null, null); -- null을 입력하면 null이 들어간다.


-- ▶ 확인
select * from ex08;

-----------------------------------------------------------------------------------------------------------------------------------------


-- ≪ 제약조건 명명법 ≫
--   : 이름이 있으면, 제약조건 뺐다 넣었다 할 수 있다.
--     ▶▶ constraint 테이블명_컬럼명_제약조건

--     제약조건 이름 붙힌다. 
--     └ 이름 안정하면 랜덤하게 부여 
--       → 계정명.SYS_랜덤한숫자


-- ▶ 테이블 만들기
create table ex09(
	num1 number, 
	num2 number,
	msg1 varchar2(10),
	msg2 varchar2(10) constraint ex09_msg2_nn not null,
	                                                                -- ≪ 제약조건에 이름 부여가능 ▶ constraint ≫
	constraint ex09_num1_pk primary key(num1),                      --   뒤늦게 제약조건을 줄때 → (num1) 에다가 줌
	constraint ex09_msg1_uq unique(msg1),                           --   뒤늦게 제약조건을 줄때 → (num1) 에다가 줌
	constraint ex09_num2_fk foreign key(num2) references ex08(num1) --   num2 는 ex08테이블에 있는 num1컬럼에 정의된 값들에 대해서 사용한다.
	                                                                --   이때 따로 할때는 앞에 foreign 을 붙힌다.
);


insert into ex09 values (1111, 1111, 'test1', 'test1');
insert into ex09 values (2222, 9999, 'test2', 'test1');
insert into ex09 values (3333, 9999, 'test1', 'test1');
insert into ex09 values (4444, 1111, 'test1', 'test1');


-- ≪ 제약조건 없애버림 ≫
--   : 테이블 수정 (alter table)
--   : 해당필드는 그대로 있고, 제약조건을 날린 아무런 제약 없는 필드가 된것임
--     그러니 이렇게 쉽게 하려면 제약조건줄 때 이름이 있어야 한다.
alter table ex09 drop constraint ex09_num2_fk;
alter table ex09 drop constraint ex09_msg1_uq;
alter table ex09 drop constraint ex09_num1_pk;


-- ≪ 제약조건 살리기 ≫
--   1. 컬럼 새로 추가하기 (제약조건 붙혀서) 
--   2. 컬럼 수정 (따로 집어넣기 - 테이블수정)

-- ▶ 있는 컬럼에 → 제약조건 추가를 하며, 제약조건에 대한 이름도 같이 부여함
--   제약조건이 있냐없냐 존재의 유무기 때문에  
--   : drop과 add만 존재
alter table ex09 add constraint ex09_num1_pk primary key(num1); 
-- alter table ex09 add primary key(num1);


-- ▶ 확인
select * from ex09;

-----------------------------------------------------------------------------------------------------------------------------------------











