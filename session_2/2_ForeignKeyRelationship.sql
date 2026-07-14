-- Use Case 2: Foreign Key
CREATE TABLE countries (
    Country VARCHAR(100) PRIMARY KEY,
    Continent VARCHAR(100)
);

CREATE TABLE covid_cases (
    Country VARCHAR(100),
    Report_Date DATE,
    Confirmed_Cases INT,
    FOREIGN KEY (Country) REFERENCES countries(Country)
);
