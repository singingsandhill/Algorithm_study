-- 코드를 작성해주세요
SELECT COUNT(*) AS COUNT
    FROM ECOLI_DATA
        WHERE (GENOTYPE & POWER(2, 1)) = 0
        AND
        (
        (GENOTYPE & POWER(2, 0)) > 0
        OR
        (GENOTYPE & POWER(2, 2)) > 0
        )
;
