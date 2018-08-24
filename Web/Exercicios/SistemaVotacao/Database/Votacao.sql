-- Coded by: Leonardo Camargo 
-- Initial Date: 23/10/17

DROP DATABASE IF EXISTS Votacao;
CREATE DATABASE Votacao;
USE Votacao;

CREATE TABLE Users(
  usr_id      INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  usr_name    VARCHAR(255) NOT NULL,
  usr_curso   VARCHAR(255) NOT NULL,
  usr_escola  VARCHAR(255) NOT NULL,
  usr_turma   INT(10) NOT NULL,
  usr_vote    BOOLEAN NOT NULL DEFAULT false,
  usr_votes   INT(10) NOT NULL DEFAULT 0,
  usr_status  INT(10) NOT NULL DEFAULT 0,  
  usr_level   INT(10) NOT NULL
);

-- Status 0 --> Representante
-- Status 1 --> Candidato
-- Status 2 --> Nulo


-- Level 0 --> Escola
-- Level 1 --> Coordenador
-- Level 2 --> Aluno

CREATE TABLE Cursos(
  cur_id    INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  cur_name  VARCHAR(255) NOT NULL
);

INSERT INTO Cursos(cur_name)
VALUES("Informatica"),
      ("Administracao"),
      ("Medicina");

CREATE TABLE Escolas(
  escola_id   INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  escola_nome VARCHAR(255) NOT NULL
);

INSERT INTO Escola(escola_nome)
VALUES("Etec"),
      ("Senai"),
      ("Sesi");