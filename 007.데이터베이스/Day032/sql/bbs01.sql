-- << 테이블 만들기 >>
create table bbs01 (
		num number,
		sub varchar2(30), -- 10자기준 한글이니까 3byte * 10 = 30
		nalja date,
		content varchar2(2000)
);


-- << 더미데이터 넣기 >>
insert into bbs01 values (1, 'test1', sysdate, 'test content');
insert into bbs01 values (2, 'test2', sysdate, 'test content');
insert into bbs01 values (3, 'test3', sysdate, 'test content');
insert into bbs01 values (4, 'test4', sysdate, 'test content');
insert into bbs01 values (5, 'test5', sysdate, 'test content');
insert into bbs01 values (6, 'test6', sysdate, 'test content');


-- << 커밋 >>
commit


-- << 데이터 확인 >>
select * from bbs01;

-- 최대값 뽑아냄
select max(num) from bbs01;
-- 나는 한개 더한값 필요하니까
select max(num)+1 from bbs01;








