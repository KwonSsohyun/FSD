--------------------------------------------------------------------------------------------------------------------

-- < 단일행 함수 → 문자함수 >

--   LOWER 		: 소문자로 변환한다.
--   UPPER 		: 대문자로 변환한다.
--   INITCAP 	: 첫 글자만 대문자로 나머지 글자는 소문자로 변환한다.
--   CONCAT 	: 문자의 값을 연결한다.
--   SUBSTR 	: 문자를 잘라 추출한다. (한글 1Byte)
--   SUBSTRB 	: 문자를 잘라 추출한다. (한글 2Byte)
--   LENGTH 	: 문자의 길이를 반환한다.(한글 1Byte)
--   LENGTHB 	: 문자의 길이를 반환한다.(한글 2Byte
--   INSTR 		: 특정 문자의 위치 값을 반환한다.(한글 1Byte)
--   INSTRB 	: 특정 문자의 위치 값을 반환한다.(한글 2Byte)
--   LPAD, RPAD : 입력 받은 문자열과 기호를 정렬하여 특정 길이의 문자열로 반환한다.
--   TRIM 		: 잘라내고 남은 문자를 표시한다.
--   CONVERT 	: CHAR SET을 변환한다.
--   CHR ASCII 	: 코드 값으로 변환한다.
--   ASCII 		: ASCII 코드 값을 문자로 변환한다.
--   REPLACE 	: 문자열에서 특정 문자를 변경한다.


select 'aAbBcCD' from dual;
-- 소문자 변환
select lower('aAbBcCD') from dual;
-- 대문자 변환
select upper('aAbBcCD') from dual;
-- 혼합
select 'aAbBcCD', lower('aAbBcCD'), upper('aAbBcCD') from dual;

select ename, empno, sal from emp where ename = 'SCOTT';        -- 벨류값과 동일하게 꼭 대문자 써야함 
select ename, empno, sal from emp where lower(ename) = 'scott'; -- 조건 → name 컬럼 전체를 소문자로 바꿔서 조건을 검색 (실제 값을 바꾼건 아님)


-- 첫글자를 대문자로하고 나머지 소문자 (띄어쓰기 기준)
select initcap('aAbBcCD') from dual;  -- Aabbccd
select initcap('aAbB cCD') from dual; -- Aabb Ccd

-- 문자열 더하기 (2개만 컴마 가능)
select concat('문자', '열') from dual;
select concat('문', concat('자', '열')) from dual;  -- 문 + 자 + 열 -> 이렇게 3개도 붙힐 수 있다.

-- substr  문자 뽑아내기 (기존방식 동일)
select substr('aAbBcCD', 1, 3) from dual; -- 1부터 3까지만 해당글자 뽑아냄 (쿼리는 1부터 셈) -- aAb

-- substrb b 바이트를 가지고 계산을 하겠다. (1,6) -> 한글로 2글자 추출 가능 
-- 테이블에 입력시 데이터형식을 정하는데 넘어가면 이걸로 잡아줄 수 있다.
select substrb('aAbBcCD', 1, 3) from dual; -- aAb
select substr('한글로작성', 1, 3) from dual;   -- 한글로
select substrb('한글로작성', 1, 3) from dual;  -- 한 (한글 한글자 3byte)
select substrb('한글로작성', 1, 6) from dual;  -- 한글


-- 길이를 반환
select length('aAbBcCD') from dual;     -- 7
select lengthb('aAbBcCD') from dual;    -- 7

select length('한글로작성') from dual;  -- 5
select lengthb('한글로작성') from dual; -- 15 (3*5=15)

-- 해당글자 인덱스 찾아줌 (첫시작지점)
select instr('aAbBcCD', 'b') from dual; -- 3 
select instrb('aAbBcCD', 'b') from dual; -- 3

select instr('한글로작성', '로') from dual; -- 3 
select instrb('한글로작성', '로') from dual; -- 7 (한     | 글     | 로 )
                                             --     1 2 3 |  4 5 6 | 7
                                             
-- 값 바꿔치기
select replace ('한글로작성', '로', '만') from dual; -- 한글만작성

-- left 값이 왼쪽에 붙고
select lpad('abc', 10, '#') from dual; -- #######abc (총 10글자) - 규격맞추는 금융권에서도 쓰임
-- rigth 값이 오른쪽에 붙고
select rpad('abc', 10, '#') from dual; -- abc#######


-- 트림
select lpad(rpad(trim('    ab  c    '),20,'#'),30,'#') from dual; -- ##########ab  c###############
-- 디폴트
select trim(' ' from ' abcd  ') from dual;
-- 특정 없애기
select trim('#' from '###abcd####') from dual; -- abcd 값추출 -> '#' from 을 없애기로 해서 #이 사라짐 


--------------------------------------------------------------------------------------------------------------------

-- < 단일행 함수 → 숫자함수 >

--   ABS      : 절대값을 반환한다.
--   COS      : COSINE 값을 반환한다.
--   EXP      : e (2.71828183…)의 n승을 반환한다.
--   FLOOR    : 소수점 아래를 잘라낸다.(버림)
--   LOG      : LOG값을 반환한다.
--   POWER    : POWER(m, n) m의 n승을 반환한다
--   SIGN     : SIGN (n) n<0이면 –1, n=0이면 0, n>0이면 1을 반환한다.
--   SIN 	  : SINE값을 반환한다.
--   TAN 	  : TANGENT값을 반환한다.
--   ROUND    : 특정 자릿수에서 반올림한다.
--   TRUNC    : 특정 자릿수에서 잘라낸다. (버림)
--   MOD      : 입력 받은 수를 나눈 나머지 값을 반환한다.


-- floor - 몫 (소수점아래를 버리는 특징을 이용해서 몫을 구함)
-- mod - 나머지 연산자
select 5/2, floor(5/2), mod(5,2) from dual; 


-- round - 반올림
select round(3.14), round(3.54) from dual; -- 3 | 4

-- trunc - 특정자릿수 잘라냄
-- 디폴트 0 (123.456, 0) 0이 생략된것임
select trunc(123.456) from dual; -- 123
select trunc(123.456 , 1) from dual; -- 123.4
select trunc(123.456 , 2) from dual; -- 123.45
select trunc(123.456 , -1) from dual; -- 120 (마이너스일 경우 1의 자리를 버림)
select trunc(123.456 , -2) from dual; -- 100


--------------------------------------------------------------------------------------------------------------------

-- < 단일행 함수 → 날짜함수 >

--   SYSDATE		  : 시스템 저장된 현재 날짜를 반환한다.
--   MONTHS_BETWEEN   : 두 날짜 사이가 몇 개월인지를 반환한다.
--   ADD_MONTHS	      : 특정 날짜에 개월 수를 더한다.
--   NEXT_DAY		  : 특정 날짜에서 최초로 도래하는 인자로 받은 요일의 날짜를 반환한다.
--   LAST_DAY		  : 해당 달의 마지막 날짜를 반환한다.
--   ROUND			  : 인자로 받은 날짜를 특정 기준으로 반올림한다.
--   TRUNC			  : 인자로 받은 날짜를 특정 기준으로 버림한다.


-- sysdate - 현재 날짜를 반환
select sysdate from dual; -- 2022-01-20
-- 현재일로 입사일(hiredate) 빼기
-- 일을 기준으로 계산
-- 시간의 소수점 빼버리면 순수 날짜만 계산된다. 
select hiredate,sysdate,sysdate-hiredate from emp;

-- 몇개월이 지났는지 계산해 준다. (한달이 안채워진게 있으니 소숫점나오는것)
select months_between(sysdate,hiredate) from emp;

-- 현재날짜에 하루 더함
select sysdate+1 from dual; -- 내일 날짜나옴
select sysdate-1 from dual; -- 어제 날짜나옴

select add_months(sysdate, +1) from dual; -- 다음달 나옴
select add_months(sysdate, -1) from dual; -- 저번달 나옴
select add_months(sysdate, -12) from dual; -- 작년 나옴 (12개월을 뺐으니)

select next_day(sysdate, '토요일') from dual; -- 다가올 요일에 대한 날짜 뽑아줌

select last_day(sysdate) from dual; -- 해당달의 마지막날 뽑아줌 
select last_day(sysdate + 20) from dual; -- 오늘 날짜에서 +20일을 더한 그 시점에서의 그 달의 마지막날 뽑아줌

select round(sysdate) from dual; -- 12시가 넘었기 때문에 반올림 하면 다음날 날짜 나옴
select trunc(sysdate) from dual; -- 12시가 넘었기 때문에 버리면 오늘 날짜 나옴

select round(sysdate, 'mm') from dual; -- 2022-02-01 : 월 초기화
select trunc(sysdate, 'mm') from dual; -- 2022-01-01 : 월 초기화

-- 날짜포멧
-- 월mm 
-- 시간의 분 mi

--------------------------------------------------------------------------------------------------------------------

-- < 변환 함수 >

-- 숫자를 문자열로 바꾸기
select length(to_char(1234)) from dual; --문자열로 됬기때문에 length 쓰는 것 가능

-- 날짜를 문자열로 바꾸기
select to_char(sysdate, 'YY-MM-DD HH:MM:SS') from dual; -- 22-01-20 12:01:13 (날짜포맷 정하기 나름) ('YY-MM-DD HH:MM:SS')
-- select sysdate, 'YY-MM-DD HH:MM:SS' from dual;

-- 문자열을 날짜로 바꾼것
select to_date('220120' , 'YYMMDD')+1 from dual; -- 내가 어떤 포맷을쓴건지 기술해주면 된다.

-- 문자를 숫자로 바꾸는것
select to_number('1234')+1 from dual;


-- 바꾸면서 포맷을 줄수 있다.
-- 0은 다 채우는거고 | 9는 있는 경우에만 표현

select to_char(1234, '999,999') from dual;   -- 1,234
select to_char(1234, '000,000') from dual;   -- 001,234

-- 소숫점이 발생할 경우 0이건 9건 나타낸다.
-- 부호인 +를 나타내고 싶으면 > S기입! 
select to_char(1234, 'S999,999.99') from dual; -- +1,234.00
select to_char(1234, 'L999,999.99') from dual; -- ₩1,234.00


----------------------------------------------------------------------------------------------------------------------------------

-- < 일반 함수 > 

-- NULL과 연산하면 NULL이 나온다.
-- 이를 사전에 방지하려면 어떻게 해야할까?
select null+1234 from dual; --> NULL

-- ▶ NVL(컬럼, 변환 값)
--   : NULL을 치환해주는 함수
--     ⇒ 치환은 수식의 어떤 부분에 그와 대등한 무언가를 바꿔 넣는 행위 
--       nvl(컬럼명,0)  -> 해당컬럼데이터가 null이면 0으로 바꿔라 (숫자형 타입이면, 없으면 0이 맞으니 그말임)
--       단, 바꿔넣을값이 테이블 만들때 해당 컬럼에 정해진 데이터형식과 타입과 똑같아야 한다.
select ename, sal, nvl(comm,0), sal+nvl(comm,0) from emp;
-- < 코드풀이 >
--   ∴ sal컬럼을 보면 null인 값이 없고, comm컬럼에만 null이 존재해서
--     comm에 null이면 0으로 바꿔라 라고 명령은 줬다. ▶ nvl(comm,0)
--     이걸 왜 했냐면, sal에 값이 있어도 null과 연산 취하면 같이 null이 된다... 그래서 null을 치환함
--     이제 sal과 comm의 컬럼을 더해 줄거다.
--     이때도 null값이면 0으로 바꿔라했다.  ▶ sal+nvl(comm,0)

----------------------------------------------------------------------------------------------------------------------------------

-- ▶ DECODE(컬럼명, 비교대상1, 반환값1, 비교대상2, 반환값2, ... , 비교대상N, 반환값N, 디폴트 값) 
--   ⇒ 디폴트 값은 입력하지 않으면 NULL이다.
-- 10일때 관리팀 / 20일때 영업팀 / 30 총무팀 ⇒ 으로 decode에 값 바꿔치기 해라.
select ename, decode(deptno, 10 , '관리팀' , 20,'영업팀' , 30,'총무팀') from emp; -- 그외 조건은 조건식이 없으니 NULL로 표기됨



-- ▶ 케이스문 (위 코드보다 직관적)
-- ▶ case when 조건문 then 바꿀데이터값 (else) end  →  해당케이스 없으면 NULL로 표기됨 (else는 필수기입이 아님)
-- CASE 표현식
--      WHEN 비교대상(조건문)1 THEN 반환값1
--      WHEN 비교대상(조건문)2 THEN 반환값2
--                    ....
--      WHEN 비교대상(조건문)N THEN 반환값N
--
--      ELSE 디폴트값
--
-- END


select ename, 
		case     -- 조건문 -
			when deptno = 10 then '관리팀' -- 만족하면 then 실행
			when deptno = 20 then '영업팀' -- 만족안하면 다음~
			when deptno = 30 then '총무팀'
			else '몰라' -- 이도 저도 모를때
		end
	from emp;


----------------------------------------------------------------------------------------------------------------------------------






