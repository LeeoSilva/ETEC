-- Coded by: Leonardo Camargo

DROP DATABASE IF EXISTS ScienceWiki;
CREATE DATABASE ScienceWiki;
USE ScienceWiki;

CREATE TABLE IF NOT EXISTS Users(
	usr_id 			int(255) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	usr_name		varchar(255) NOT NULL,
	usr_pass		varchar(255) NOT NULL,
	usr_mail		varchar(255) NOT NULL,
	usr_gender		varchar(10)  NOT NULL,
	usr_level		tinyint(2) NOT NULL DEFAULT 3
); 

-- USER LEVELS

-- ROOT - 1
-- SYSADMINS AND DBA'S- 2
-- USERS - 3


CREATE TABLE Artigs(
	art_id		int(255) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	art			LONGTEXT,
	art_title	varchar(255),
	
	usr_id	int(255) NOT NULL,
	FOREIGN KEY (usr_id) 
	REFERENCES Users (usr_id)
); 
