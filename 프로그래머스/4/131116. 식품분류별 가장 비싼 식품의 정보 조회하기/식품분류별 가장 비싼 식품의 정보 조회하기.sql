-- 코드를 입력하세요
SELECT CATEGORY, PRICE as MAX_PRICE, PRODUCT_NAME 
    from FOOD_PRODUCT fp
        where price = (select max(price) from food_product where fp.category = category)
        and CATEGORY in ('과자', '국', '김치', '식용유')
            group by CATEGORY
                order by MAX_PRICE desc