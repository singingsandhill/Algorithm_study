SELECT FI.ID, FNI.FISH_NAME, FI.LENGTH
    FROM FISH_INFO FI
        JOIN (
            SELECT FISH_TYPE, MAX(LENGTH) AS MAX_LENGTH
                FROM FISH_INFO
                    WHERE LENGTH IS NOT NULL
                        GROUP BY FISH_TYPE
        ) MAX_FI
            ON FI.FISH_TYPE = MAX_FI.FISH_TYPE AND FI.LENGTH = MAX_FI.MAX_LENGTH
                JOIN FISH_NAME_INFO FNI
                    ON FI.FISH_TYPE = FNI.FISH_TYPE
                        ORDER BY FI.ID;
