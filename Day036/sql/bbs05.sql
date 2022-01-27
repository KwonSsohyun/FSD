-- ▶ 테이블 지우기
drop table bbs05;
-- ▶ 시퀀스 지우기
drop sequence bbs05_seq;


-- ▶ 테이블 생성
create table bbs05(
	num number primary key,
	sub varchar2(30),
	id varchar2(30) not null,
	cnt number default 0,
	content varchar2(2000),
	-- 답글기능
	grp number,
	ord number default 0, -- 인서트값 넣을때 안줘도 됨, 디폴트니까.
	dep number default 0
);

-- ▶ 시퀀스 생성
create sequence bbs05_seq;

-- ▶ 값 생성 
--   디폴트는 안줌
insert into bbs05 (num,sub,id,content,grp) values (bbs05_seq.nextval, '테스트1', 'guest', 'test', bbs05_seq.currval);
insert into bbs05 (num,sub,id,content,grp) values (bbs05_seq.nextval, '테스트2', 'guest', 'test', bbs05_seq.currval);
insert into bbs05 (num,sub,id,content,grp) values (bbs05_seq.nextval, '테스트3', 'guest', 'test', bbs05_seq.currval);
insert into bbs05 (num,sub,id,content,grp) values (bbs05_seq.nextval, '테스트4', 'guest', 'test', bbs05_seq.currval);
insert into bbs05 (num,sub,id,content,grp) values (bbs05_seq.nextval, '테스트5', 'guest', 'test', bbs05_seq.currval);


-- ▶ 커밋
commit;

-- 글출력 -> 그룹순
select * from bbs05 order by grp desc, ord asc;

---------------------------------------------------------------------------------------------------------------

-- 답글 인서트 (ex:4번글 댓글)
-- ▶▶ 답글 (ord = 0)
--    : 답글을 달면 ord = 디폴트0 + 1 한다.
--      진짜 순수 글은 ord가 0이다. 
--      그니까 답글은 dep은 기존값 보고 +1 해야함
insert into bbs05 (num,sub,id,content,grp,ord,dep) 
		values (bbs05_seq.nextval, '답글1', 'guest', 'test', 4, (select max(ord)+1 from bbs05 where grp=4), 0+1);

---------------------------------------------------------------------------------------------------------------
	
-- ▶▶ 답글의 답글 (ord != 0)
--    : 예를 들면 순수글은 4번(ord=0) ▶ 4번게시글의 답글이 1(ord=1),2(ord=2),3(ord=3) 개가 있다고 하자
--      근데 답글의 답글을 달려는데, 나는 4번게시글의 답글중 2번답글에 답글을 달거다.

--      그럼 2번답글의 ord의 숫자를 가져오고 ▶ (ord=2)
--      거기 뒤로 내가 적을 답글을 끼워넣을거니까.
--      뒤에 3번 (ord=3)이 이미 있으니, 이값을 ord 숫자를 올려야,
--      내가 (ord=3)을 배정 받아서 껴들수 있다.

--      ■ ord>param
--        그러니 2번답글 가져왔던 ▶ (ord=2)에서
--        조건을 건다. ▶ (ord=2)보다 크냐? ⇒ +1 을 시켜서 만약 뒤에 있는 답글들도 숫자 다 올려서 중복없게 하고
--        이제 2보다 큰 숫자 +1씩 다 올렸으니 

--      ■ param+1
--        ▶ (ord=3)이라는 숫자를 써서 내가 껴들 수 있다.
--          아까 2번 답글 가져왔던 ▶ (ord=2) 에서 + 1을 한 숫자를 내가 가진다.

-- ord != 0 	
-- param은 ord
update bbs05 set ord=ord+1 where grp=4 and ord>param;
insert into bbs05 (num,sub,id,content,grp,ord,dep) values (bbs05_seq.nextval, '답글1', 'guest', 'test', 4, param+1, 0+1);	
	
---------------------------------------------------------------------------------------------------------------

-- ▶ 값 확인
select * from bbs05;

-- ▶ 조회수 올리기
update bbs05 set cnt=cnt+1 where num=1;












