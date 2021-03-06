-- create table (테이블 만들기)
create table stu01(
	num number,       -- (num ▶ 컬럼명) 정수자릿수 최대 40자리 (소수점, 부호 가능)
	name varchar2(9), -- 3글자 한글이름 (한글 한글자당 3byte)  3byte X 3 = 9
	kor number(3),    -- 100점생각해서 3자리정수
	eng number(3),
	math number(3)
);

-- 더미 데이터
insert into stu01 values (1, '강길동', 90, 80, 70);
insert into stu01 values (2, '홍길동', 56, 30, 60);
insert into stu01 values (3, '박길동', 70, 23, 20);
insert into stu01 values (4, '권길동', 100, 46, 80);

-- 전체 확인
select * from stu01;

commit;

-- 자바에서 쓴 코드 잘 나오나 확인
-- select * from stu01 order by num asc;
-- insert into stu01 values (5, 'ㅇㄹ',34,23,12);