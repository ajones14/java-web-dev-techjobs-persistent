## Part 1: Test it with SQL
SHOW columns
FROM job;

## Part 2: Test it with SQL
SELECT *
FROM employer
WHERE location = "St. Louis, Mo";

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT name, description
FROM skill
INNER JOIN job_skills ON job_skills.skills_id = skill.id;