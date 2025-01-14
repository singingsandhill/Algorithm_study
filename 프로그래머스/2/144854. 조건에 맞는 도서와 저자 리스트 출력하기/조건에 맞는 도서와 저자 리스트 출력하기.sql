-- 코드를 입력하세요
SELECT b.BOOK_ID, a.AUTHOR_NAME, substr(b.PUBLISHED_DATE,1,10)
    from BOOK b 
        left join AUTHOR a on b.AUTHOR_ID = a.AUTHOR_ID
            where CATEGORY ='경제'
                order by PUBLISHED_DATE asc
;