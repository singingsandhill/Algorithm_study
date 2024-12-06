-- 코드를 입력하세요
SELECT fh.flavor FROM FIRST_HALF fh join ICECREAM_INFO io on fh.FLAVOR = io.FLAVOR
    where fh.total_order >= 3000 and io.ingredient_type = 'fruit_based'
        order by fh.total_order desc
;