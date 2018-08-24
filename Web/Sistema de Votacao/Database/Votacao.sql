-- Coded by: Leonardo Camargo

-- Crie um banco de dados para armazenar informações de um sistema de votação
-- de representantes de turma

-- Listar os representantes de uma determinada escola
-- Listar todos os representantes de um curso
-- Exibir os representrantes de uma sala
-- Exibir os candidatos e a quantidade de votos de cada um

-- OBS: Cada voto do eleitor deve ser atualizado no Banco de Dados.
-- Não utilizar inserção simples para esses votos.

-- Exibir a quantidade de alunos (Votou/Não votou).

DROP DATABASE IF EXISTS Votacao;
CREATE DATABASE Votacao;
USE Votacao;


CREATE TABLE Aluno(
	aluno_id		TINYINT(5)  NOT NULL PRIMARY KEY AUTO_INCREMENT,
	aluno_name	VARCHAR(255) NOT NULL,
	aluno_mail	VARCHAR(255) NOT NULL,
	aluno_pass	VARCHAR(255) NOT NULL,
);


CREATE TABLE Escola(
	escola_id	TINYINT(5) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	escola_name 



);


CREATE TABLE Representantes(
	id_represent TINYINT(5) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	representante	TINYINT(1) NOT NULL,

	nome_aluno VARCHAR(255) NOT NULL,
	FOREIGN KEY (nome_aluno)
	REFERENCES Alunos(nome_aluno),

	curso_aluno VARCHAR(255) NOT NULL,
	FOREIGN KEY (curso_aluno)
	REFERENCES Alunos(curso_aluno),


	escola_aluno		VARCHAR(255) NOT NULL,
	FOREIGN KEY (escola_aluno) 
	REFERENCES Alunos(escola_aluno)
);


SELECT * FROM Escola where id_representantes=1;


CREATE TABLE Escola(
	escola_id 			TINYINT(5) NOT NULL PRIMARY KEY AUTO_INCREMENT,

	escola_aluno		 VARCHAR(255) NOT NULL,
	FOREIGN KEY (escola_aluno)
	REFERENCES Alunos(escola_aluno),
	
	nome_aluno			VARCHAR(255)  NOT NULL,
	FOREIGN KEY (nome_aluno)
	REFERENCES Alunos(nome_aluno),

	id_represent		TINYINT(5) NOT NULL,
	FOREIGN KEY (id_represent)
	REFERENCES Representantes(id_represent)


);




CREATE TABLE Candidatos(
	id_cand 		TINYINT(5) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	
	id_aluno		TINYINT(5) NOT NULL,
	FOREIGN KEY (id_aluno)
	REFERENCES Alunos(id_aluno),


	nome_aluno		VARCHAR(255) NOT NULL,
	FOREIGN KEY (nome_aluno)
	REFERENCES Alunos (nome_aluno),
	
	curso_aluno		VARCHAR(255) NOT NULL,
	FOREIGN KEY (curso_aluno)
	REFERENCES Alunos (curso_aluno),


	escola_aluno		VARCHAR(255) NOT NULL,
	FOREIGN KEY (escola_aluno)
	REFERENCES Alunos(escola_aluno),


	id_aluno		TINYINT(5) NOT NULL,
	FOREIGN KEY (id_aluno)
	REFERENCES Alunos (id_aluno),

	votou_aluno		TINYINT(1) DEFAULT 0,
	FOREIGN KEY (votou_aluno)
	REFERENCES Alunos (votou_aluno)
);



CREATE TABLE Sala(
	id_sala					TINYINT(5) NOT NULL PRIMARY KEY AUTO_INCREMENT,

	id_aluno				TINYINT(5) NOT NULL,
	FOREIGN KEY (id_aluno)
	REFERENCES Alunos (id_aluno),

	nome_aluno	VARCHAR(255) NOT NULL,
	FOREIGN KEY (nome_aluno)
	REFERENCES Alunos(nome_aluno),
	
	curso_aluno				VARCHAR(255) NOT NULL,
	FOREIGN KEY (curso_aluno)
	REFERENCES Alunos(id_aluno),

	id_cand				VARCHAR(255) NOT NULL,
	FOREIGN KEY (id_cand)
	REFERENCES Alunos(id_cand)

);


CREATE TABLE Curso(
	id_curso	TINYINT(5) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nome_curso	VARCHAR(255) NOT NULL,

	cands_sala	VARCHAR(255),
	FOREIGN KEY (cands_sala)
	REFERENCES Sala(cands_sala)
);