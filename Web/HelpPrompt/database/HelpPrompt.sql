-- Coded by: Leonardo Camargo From Keys & Kases
-- Initial date: 13/11/2017

DROP DATABASE IF EXISTS HelpPrompt;
CREATE DATABASE HelpPrompt;
USE HelpPrompt;

CREATE TABLE Geo(
	usr_lat FLOAT(16, 16) NOT NULL PRIMARY KEY,
	usr_lon FLOAT(16, 16) NOT NULL,

	usr_city VARCHAR(100) NOT NULL,
	usr_region VARCHAR(100) NOT NULL,
	usr_country VARCHAR(100) NOT NULL
);

CREATE TABLE UserInfo(
	usr_id INT(100) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	usr_IP VARCHAR(16) NOT NULL,
	usr_name VARCHAR(100) NOT NULL,
	usr_pass VARCHAR(100) NOT NULL, 
	usr_mail VARCHAR(100) NOT NULL,
	usr_birth DATE,

	usr_lat FLOAT(16, 16) NOT NULL,
	usr_lon FLOAT(16, 16) NOT NULL,
	
	usr_city VARCHAR(100) NOT NULL,
	usr_region VARCHAR(100) NOT NULL,
	usr_country VARCHAR(100) NOT NULL,

	FOREIGN KEY(usr_lat)
	REFERENCES Geo(usr_lat),

	FOREIGN KEY(usr_lon)
	REFERENCES Geo(usr_lon),

	FOREIGN KEY(usr_city)
	REFERENCES Geo(usr_city),k

	FOREIGN KEY(usr_region)
	REFERENCES Geo(usr_region),

	FOREIGN KEY(usr_country)
	REFERENCES Geo(usr_country)
);





