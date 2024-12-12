-- 코드를 입력하세요
SELECT DR_NAME, DR_ID, MCDP_CD, substr(HIRE_YMD,1,10) from DOCTOR
    where MCDP_CD in ('cs','gs')
        order by HIRE_YMD desc,dr_name asc