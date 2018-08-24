-- Coded by: Leonardo Camargo
-- Initial date: 17/10/2017

DROP DATABASE IF EXISTS OurHistory;
CREATE DATABASE OurHistory;
USE OurHistory;


CREATE TABLE Users(
	id_login	 	INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	usr_login 		VARCHAR(255) NOT NULL,
	usr_pass		VARCHAR(255) NOT NULL,
	usr_mail		VARCHAR(255) NOT NULL
	usr_level		TINYINT(2) NOT NULL
);

CREATE TABLE Info(
	info_id			TINYINT(3) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	info_bio		BIGTEXT NOT NULL,
	info_idade		INT(3) NOT NULL,
	info_mail
);
