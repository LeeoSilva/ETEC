/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Bruno Ferreira Lopes
 * Created: 06/04/2018
 */

create table categoria (
	cat_codigo int not null auto_increment,
	cat_descricao varchar(30),
 primary key (cat_codigo)
) ;

create table produto (
	pro_codigo int not null auto_increment,
	cat_codigo int not null,
	pro_descricao varchar(50),
	pro_custo decimal(10,2),
	pro_venda decimal(10,2),
	pro_estoque decimal(10,3),
 primary key (pro_codigo),
 foreign key (cat_codigo) references categoria (cat_codigo) on delete  restrict on update  restrict
) ;

create table cliente (
	cli_codigo int not null auto_increment,
	cli_nome varchar(50),
	cli_nascimento date,
	cli_cpf varchar(15),
	cli_rg varchar(15),
	cli_endereco varchar(50),
	cli_email varchar(50),
 primary key (cli_codigo)
) ;

create table venda (
	ven_codigo int not null auto_increment,
	cli_codigo int not null,
	ven_data date,
 primary key (ven_codigo),
 foreign key (cli_codigo) references cliente (cli_codigo) on delete  restrict on update  restrict
) ;

create table item_venda (
	item_codigo int not null auto_increment,
	pro_codigo int not null,
	ven_codigo int not null,
	item_quantidade decimal(10,2),
	item_valor decimal(10,2),
 primary key (item_codigo),
 foreign key (pro_codigo) references produto (pro_codigo) on delete  restrict on update  restrict,
 foreign key (ven_codigo) references venda (ven_codigo) on delete  restrict on update  restrict
) ;

create table login (
	log_usuario varchar(30) not null,
	log_senha varchar(50) not null,
	log_permissao bit(1),
 primary key (log_usuario)
) ;

insert into login(log_usuario, log_senha, log_permissao) values ('admin', md5('123'), 1);

/* users permissions */


