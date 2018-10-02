DROP DATABASE IF EXISTS urna;
CREATE DATABASE urna;
USE urna;

CREATE TABLE candidato(
	cand_id INT(10) NOT NULL AUTO_INCREMENT,
	cand_nome VARCHAR(255) NOT NULL,
	cand_partido VARCHAR(255) NOT NULL,
	FOREIGN KEY cand_partido REFERENCES partidos(part_nome)
);

CREATE TABLE partidos(
	part_codigo INT(10) NOT NULL AUTO_INCREMENT,
	part_nome VARCHAR(255) NOT NULL,
);

CREATE TABLE votacao(
	votos INT(10) NOT NULL AUTO_INCREMENT,
	cand_nome VARCHAR()
);

INSERT INTO partidos(part_nome)
VALUES("MDB", "PT", "PSDB", "PP", "PDT", "PTB", "DEM", "PR", "PSB", "PPS", "PSC", "PCdoB", "PRB", "PV", "PSD", "PRP", "PSL", "PMN", "PHS",
	"SD", "PTC", "DC", "DC", "AVANTE", "PODE", "PSOL", "PRTB", "PROS", "PATRI", "PMB", "PPL", "REDE", "NOVO", "PSTU", "PCB", "PCO");
