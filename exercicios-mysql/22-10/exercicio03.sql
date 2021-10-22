CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_alunes (
	id bigint(5) auto_increment,
    nome varchar(255) not null,
    idade int not null,
    re varchar(6) not null,
    nota int not null,
    cadastrado boolean,
    
    primary key(id)
);

SELECT * FROM tb_alunes;

INSERT INTO tb_alunes(nome,idade,re,nota,cadastrado) values ("Cebolinha", 15, 226546, 8 , 1);
INSERT INTO tb_alunes(nome,idade,re,nota,cadastrado) values ("Zeca Mel", 18, 056546, 5 , 1);
INSERT INTO tb_alunes(nome,idade,re,nota,cadastrado) values ("Roberto Fifi", 17, 396680, 4 , 1);
INSERT INTO tb_alunes(nome,idade,re,nota,cadastrado) values ("João Turista", 16, 200246, 1 , 0);
INSERT INTO tb_alunes(nome,idade,re,nota,cadastrado) values ("Maria Rosinha", 18, 849652, 10 , 1);
INSERT INTO tb_alunes(nome,idade,re,nota,cadastrado) values ("Monica Geromel", 16, 200224, 7 , 1);
INSERT INTO tb_alunes(nome,idade,re,nota,cadastrado) values ("Pedro Mabel", 15, 224566, 6 , 1);
INSERT INTO tb_alunes(nome,idade,re,nota,cadastrado) values ("Alberta Einstein", 13, 299956, 10 , 1);

-- Mostrando notas menores que 7;
select nome, nota from tb_alunes where nota < 7;

-- Mostrando notas maiores que 7;
select nome, nota from tb_alunes where nota > 7;

-- Aumentando a nota de Monica para 9;
update tb_alunes 
set nota = 9 
where nome = "Monica Geromel";
