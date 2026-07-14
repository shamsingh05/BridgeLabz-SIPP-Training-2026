-- Use Case 5: UNIQUE Constraint
CREATE TABLE covid_cases (
    Country VARCHAR(100),
    Report_Date DATE,
    Confirmed_Cases INT,
    CONSTRAINT uq_country_date UNIQUE (Country, Report_Date)
);
