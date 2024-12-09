-- 코드를 입력하세요
SELECT ri.REST_ID, REST_NAME, FOOD_TYPE, FAVORITES, ADDRESS, round(avg(REVIEW_SCORE),2) as SCORE
    from REST_INFO ri  join REST_REVIEW rr on ri.REST_ID = rr.REST_ID
        where substr(ri.address,1,2) = '서울'
    group by rr.REST_ID
        order by SCORE desc ,FAVORITES desc;
        