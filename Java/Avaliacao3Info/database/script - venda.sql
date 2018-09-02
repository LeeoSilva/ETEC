-- Banco de dados em POSTGRESQL
-- @author LeeoSilva

DROP TABLE IF EXISTS login;
DROP TABLE IF EXISTS item_venda;
DROP TABLE IF EXISTS venda;
DROP TABLE IF EXISTS cliente;
DROP TABLE IF EXISTS produto;
DROP TABLE IF EXISTS categoria;


CREATE TABLE categoria (
	cat_codigo SERIAL PRIMARY KEY NOT NULL,
	cat_descricao VARCHAR(30)
);

CREATE TABLE produto (
	pro_codigo SERIAL PRIMARY KEY NOT NULL,
	cat_codigo SERIAL REFERENCES categoria(cat_codigo) ON DELETE CASCADE,
	pro_descricao VARCHAR(50),
	pro_custo DECIMAL(10,2),
	pro_venda DECIMAL(10,2),
	pro_estoque DECIMAL(10,3)
);

CREATE TABLE cliente (
	cli_codigo SERIAL PRIMARY KEY NOT NULL,
	cli_nome VARCHAR(50),
	cli_nascimento TIMESTAMP,
	cli_cpf VARCHAR(15),
	cli_rg VARCHAR(15),
	cli_endereco VARCHAR(50),
	cli_email VARCHAR(50)
);

CREATE TABLE venda (
	ven_codigo SERIAL PRIMARY KEY NOT NULL,
	cli_codigo SERIAL REFERENCES cliente(cli_codigo) ON DELETE CASCADE,
	ven_data TIMESTAMP
);

CREATE TABLE item_venda (
	item_codigo SERIAL PRIMARY KEY NOT NULL,
	pro_codigo SERIAL REFERENCES produto(pro_codigo) ON DELETE CASCADE,
	ven_codigo SERIAL REFERENCES venda(ven_codigo) ON DELETE CASCADE,
	item_quantidade DECIMAL(10,2),
	item_valor DECIMAL(10,2)
);

CREATE TABLE login (
	log_usuario VARCHAR(30) PRIMARY KEY NOT NULL,
	log_senha VARCHAR(50) NOT NULL,
	log_permissao VARCHAR(1)
);

INSERT INTO LOGIN(log_usuario, log_senha, log_permissao) VALUES ('admin', md5('123'), 1);
/* users permissions */
