-- ▶ 기존 테이블 지우기
drop table bbs03;
drop sequence bbs03_seq;


-- ▶ 테이블 만들기
create table bbs03(
	num number primary key,     -- null & 중복되는값 안됨
	sub varchar2(30),           -- 한글 10자기준 
	id varchar2(20) not null,   -- 작성자 null 안뜨게 not null 걸기 (우선권)
	                            -- (데이터베이스에 아예 들어올 수 없다.)(익셉션을 통해 사용자 에러코드 안보이게하기)
	                            -- catch(SQLException e){ ///// }
	nalja date default sysdate, -- 값 입력안할시 | 디폴트 현재시간
	cnt number(10) default 0,    -- 정수 10자리 가능 -- 값 입력 안할시 | 디폴트 0
	content varchar2(2000)
);


-- ▶ 시퀀스 생성
--   : 글번호 새로운 숫자 부여
create sequence bbs03_seq;


-- ▶ 더미데이터 입력
insert into bbs03 (num,sub,id,content) values (bbs03_seq.nextval, '제목없음', 'user1', 'test'); -- 값 안 넣은 nalja, cnt 것은 설정한 디폴트값 적용됨.
insert into bbs03 (num,sub,id,content) values (bbs03_seq.nextval, '제목없음', 'user2', 'test');
insert into bbs03 (num,sub,id,content) values (bbs03_seq.nextval, '제목없음', 'user3', 'test');
insert into bbs03 (num,sub,id,content) values (bbs03_seq.nextval, '제목없음', 'user4', 'test');
insert into bbs03 (num,sub,id,content) values (bbs03_seq.nextval, '제목없음', 'user5', 'test');

-- ▶ 커밋
commit;

-- ▶ 확인
select * from bbs03;