-- ▶ 테이블 지우기
drop table user06;
-- ▶ 시퀀스 지우기
drop sequence user06_seq;


-- ▶ 테이블 생성
create table user06(
	num number primary key, -- 중복, null 안됨 (다만, 테이블당 하나만 가능)
	id varchar2(30) unique not null, -- 중복, null 안됨
	pw varchar2(30) not null,
	name varchar2(30) not null,
	age number(3)
);

-- ▶ 시퀀스 생성
create sequence user06_seq;

-- ▶ 값 넣기
insert into user06 values (user06_seq.nextval, 'user01', '1234', '홍길동', 41);
insert into user06 values (user06_seq.nextval, 'user02', '1234', '김길동', 21);
insert into user06 values (user06_seq.nextval, 'user03', '1234', '박길동', 36);

-- ▶ 커밋
commit;

-- ▶ 테이블 보기
select * from user06;
