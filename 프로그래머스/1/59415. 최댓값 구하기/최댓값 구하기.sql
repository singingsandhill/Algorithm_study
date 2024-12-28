-- 코드를 입력하세요
SELECT DATETIME from ANIMAL_INS 
    where ANIMAL_ID = (select ANIMAL_ID from ANIMAL_INS order by DATETIME desc limit 1);