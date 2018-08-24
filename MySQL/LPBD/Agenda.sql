--  Coded by: Leonardo Camargo

DROP DATABASE IF EXISTS Agenda;
CREATE DATABASE Agenda;
USE Agenda;

CREATE TABLE Pessoa(
	Codigo 		INT(3) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	Nome 	 	VARCHAR(30),
	Endereco	VARCHAR(255),
	Cidade		VARCHAR(30),
	Telefone  	VARCHAR(20)
);

INSERT INTO Pessoa (Nome, Endereco, Cidade, Telefone)

	VALUES	('Rafael', 'Meu inderesu', 'Minha cidade', 'meu telefone'),
			('Seu nome', 'Rua do maneiro', 'meeee', '651'),
			('Bruno ne', 'Alguma rua ai', 'Marilhiasaopaulo', '40028922'),
			('Voce sabe', 'Nao sabe', 'Nao', '40028921'),
			('Hailson', 'Calma', 'Estou pensando', 'mulheres casadas'),
			('Victor', 'Ruas das amazonas', 'Tupilson', '35099754'),
			('Vinicius di lima caralhu', 'deixa eu ver', 'minha cidade', 'meu telefone'),
			('Maria Fernanda Justi', 'cade o...deu branco', 'Piraju', 'nao sei'),
			('Nao sabe meu nome', 'vc nao sabe meu endereco', 'minha idade', 'vou te bater'),
			('fala', 'endereco seti de setembro', 'eeeeee maria', 'Marilia')
);

UPDATE Pessoa SET Nome='Bruno' WHERE ID=4;

UPDATE Pessoa SET Cidade='Marilia' WHERE ID=9;


