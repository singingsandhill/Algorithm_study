-- 코드를 작성해주세요
SELECT count(*) as FISH_COUNT , b.FISH_NAME
    From FISH_INFO a left join FISH_NAME_INFO b on a.FISH_TYPE = b.FISH_TYPE
        group by b.FISH_NAME
            order by FISH_COUNT desc;