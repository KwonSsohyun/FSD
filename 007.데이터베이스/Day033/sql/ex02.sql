-- 웬만하면, 띄어쓰기 넣지 말아라 (배치문에서 해당파일 그냥 실행할 수도 있기 때문)
-- ▶ 기존에 '테이블' 있으면 지우기
drop table bbs02;
-- ▶ 기존에 '시퀀스' 있으면 지우기
drop sequence bbs02_seq;

------------------------------------------------------------------------------
-- ▶ 테이블 만들기
create table bbs02(
	num number,
	sub varchar2(30),
	content varchar2(2000),
	nalja date
);

-- ▶ 넘버 자동 부여 -> 시퀀스 필요
create sequence bbs02_seq;
------------------------------------------------------------------------------

-- ▶ 더미데이터 넣기
insert into bbs02 values (bbs02_seq.nextval, 'test1', 'test', sysdate);
insert into bbs02 values (bbs02_seq.nextval, 'test2', 'test', sysdate);
insert into bbs02 values (bbs02_seq.nextval, 'test3', 'test', sysdate);
insert into bbs02 values (bbs02_seq.nextval, 'test4', 'test', sysdate);
insert into bbs02 values (bbs02_seq.nextval, 'test5', 'test', sysdate);

-- ▶ 커밋
commit;

-- ▶ 출력 확인용
select * from bbs02;





