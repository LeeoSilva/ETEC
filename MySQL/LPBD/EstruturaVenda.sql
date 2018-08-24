-- Authors: Leonardo Camargo && Rafael Reis
-- DATE: 22/05/2017

-- ------------- Criação -------------
DROP DATABASE IF EXISTS venda;
CREATE DATABASE venda;

USE venda;
CREATE TABLE Cliente(
  cli_codigo INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  cli_nome VARCHAR(255) NOT NULL,
  cli_nascimento DATE,
  cli_cpf VARCHAR(15),
  cli_rg VARCHAR(10),
  cli_endereco VARCHAR(255),
  cli_email VARCHAR(255)
);

CREATE TABLE Categoria(
  cat_codigo INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  cat_descricao VARCHAR(255)
);

CREATE TABLE Produto(
  pro_codigo INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  cat_codigo INT NOT NULL,
  FOREIGN KEY(cat_codigo)
  REFERENCES Categoria(cat_codigo),
  pro_nome VARCHAR(255),
  pro_preco FLOAT(15),
  pro_estoque integer(15)
);

CREATE TABLE Venda(
  ven_codigo INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  cli_codigo INT NOT NULL,
  FOREIGN KEY(cli_codigo) REFERENCES Cliente(cli_codigo),
  ven_data DATE
);

CREATE TABLE Item_Venda(
  item_codigo INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  pro_codigo INT NOT NULL,
  FOREIGN KEY(pro_codigo)
  REFERENCES Produto(pro_codigo),
  ven_codigo INT NOT NULL,
  FOREIGN KEY(ven_codigo)
  REFERENCES Venda(ven_codigo),
  item_quantidade VARCHAR(15),
  item_valor DECIMAL(15, 3)
);


--  ------------- Tabela Cliente -------------


INSERT INTO Cliente (cli_nome, cli_nascimento, cli_cpf, cli_rg, cli_endereco, cli_email)

  VALUES  ('Gato de Schrodinger', 261001, '54545413/56', '65446586-4', 'Rua do paradoxo', 'morri@etec.sp.gov.br'),
          ('Gravidade da Situacao', 120513, '667428700/00', '54544554-7', 'Rua da ForcaG', 'StephenHalking@etec.sp.gov.br'),
          ('Vaccum', 111101, '299792458/00', '60130008-7', 'Rua da velocidade da luz', 'Einstein@etec.sp.gov.br'),
          ('XABLAU', 261001, '111111111/11', '60130008-7', 'Rua dos numerozinteiro', 'integer@etec.sp.gov.br'),
          ('Melhor numero que vc respeita', 261001, '314159265/35', '60130008-7', 'Rua do PI', 'pi3.141592653589793@etec.sp.gov.br'),
          ('Tangente', 261001, '561651651/35', '60130008-7', 'Rua da hipotenusa', 'seno/cosseno=eu@etec.sp.gov.br'),
          ('Senhor das Trevas', 261001, '90909090/35', '60130008-7', 'Rua Adjacente', 'systemctl@etec.sp.gov.br'),
          ('Mol', 261001, '6022101100/00', '60130008-7', 'Rua do seno', ' AugustWilhelm@etec.sp.gov.br'),
          ('minino', 261001, '30303030/30', '60130008-7', 'Rua do minino', 'dhcpd@etec.sp.gov.br'),
          ('Linus Torvalds', 261001, '65132165/32', '60130008-7', 'Rua do Sistema bom', 'LinuxMelhorQueRuindows@etec.sp.gov.br');

-- ------------- Tabela Categoria -------------


INSERT INTO Categoria (cat_descricao) VALUES ('Frutas');
INSERT INTO Produto (cat_codigo, pro_nome, pro_preco, pro_estoque)

  VALUES  (1, 'Uva', 4.00, 10),
          (1, 'Laranja', 2.00, 52),
          (1, 'Maca', 3.00, 23),
          (1, 'Kiwi', 4.00, 10);


INSERT INTO Categoria (cat_descricao) VALUES ('Carne');
INSERT INTO Produto (cat_codigo, pro_nome, pro_preco, pro_estoque)

  VALUES  (2, 'Picanha', 26.00, 10),
          (2, 'Joelho de Porco', 10.00, 10),
          (2, 'Maminha', 20.00, 5),
          (2, 'Frango', 23.00, 3);


INSERT INTO Categoria (cat_descricao) VALUES ('Graos');
INSERT INTO Produto (cat_codigo, pro_nome, pro_preco, pro_estoque)

  VALUES  (3, 'Feijao', 3.00, 150),
          (3, 'Arroz', 2.00, 150),
          (3, 'Cereal', 4.00, 150),
          (3, 'Cariopse', 10.00, 150);


INSERT INTO Categoria (cat_descricao) VALUES ('Frios');
INSERT INTO Produto (cat_codigo, pro_nome, pro_preco, pro_estoque)

  VALUES  (4, 'Salame', 8.00, 100),
          (4, 'Presunto', 5.00, 100),
          (4, 'Mussarela', 6.00, 100),
          (4, 'Mortandela', 8.00, 100);


