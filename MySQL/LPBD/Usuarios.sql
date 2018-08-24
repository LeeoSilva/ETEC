-- Codded by: Leonardo Camargo



DROP DATABASE IF EXISTS Usuarios;
USE Usuarios;


CREATE TABLE Usuarios (
  usr_id int(255) NOT NULL PRIMARY_KEY AUTO_INCREMENT,
  usr_name varchar(255) NOT NULL,
  usr_login varchar(255) NOT NULL,
  usr_senha varchar(255) NOT NULL,
  usr_email varchar(255) NOT NULL,
  usr_nivel tinyint(1) NOT NULL
);


INSERT INTO 'usuarios' ('usr_id', 'usr_name', 'usr_login', 'usr_senha', 'usr_email', 'usr_nivel')
  VALUES  (1, 'Bruno Ferreira Lopes', 'brunolopes1', '123456789b', 'brunoferrari772@gmail.com', 1),
          (2, 'Leonardo Camargo', 'anao321', 'leeocamargo', 'leeo@algumacoisa.com', 0),
          (3, 'Rafael Reis', 'inutilidade123', '123321123', 'rafaelreis@hotmail.com', 1),
          (4, 'Barbara Mangili', 'mangili12', '16082001bah', 'barbaramangili15@gmail.com', 1),
          (5, 'Lorena Biondi', 'lololohaha', 'naumsei', 'naofacoideia123@eaemen.com', 0),
          (6, 'Livia Souto', 'soutopreso', 'presosouto', 'liviiia@gmail.com', 1),
          (7, 'Matheus Tixilisk', 'Tixionaldo', 'cristiano', 'tixilesho@hotmail.com', 1),
          (8, 'Gabriel Oliveira', 'assasinscreed', 'euaki123', 'gabrieloliveira@etec.sp.gov.br', 1),
          (9, 'Alguem ai', 'euaki', 'eleali', 'elesla@aki.com', 0),
          (10, 'cannot give my hands for you', 'yeh boy my hands', 'your hand is beatiful', 'hhhhei you cant use email', 2);
