-- ▶ 시퀀스 지움
drop sequence ex01_seq;  

-- ▶ 시퀀스 기본 생성
create sequence ex01_seq;


-- ▶ 해당 시퀀스의 값을 증가시키고 싶다면?
-- ▶▶ .nextval
select ex01_seq.nextval from dual; -- 1찍힘
select ex01_seq.nextval, ex01_seq.nextval from dual; -- 두번 불러냈기에 카운팅이 가버린다. (다음숫자 → 다음숫자)


-- ▶ 카운팅하지 않고, 현재 시퀀스를 알고 싶다면?
-- ▶▶ .currval
--     → 단, 시퀀스 생성 이후에 반드시 한번 이상의 nextval 호출이 사전에 있었어야 함.
select ex01_seq.currval from dual;




-- ▶ 특정숫자로 시작하고 싶다면 
--    ▶▶ start with 시작숫자
create sequence ex02_seq start with 10; -- 10으로 시작하는, 시퀀스 생성
select ex02_seq.nextval from dual; -- 확인 (10으로 나옴)
-- ▶ 시퀀스 지움
drop sequence ex02_seq;  



-- ▶ 얼마만큼의 증가량 설정 
--    ▶▶ increment by 증가량숫자
create sequence ex03_seq increment by 10; -- 10씩 증가
select ex03_seq.nextval from dual; -- 확인
-- ▶ 시퀀스 지움
drop sequence ex03_seq;  

---------------------------------------------------------------------------------------------------------------------------------------------------------

-- ▶ 사이클 도는 시퀀스 생성
--   1) nocache             : 노캐쉬여야 사이클이 가능하다.
--   2) cycle               : 사이클 돌릴거니까 사이클 붙혀준다.
--   3) start with 시작숫자 : 특정숫자로 첫 시작 (오직 첫번째 시작점이다.) (2번째부터는 minvalue에 설정한 숫자로 시작) 
--   4) minvalue 숫자       : start with 시작숫자설정 안하면, minvalue에 설정한 숫자부터 시작 
--                            start with 시작숫자 설정 있다면, 2번째 사이클부터는  minvalue 숫자에서부터 시작
--   5) maxvalue 끝숫자     : 설정한 끝숫자 만나면 다시 minvalue에 설정한 숫자로 돌아간다.
create sequence ex04_seq start with 5 minvalue 1 maxvalue 10 cycle nocache; 
                                                                            -- 캐쉬cache 라는것은 다음값을 빠르게 쉽게 가져온다 이건데,
                                                                            -- maxvalue 10 다음은 '11' 이 아니라 → 다시 minvalue 1 로 가야하기 때문에 노캐쉬nocache!
                                        						            -- nocache 노캐쉬여야 앞으로 간다. (그래야 계속 끝지점 만나야 앞으로 돌아가니까)
                                       							            
                                                                            --> maxvalue 끝숫자     ▶ 끝 지점 (다시 돌아감 min으로)
                                        						            --> minvalue 숫자       ▶ 시작점이 없으면 해당숫자에서부터 시작한다. (시작 안주면 민부터 시작)
                                        						            --                        시작점 있으면, 처음에는 시작점에서부터 시작하고, 다음 사이클부터는 min부터 시작
                                        							        --> start with 시작숫자 ▶ 시작지점
                                        							        --                        시작숫자는 민벨류보다 같거나 커야 한다.(오라클DB해당)
                                        							        --                        min <=  start  >= max


																		    --> ≪ 설정 ≫            ★ 필수설정
																		    --    ★ cycle nocache : 노캐쉬여야 사이클 가능
																		    --      start with 5  : 시작지점
																		    --    ★ maxvalue 10   : 끝 지점 (다시 돌아감 min으로)
																		    --    ★ minvalue 1    : 시작점이 있으니, 2번째 사이클때부터 숫자 1부터 시작
																		                          
																		    

																		    --> ≪ 결과값 ≫
                                        							        --    ▶ 시작           맥스  |  민벨류      맥스  |  민벨류      맥스
                                        							        --       5  6  7  8  9  10   →    1    ...   10   →     1   ...   10
-- ▶ 해당 시퀀스의 값을 증가시키고 싶다면?
-- ▶▶ .nextval                          							
select ex04_seq.nextval from dual; 

---------------------------------------------------------------------------------------------------------------------------------------------------------

create sequence ex05_seq maxvalue 5 nocycle nocache; -- ▶ nocycle(노사이클)하면 반복하지 않는다.
                                                     --   maxvalue 5 → max인 설정한 값 5까지만 가능
                                                     --   이땐, nocache 없어도 됨
                                                     
-- ▶ 해당 시퀀스의 값을 증가시키고 싶다면?
-- ▶▶ .nextval
select ex05_seq.nextval from dual;


---------------------------------------------------------------------------------------------------------------------------------------------------------

create sequence ex06_seq cache 2;  -- ▶ cache 2 (캐시 메모리) → 자주 사용하는 데이터나 값을 미리복사해놓은 임시 장소를 가르킨다.
                                   --   메모리양
                                   --   오라클성량
                                   --   왠만하면! 캐시설정하지 말아라 
                                   
-- ▶ 해당 시퀀스의 값을 증가시키고 싶다면?
-- ▶▶ .nextval
select ex06_seq.nextval from dual;


---------------------------------------------------------------------------------------------------------------------------------------------------------





