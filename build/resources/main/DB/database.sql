SET MODE postgreSQL;

CREATE TABLE IF NOT EXISTS crimes (
    id int NOT NULL PRIMARY KEY auto_increment,
    crime VARCHAR,
    location VARCHAR,
    reportedBy VARCHAR,
    contact INTEGER

);