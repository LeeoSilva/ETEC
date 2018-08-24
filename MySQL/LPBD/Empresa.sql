-- Coded by: Leonardo Camargo
-- Initial Date: 25/09/17

DROP DATABASE IF EXISTS Empresa;
CREATE DATABASE Empresa;
USE Empresa;


CREATE TABLE Cargo(
	car_codigo TINYINT(5) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	car_nome	VARCHAR(255)
);


CREATE TABLE Funcionario(
	fun_codigo TINYINT(5) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	car_codigo	TINYINT(5) NOT NULL,
	FOREIGN KEY (car_codigo)
	REFERENCES Cargo(car_codigo),
	fun_nome	VARCHAR(255),
	fun_salario	FLOAT(10)
);

-- Inserir 4 cargos.

INSERT INTO Cargo(car_nome)
	VALUES
		("Estagiário"),
		("Junior"),
		("Pleno"),
		("Senior");


-- Inserir 10 funcionarios 

INSERT INTO Funcionario (car_codigo, fun_nome, fun_salario)
	VALUES
		(4, "Leonardo", 32000),
		(4, "Lolena", 32000),
		(3, "João", 12000),
		(1, "Maria", 2500),
		(2, "Isabela", 6300),
		(3, "Fernanda", 12000),
		(1, "Daniel", 2500),
		(1, "João Batista", 2500),
		(3, "Plebeu", 12000),
		(2, "José", 6300);


-- 1) Apesentar a listagem completa dos registros da tabela Funcionarios;

CREATE VIEW SELECT * FROM Funcionario AS Exercicio1;

-- 2) Apresentar uma listagem dos nomes e dos cargos de todos os registros da tablwa Funcionarios;

SELECT fun_nome, car_codigo FROM Funcionario;

-- 3) Apresentar uma listagem dos nomes dos empregados do setor 1 e 2

SELECT fun_nome FROM Funcionario WHERE car_codigo=1 or car_codigo=2;

-- 4) Listagem dos nomes e dos salários por ordem de nome (a-z)

SELECT fun_nome, fun_salario FROM Funcionario ORDER BY fun_nome ASC;

-- 5) Listagem dos nomes e dos salários por ordem de nome em formato descendente (z-a)

SELECT fun_nome, fun_salario FROM Funcionario ORDER BY fun_nome DESC;

-- 6) Listagem dos cargos e nomes colocados por ordem do campo cargo em formato ascendente e do campo nome em formato descendente.

SELECT car_nome, fun_nome FROM Funcionario, Cargo ORDER BY Cargo.car_nome DESC, Funcionario.fun_nome ASC;

-- 7) Listagem de nomes ordenados pelo campo mome em formato ascendente, dos funcionarios do setor 4.

SELECT car_nome FROM Cargo WHERE car_codigo=4 ORDER BY Cargo.car_codigo ASC;

-- 8) O empregado de código 3 teve um aumento de salario para 1950.99

UPDATE FuncionarioSET fun_salario=1950.99
WHERE fun_codigo=3;

-- 9) João Batista foi transferido para o cargo 2.

UPDATE Funcionario 
SET fun_nome="João Batista"
WHERE car_codigo=2;

-- 10) Todos os empregados da empresa tiveram um aumento de salário de 20%.

UPDATE Funcionario 
SET fun_salario = fun_salario * (20 / 100) limit 34243;

-- 11) Todos os empregagos do setor 1 foram demitidos, exclua-os.

DELETE FROM Funcionario WHERE car_codigo=1;

-- 12) Fabio Santos pediu demissão, exclua-o.

DELETE FROM Funcionario WHERE fun_nome='João' limit 1;

-- 13) Exibir a média dos salários de todos os empregados do cargo 3

SELECT SUM(fun_salario) / count(fun_codigo) AS AverageSalary FROM Funcionario WHERE car_codigo=3;

-- 14) Exibir a soma dos saláros de todos os funcionários

SELECT SUM(fun_salario) AS TotalSalary FROM Funcionario;

-- 15) Soma dos salários de todos os empregados do cargo 2.

SELECT SUM(fun_salario) AS SumSalary FROM Funcionario WHERE car_codigo=2;

-- 16) Exibir o maior salário entre todos os funcionários.
	
SELECT MAX(fun_salario) AS BiggestSalary FROM Funcionario;

-- 17) Exibir o maior salário e o nome do funcionário

SELECT MAX(fun_salario), fun_nome AS BiggestSalary FROM Funcionario;


-- 18) Exibir o menor salário entre todos os funcionários 

SELECT MIN(fun_salario) AS TiniestSalary FROM Funcionario;


-- 19) Exibir a quantidade de funcionários de cada setor.


SELECT fun_codigo, COUNT(*) FROM Funcionario GROUP BY car_codigo;

-- 20) Número de empregados que recebem acima de média

SELECT COUNT(fun_codigo) AS AverageSalary FROM Funcionario WHERE fun_salario > (select AVG(fun_salario) from Funcionario);