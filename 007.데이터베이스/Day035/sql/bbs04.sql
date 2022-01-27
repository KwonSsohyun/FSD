-- ▶ 테이블 지우기
drop table bbs04;

-- ▶ 테이블 만들기
create table bbs04(
	num number primary key,
	name varchar2(30),
	sub varchar2(30),
	content varchar2(2000),
	nalja date
);

-- ▶ 시퀀스 만들기
create sequence bbs04_seq;


-- ▶ 값 넣기 (100개 데이터 만들어내야함) 
--   엑셀에서 만들고, 복사하고 cmd에 붙혀넣고 commit; 까지 해야한다. 그래야 여기에도 반영됨
--   ▶ 데이터마이그레이션을 활용해서 하자! (ex 엑셀)
--     insert into bbs04 values (bbs04_seq.nextval, 'tester', 'test1', 'test', sysdate);
--     nsert into bbs04 values (bbs04_seq.nextval, 'tester', 'test2', 'test', sysdate); -- 이렇게 'test2' 숫자 올리고 싶다.
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test1', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test2', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test3', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test4', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test5', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test6', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test7', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test8', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test9', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test10', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test11', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test12', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test13', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test14', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test15', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test16', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test17', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test18', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test19', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test20', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test21', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test22', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test23', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test24', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test25', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test26', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test27', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test28', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test29', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test30', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test31', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test32', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test33', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test34', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test35', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test36', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test37', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test38', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test39', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test40', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test41', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test42', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test43', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test44', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test45', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test46', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test47', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test48', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test49', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test50', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test51', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test52', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test53', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test54', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test55', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test56', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test57', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test58', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test59', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test60', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test61', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test62', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test63', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test64', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test65', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test66', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test67', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test68', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test69', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test70', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test71', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test72', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test73', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test74', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test75', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test76', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test77', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test78', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test79', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test80', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test81', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test82', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test83', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test84', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test85', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test86', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test87', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test88', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test89', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test90', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test91', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test92', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test93', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test94', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test95', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test96', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester01', 'test97', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester02', 'test98', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester03', 'test99', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test100', 'test', sysdate);
insert into bbs04 values (bbs04_seq.nextval, 'tester04', 'test101', 'test', sysdate);

-- ▶ 테이블 확인
select * from bbs04;
-- ▶ 커밋
commit;

select rownum as rn, deptno, dname from dept;

