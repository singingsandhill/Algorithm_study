-- 코드를 작성해주세요
SELECT  id, email, first_name, last_name
    FROM developers
        WHERE (skill_code & 256) > 0  OR (skill_code & 1024) > 0
            ORDER BY id
;
        