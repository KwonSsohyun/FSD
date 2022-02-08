-- ▶ 테이블 지우기
drop table bbs07;

-- ▶ 테이블 생성
create table bbs07(
	num number,
	name varchar2(30),
	kor number,
	eng number,
	math number
);

-- ▶ 값 생성 
insert into bbs07 values (95, '권소현', 80, 69, 70);
insert into bbs07 values (92, '토팔이', 40, 29, 50);
insert into bbs07 values (88, '안정식', 20, 30, 80);
insert into bbs07 values (97, '토순이', 68, 50, 40);
insert into bbs07 values (93, '토깽이', 60, 30, 50);

-- ▶ 커밋
commit;

-- ▶ 테이블 확인
select * from bbs07;

select num, name, kor, eng, math from bbs07 order by num desc;
