-- Use Case 4: Default Values
CREATE TABLE covid_cases (
    Country VARCHAR(100),
    Report_Date DATE,
    Recoveries INT DEFAULT 0,
    Last_Updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
