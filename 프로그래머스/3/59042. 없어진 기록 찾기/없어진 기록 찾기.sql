-- 코드를 입력하세요
SELECT OUTS.ANIMAL_ID, OUTS.NAME
FROM ANIMAL_OUTS OUTS
MINUS
SELECT INS.ANIMAL_ID, INS.NAME
FROM ANIMAL_INS INS
ORDER BY ANIMAL_ID ASC;