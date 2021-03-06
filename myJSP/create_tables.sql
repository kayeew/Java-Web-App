

CREATE TABLE BOOKING (
    BK_ID INTEGER GENERATED ALWAYS AS IDENTITY NOT NULL PRIMARY KEY,
    BK_NAME VARCHAR(20) NOT NULL,
    BK_DATE VARCHAR(20) NOT NULL,
    BK_STATUS VARCHAR(20) NOT NULL);


CREATE TABLE USERS (
    USER_ID INTEGER GENERATED ALWAYS AS IDENTITY NOT NULL PRIMARY KEY,
    USER_Name VARCHAR(20) NOT NULL,
    USER_EMAIL VARCHAR(50) NOT NULL,
    USER_PASSWORD VARCHAR(50) NOT NULL,
    USER_TYPE VARCHAR(20) NOT NULL);