CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos (
	id bigint(5) auto_increment,
    nome varchar(40),
    tipo varchar(50),
    preco decimal(7,2),
    lancamento boolean,
    ativo boolean,
    
    primary key(id)
);

SELECT * FROM tb_produtos;

INSERT INTO tb_produtos(nome,tipo,preco,lancamento,ativo) values ("God Of War Ragnarok", "Jogo de VideoGame", 600, 1 , 1);
INSERT INTO tb_produtos(nome,tipo,preco,lancamento,ativo) values ("GloomHaven", "Jogo de Tabuleiro", 1400, 0 , 1);
INSERT INTO tb_produtos(nome,tipo,preco,lancamento,ativo) values ("Pelúcia Baby Yoda", "Brinquedo", 200, 0 , 0);
INSERT INTO tb_produtos(nome,tipo,preco,lancamento,ativo) values ("DECK Magic! The Gathering", "Jogo de Cartas", 550, 0 , 1);
INSERT INTO tb_produtos(nome,tipo,preco,lancamento,ativo) values ("Bola de Basquete", "Brinquedo", 60, 0 , 1);
INSERT INTO tb_produtos(nome,tipo,preco,lancamento,ativo) values ("Lego Capacete Mandalorian", "Brinquedo", 799, 1 , 1);
INSERT INTO tb_produtos(nome,tipo,preco,lancamento,ativo) values ("Patinete Elétrico", "Brinquedo", 1680, 0 , 1);
INSERT INTO tb_produtos(nome,tipo,preco,lancamento,ativo) values ("Tablet Pro", "Eletrônico", 5999, 1 , 1);

-- Mostrando produtos com valores abaixo de 500;
select nome, preco, tipo from tb_produtos where preco < 500;

-- Mostrando produtos com valores acima de 500 em ordem decrescente;
select nome, preco, tipo from tb_produtos where preco > 500 order by preco;

-- Informando que a bola de basquete acabou através do ID dela;
update tb_produtos 
set ativo = 0 
where id = 5;
