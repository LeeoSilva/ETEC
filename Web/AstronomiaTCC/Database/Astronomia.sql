DROP DATABASE IF EXISTS astronomia;
CREATE DATABASE astronomia DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
use astronomia;

CREATE TABLE login(
	id_login INT(255) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	login VARCHAR(20) NOT NULL,
	senha VARCHAR(20) NOT NULL,
	email VARCHAR(50) NOT NULL,
	nivel INT NOT NULL default 2
);

INSERT INTO login(nome, login, senha, email, nivel)
VALUES('HelpPrompt', 'helppprompt', '123', 'helpprompt@etec.sp.gov.br', 0);


-- User Levels.

-- 0 - Root
-- 1 - DBA/SysAdmin
-- 2 - Users

CREATE TABLE artigos(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    
    id_login INT(255) NOT NULL,
    art_titulo  VARCHAR(255),
    artigo LONGTEXT,
	assunto	varchar(255),

	CONSTRAINT fk_id_login
	FOREIGN KEY (id_login) 
	REFERENCES login(id_login) 
);

INSERT INTO artigos(id_login, art_titulo, artigo, assunto) 
VALUE(1, "A astronomia e uma ciencia natural que estuda os corpos celestes, 
	como as estrelas, os planetas, cometas e galaxias", 
	"Por ter um objeto de estudo tao vasto, a astronomia e dividida em muitas areas.
	Uma distincao principal e entre a astronomia teorica e a observacional. Observadores usam varios meios para 
	obter dados sobre diversos fenomenos, que sao usados pelos teoricos para criar e testar teorias e modelos, 
	para explicar observacoes e para prever novos resultados. 
	As bases para o estudo da astronomia sao a fisica e a quimica." ,
	"Astronomia"),
	
	(1, "Um planeta e um corpo celeste que orbita uma estrela 
	ou um remanescente de estrela, com massa suficiente para se 
	tornar esferico pela sua propria gravidade",
	"Os planetas sao geralmente divididos em dois tipos principais:
	os grandes e de baixa densidade, planetas gigantes gasosos,
	e os menores e rochosos planetas teluricos. Ha oito planetas no Sistema Solar:
	em ordem crescente de distancia do Sol, sao os quatro planetas telúricos
	Mercurio, Venus, Terra e Marte, e depois os quatro gigantes gasosos 
	Jupiter, Saturno, Urano e Netuno. Seis dos planetas sao orbitados 
	por um ou mais satelites naturais. Alem disso, o Sistema Solar possui 
	tambem pelo menos cinco planetas anoes e centenas de milhares 
	de corpos menores do Sistema Solar." ,
	"Planetas"),

	(1, "Uma galaxia e um grande sistema gravitacionalmente ligado.",
	"Consiste de estrelas, remanescentes de estrelas, um meio interestelar de gas e poeira,
	e um componente apelidado de materia escura. A materia escura parece corresponder a cerca 
	de 90% da massa da maioria das galaxias. Dados observacionais sugerem que podem existir 
	buracos negros supermacicos no centro de muitas, se nao todas as galaxias." ,
	"Galaxias"),

	(1, "Uma estrela e uma grande e luminosa esfera de plasma, 
	mantida integra pela gravidade e pela pressao de radiacao",
	"Ao fim de sua vida, uma estrela pode conter tambem uma proporcao de materia degenerada. 
	A estrela mais proxima da Terra e o Sol, que e a fonte da maior parte da energia do planeta.
	Outras estrelas sao visiveis da Terra durante a noite, quando nao sao ofuscadas pela luz do Sol
	ou bloqueadas por fenomenos atmosfericos." ,
	"Estrelas");