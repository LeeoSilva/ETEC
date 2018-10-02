/**
 * Author:  Marco Machado
 * Created: 28/09/2018
 */
create database if not exists academia;
use academia;

create table atleta(
    atl_id int not null primary key auto_increment,
    atl_nome varchar(50) null,
    atl_idade int not null,
    atl_peso decimal (5,2) not null,
    atl_altura decimal (3,2) not null
);

insert into atleta(atl_nome, atl_idade, atl_peso, atl_altura) values ('Arnoud Xuazineguer',71,110.0,1.88);
insert into atleta(atl_nome, atl_idade, atl_peso, atl_altura) values ('Janclode Andaime',58,75.0,1.77);