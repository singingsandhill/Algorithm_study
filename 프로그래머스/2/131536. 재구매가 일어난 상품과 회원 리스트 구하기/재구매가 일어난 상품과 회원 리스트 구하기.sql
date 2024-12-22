-- 코드를 입력하세요
SELECT User_id, product_id from ONLINE_SALE 
    group by User_id, product_id
        having count(*) > 1
            order by user_id asc, product_id desc;
        