-- Use Case 1: Composite Primary Key
CREATE TABLE covid_cases (
    Country VARCHAR(100),
    Report_Date DATE,
    Confirmed_Cases INT,
    Deaths INT,
    Recoveries INT,
    PRIMARY KEY (Country, Report_Date)
);
