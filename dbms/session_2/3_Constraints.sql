-- Use Case 3: Constraints
CREATE TABLE covid_cases (
    Country VARCHAR(100) NOT NULL,
    Report_Date DATE NOT NULL,
    Confirmed_Cases INT NOT NULL,
    Deaths INT,
    CHECK (Deaths <= Confirmed_Cases)
);