INSERT INTO Categoria (cat_descricao) VALUES ('MAR');
INSERT INTO Produto (cat_codigo, pro_nome, pro_preco, pro_estoque)

  VALUES  (5, 'Tilapia', 31.00, 50),
          (5, 'Pacu', 20.00, 50),
          (5, 'Camarao', 28.00, 50),
          (5, 'Bicuda', 25.00, 50);


INSERT INTO Categoria (cat_descricao) VALUES ('Bebidas');
INSERT INTO Produto (cat_codigo, pro_nome, pro_preco, pro_estoque)

  VALUES  (6, 'Mountain Dew', 2.00, 100),
          (6, 'Coca-Cola', 9.00, 100),
          (6, 'Red Bull', 12.00, 100),
          (6, 'TNT', 11.00, 100);


INSERT INTO Categoria (cat_descricao) VALUES ('Doces');
INSERT INTO Produto (cat_codigo, pro_nome, pro_preco, pro_estoque)

  VALUES  (7, 'Bala', 0.10, 2000),
          (7, 'Chiclete', 1.75, 1000),
          (7, 'Chocolate', 5.00, 1000),
          (7, 'Pirulito', 1.50, 1000);


INSERT INTO Categoria (cat_descricao) VALUES ('Chipps');
INSERT INTO Produto (cat_codigo, pro_nome, pro_preco, pro_estoque)

  VALUES  (8, 'Doritos', 6.00, 1000),
          (8, 'Cheetos', 5.50, 1000),
          (8, 'Ruffles', 6.50, 1000),
          (8, 'Pringles', 16.00, 1000);


INSERT INTO Categoria (cat_descricao) VALUES ('Paes');
INSERT INTO Produto (cat_codigo, pro_nome, pro_preco, pro_estoque)

  VALUES  (9, 'Croissant', 8.00, 1000),
          (9, 'Bisnaguinha', 2.00, 1000),
          (9, 'Forma', 3.00, 1000),
          (9, 'Frances', 5.00, 1000);


INSERT INTO Categoria (cat_descricao) VALUES ('Salgados');
INSERT INTO Produto (cat_codigo, pro_nome, pro_preco, pro_estoque)

  VALUES  (10, 'Coxinha', 2.50, 30),
          (10, 'Risoles', 3.50, 30),
          (10, 'Pastel', 2.00, 1),
          (10, 'Kibe', 2.00, 1);


-- List number of clients

select count(cli_codigo) from Clientes;

-- List number of categories

select count(*) from Categoria;

-- List 

select cat_descricao from Categoria;

-- List

-- codigo Base
--select count(cat_codigo) from Produto where cat_codigo = 1;





-- ------------- Tabela Venda ---------------

INSERT INTO Item_Venda (pro_codigo, item_quantidade, item_valor),
	VALUES (1, 5, item_quantidade * 4.00),
	VALUES (2, 3, item_quantidade * 2.00);

INSERT INTO Item_Venda (pro_codigo, item_quantidade, item_valor)

	VALUES (6, 4, (item_quantidade * 10.00)),
	VALUES (7, 9, (item_quantidade * 20.00));

INSERT INTO Item_Venda (pro_codigo, item_quantidade, item_valor)

	VALUES (9, 1, (item_quantidade * 3.00)),
	VALUES (8, 2, (item_quantidade * 23.00));

INSERT INTO Item_Venda (pro_codigo, item_quantidade, item_valor)

	VALUES (23, 7, (item_quantidade * 9.00)),
	VALUES (15, 4, (item_quantidade * 6.00));

INSERT INTO Item_Venda (pro_codigo, item_quantidade, item_valor

	VALUES (29, 2, (item_quantidade * 6.00)),
	VALUES (15, 6, (item_quantidade * 6.00)),
	VALUES (9, 5, (item_quantidade * 3.00)),
	VALUES (10, 15, (item_quantidade * 2.00));

INSERT INTO Item_Venda (pro_codigo, item_quantidade, item_valor)

	VALUES (31, 4, (item_quantidade * 6.50)),
	VALUES (32, 2, (item_quantidade * 16.00));

INSERT INTO Item_Venda (pro_codigo, item_quantidade, item_valor)

	VALUES (33, 2, (item_quantidade * 8.00)),
	VALUES (34, 8, (item_quantidade * 2.00));

INSERT INTO Item_Venda (pro_codigo, item_quantidade, item_valor)

	VALUES (35, 5, (item_quantidade * 3.00)),
	VALUES (36, 5, (item_quantidade * 5.00));

INSERT INTO Item_Venda (pro_codigo, item_quantidade, item_valor)

	VALUES(37, 3, (item_quantidade * 2.50)),
	VALUES(38, 5, (item_quantidade * 3.50));

INSERT INTO Item_Venda (pro_codigo, item_quantidade, item_valor)

	VALUES (39, 1, (item_quantidade * 2.00)),
	VALUES (40, 1, (item_quantidade * 2.00));
