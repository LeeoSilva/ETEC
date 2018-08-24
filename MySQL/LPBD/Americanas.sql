-- Author: Leonardo Camargo
-- RM: 17269
-- Initial Date: 12/06/2017

DROP DATABASE IF EXISTS Americanas;
CREATE DATABASE Americanas;

USE Americanas;

CREATE TABLE Cliente(
	cli_codigo INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	cli_nome VARCHAR(80) NOT NULL,
	cli_CPF VARCHAR(15),
	cli_Fone VARCHAR(15),

	cli_UF ,
	FOREIGN KEY cli_UF
	REFERENCES Localizacao (cli_UF),
	cli_CEP,
	FOREIGN KEY cli_CEP
	REFERENCES Localizacao (cli_CEP),
	cli_endereco,
	FOREIGN KEY cli_endereco
	REFERENCES Localizacao (cli_endereco),
	cli_municipio,
	FOREIGN KEY cli_municipio
	REFERENCES Localizacao (cli_endereco),

	data_emissao,
	FOREIGN KEY data_emissao
	REFERENCES Nota(data_emissao),
	data_entrada_ saida,
	FOREIGN KEY data_entrada_saida,
	REFERENCES Nota(data_entrada_saida),
	hora_saida,
	FOREIGN KEY hora_saida,
	REFERENCES Nota(hora_saida),
);



CREATE TABLE Destinatario(
	cli_UF VARCHAR(255) NOT NULL PRIMARY KEY,
	cli_CEP VARCHAR(5) NOT NULL,
	cli_endereco VARCHAR(255) NOT NULL,
	cli_municipio VARCHAR(255) NOT NULL
);

CREATE TABLE Transportadora(
-- TODO ID PRIMARY KEY
	prod_quantd,
	FOREIGN KEY prod_quantd
	REFERENCES Produto(prod_quantd),
	prod_especie,
	FOREIGN KEY prod_especie
	REFERENCES Produto(prod_especie),

	cod_empresa,
	FOREIGN KEY cod_empresa
	REFERENCES Empresa(cod_emresa),

	veic_placa,
	FOREIGN KEY veic_placa
	REFERENCES Veiculo(veic_placa),
	veic_marca,
	FOREIGN KEY veic_marca
	REFERENCES Veiculo(veic_marca),
	veic_UF,
	FOREIGN KEY veic_UF
	REFERENCES Veiculo(veic_UF)
);

CREATE TABLE Veiculo(
	cod_veic INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	veic_placa VARCHAR(10),
	veic_marca VARCHAR(10),
	veic_UF VARCHAR(35),
	veic_ANTT VARCHAR(35) NOT NULL
);

CREATE TABLE Motorista(
	motorist_nome VARCHAR(35) NOT NULL PRIMARY KEY,
	motorist_endereco VARCHAR(35) NOT NULL,
	motorist_municipio VARCHAR(35) NOT NULL,
	motorist_UF VARCHAR(35) NOT NULL,

);


CREATE TABLE Produto(
	cod_prod INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	prod_nome VARCHAR(255) NOT NULL,
	prod_desc VARCHAR(255),
	prod_especie VARCHAR(35),
	prod_quantd INT(10) NOT NULL DEFAULT 1,
	prod_valor_unit float(10, 2) NOT NULL DEFAULT 1
);

CREATE TABLE Empresa(
	cod_empresa INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	empres_InscEstadual VARCHAR(255) NOT NULL,
	empres_CNPJ VARCHAR(35)
);


CREATE TABLE Impostos(
	ICMS float(10, 2),
	ICMS_base float(10, 2),
	Frete_valor float(10, 2),
	Seguro_valor float(10, 2),
	Desconto float(10, 2),
	ICMS_subst float(10, 2),
	IPI_total float(10, 2),
	total_produtos float(10, 2),
	total_nota float(10, 2),
);

CREATE TABLE Nota_Fiscal(
	cod_barra VARCHAR(50) NOT NULL PRIMARY KEY,
	data_emissao NOT NULL DATE,
	data_entrada_saida NOT NULL DATE,
	hora_saida NOT NULL time,
);

CREATE TABLE Fatura(
	Faturas_extras float(10, 2),
	Despesas_extras float(10, 2),




)
