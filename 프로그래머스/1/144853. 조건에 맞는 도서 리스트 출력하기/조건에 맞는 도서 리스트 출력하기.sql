-- 코드를 입력하세요
SELECT BOOK_ID, substr(PUBLISHED_DATE,1,10) from BOOK 
    where substr(PUBLISHED_DATE,1,4) = 2021 and CATEGORY = '인문'
        order by PUBLISHED_DATE asc
;