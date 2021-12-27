CREATE TABLE IF NOT EXISTS passenger(id int, name varchar(50), age int, gender varchar(50));

CREATE TABLE IF NOT EXISTS train(trainId int, trainName varchar(50), sourcePoint varchar(50), destinationPoint varchar(50), ticketPrize double);


CREATE TABLE IF NOT EXISTS user(trainId int, firstName varchar(50), age int,email varchar(50), password varchar(50), confirmPassword varchar(50));

