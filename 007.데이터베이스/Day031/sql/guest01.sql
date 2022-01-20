-- 테이블 만들기
create table guest01(
	msg varchar2(2000),
	nalja date -- 날짜를 기준으로 오더바이

);

-- 더미데이터
insert into guest01 values ('test1', sysdate);
insert into guest01 values ('test2', sysdate);
insert into guest01 values ('test3', sysdate);
insert into guest01 values ('test4', sysdate);
insert into guest01 values ('test5', sysdate);

-- 세미콜론 빼고 실행
commit;

-- 잘들어갔는지 테스트
select * from guest01 order by nalja;

-- 드라이버등록전에 서버 연결 끊기!