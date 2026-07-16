SELECT country, vaccinated_count AS population_count, 'Vaccinated' AS status
FROM vaccination_data
UNION
SELECT country, (population-vaccinated_count) AS population_count, 'Unvaccinated' AS status
FROM vaccination_data;