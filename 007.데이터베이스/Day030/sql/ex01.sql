-- 잘 나오는지 확인용
-- tab 은 테이블 중에 → tname 출력하겠다.
-- 오라클데이터베이스는 테이블로 시작해서 테이블로 끝난다.
select tname from tab;

-- DML (select, insert, update, delete) - CRUD
select * from dept;

-- 입력
-- ▶ insert into 테이블명 (컬럼명,...) values (값,...);
insert into dept (deptno, dname, loc) values (50, 'add1', 'add2');

-- 삭제 
-- ▶ delete from 테이블명 where 조건;
-- (50인것 다 삭제됨)
delete from dept where deptno = 50;
-- 조건을 안주면 ★ 모든 되어버려서 ★ 데이터데이터 모두 날아감 ㅠ
delete from dept

-- 수정
-- ▶ update 테이블명 set 컬럼명=값,... where 조건;
-- 조건(where) 없으면 전체 레코드가 이렇게 변함
update dept set dname = 'AA', loc = 'BB'; 
update dept set dname = 'AA', loc = 'BB' where deptno=50;

--------------------------------------------------------------------------
-- ★ (추가) (※ 앞에 컬럼명 명시 안할 시) 주의 사항 
-- DML (select, insert, update, delete) - CRUD
select * from dept;

-- 와이드처리했을때 컬럼 순서에 따라서 값을 줘야 한다.
-- 컬럼 갯수만큼 값을 줘야한다. (없다고 해서 Null이 되는것이 아니다.)
-- 안주고 싶으면 null 기입해야함 / 혹은 빈문자열 '' (결론! 갯수 맞춰!)
insert into dept values (60, 'CC', 'DD');
insert into dept values (60, 'CC', null); insert into dept values (60, 'CC', '');

--------------------------------------------------------------------------

-- 60이상 지워라 (조건을 만족하는 모든 레코드는 다 날아감)
delete from dept where deptno>60
-- 50,60 만 지워라 (선택적) -> 숫자가 아니어도 다중의 값 선택 가능
delete from dept where deptno in(50,60);
-- 50~60 범주 지워라
delete from dept where deptno between 50 and 60;
-- dname 이 두 글자인것을 지워라
delete from dept where dname like '__';


