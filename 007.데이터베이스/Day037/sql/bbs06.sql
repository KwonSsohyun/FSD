-- ▶ 테이블 지우기
drop table bbs06;
-- ▶ 시퀀스 지우기
drop sequence bbs06_seq;


-- ▶ 테이블 생성
create table bbs06(
	num number primary key,
	id varchar2(30),
	nalja date,
	sub varchar2(30),
	content varchar2(2000)
);

-- ▶ 시퀀스 생성
create sequence bbs06_seq;

-- ▶ 값 넣기
insert into bbs06 values (bbs06_seq.nextval, 'user1', sysdate, '테스트1', '테스트');
insert into bbs06 values (bbs06_seq.nextval, 'user2', sysdate, '테스트2', '테스트');
insert into bbs06 values (bbs06_seq.nextval, 'user1', sysdate, '테스트3', '테스트');
insert into bbs06 values (bbs06_seq.nextval, 'user2', sysdate, '테스트4', '테스트');
insert into bbs06 values (bbs06_seq.nextval, 'user3', sysdate, '테스트5', '테스트');

-- ▶ 커밋
commit;

-- ▶ 테이블 보기
select * from bbs06;



