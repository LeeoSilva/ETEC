-- Coded by: Leonardo Camargo

DROP DATABASE IF EXISTS ScienceWiki;
CREATE DATABASE ScienceWiki;
USE ScienceWiki;

CREATE TABLE Users(
	usr_id 		int(255) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	usr_name	varchar(255) NOT NULL,
	usr_login 	varchar(255) NOT NULL,
	usr_senha	varchar(255) NOT NULL,
	usr_email	varchar(255) NOT NULL,
	usr_nivel	tinyint(2) NOT NULL
); 

CREATE TABLE Artigs(
	art_id	int(255) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	usr_id	int(255) NOT NULL, 
	FOREIGN KEY (usr_id)
	REFERENCES Users(usr_id)
); 
