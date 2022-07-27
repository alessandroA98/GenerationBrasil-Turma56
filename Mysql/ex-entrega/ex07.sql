create database RH_INFO;

USE RH_INFO;

CREATE TABLE TB_COLABORADORES(
ID BIGINT AUTO_INCREMENT,
primary key (id),
NOME VARCHAR(255),
IDADE INT,
FUNCAO VARCHAR(255),
SEXO VARCHAR(255),
SALARIO decimal
);


INSERT INTO TB_COLABORADORES (NOME, IDADE, FUNCAO, SEXO, SALARIO) VALUES ("ALESSANDRO", 24, "ENCARREGADO","M", 3000);
INSERT INTO TB_COLABORADORES (NOME, IDADE, FUNCAO, SEXO, SALARIO) VALUES ("ALEX", 40, "ENGENHEIRO","M", 10000);
INSERT INTO TB_COLABORADORES (NOME, IDADE, FUNCAO, SEXO, SALARIO) VALUES ("VASESSA", 45, "CONSULTORA","F", 5000);
INSERT INTO TB_COLABORADORES (NOME, IDADE, FUNCAO, SEXO, SALARIO) VALUES ("ROBSOM", 29, "EMPACOTADOR","OUTROS", 1000);
INSERT INTO TB_COLABORADORES (NOME, IDADE, FUNCAO, SEXO, SALARIO) VALUES ("JULIA", 38, "ENCARREGADA","F", 3000);


SELECT * FROM TB_colaboradores WHERE SALARIO > 2000;

SELECT * FROM TB_COLABORADORES WHERE SALARIO < 2000;

UPDATE COLABORADORES
SET SALARIO  = 1000
WHERE NOME = JULIA;