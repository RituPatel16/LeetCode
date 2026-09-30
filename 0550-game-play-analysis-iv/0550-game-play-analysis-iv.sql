/* Write your T-SQL query statement below */
WITH CTE AS (
    SELECT
        player_id,
        MIN(event_date) AS first_login
    FROM Activity
    GROUP BY player_id
)
SELECT
    ROUND(
        CAST(COUNT( A.player_id) AS FLOAT)
        / (SELECT COUNT(DISTINCT player_id) FROM Activity),
        2
    ) AS fraction
FROM CTE C
JOIN Activity A
    ON C.player_id = A.player_id
    AND A.event_date = DATEADD(DAY, 1, C.first_login);