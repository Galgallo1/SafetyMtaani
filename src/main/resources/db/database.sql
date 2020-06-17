SET MODE postgreSQL;

CREATE TABLE IF NOT EXISTS police (
    id int NOT NULL PRIMARY KEY auto_increment,
    firstName VARCHAR,
    lastName VARCHAR,
    email VARCHAR,
    mobile INTEGER,
    policeRegNumber INTEGER
);