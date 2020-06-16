SET MODE postgreSQL;

CREATE TABLE IF NOT EXISTS crime (
    id int NOT NULL PRIMARY KEY auto_increment,
    crime VARCHAR,
    location VARCHAR,
    time TIMESTAMP,
    reportedBy VARCHAR,
    contact INTEGER

);