-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME,gender, substring(DATE_OF_BIRTH,1,10) from MEMBER_PROFILE  
    where month(DATE_OF_BIRTH) = 3 and tlno is not null and gender = 'W'
        order by MEMBER_ID asc;