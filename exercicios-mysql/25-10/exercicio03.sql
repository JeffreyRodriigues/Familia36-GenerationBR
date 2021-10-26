CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

CREATE TABLE tb_categoria(
	id bigint auto_increment,
    nome varchar(255) not null,
    categoria varchar (255) not null,
    receita_medica varchar(255) not null,
    
    primary key(id)
);

INSERT INTO tb_categoria(nome, categoria, receita_medica) VALUES ("Genérico","Medicamento", "Não Necessário");
INSERT INTO tb_categoria(nome, categoria, receita_medica) VALUES ("Higiene","Produto", "Não Necessário");
INSERT INTO tb_categoria(nome, categoria, receita_medica) VALUES ("Medicamento Leve","Medicação", "Não Necessário");
INSERT INTO tb_categoria(nome, categoria, receita_medica) VALUES ("Medicamento Pesado","Medicação Pesada", "Necessário");
INSERT INTO tb_categoria(nome, categoria, receita_medica) VALUES ("Home Care","Primeiros Socorros", "Não Necessário");

SELECT * FROM tb_categoria;

CREATE TABLE tb_produto(
	id bigint auto_increment,
    nome varchar(255) not null,
    saude varchar(255) not null,
    entrega_disponivel boolean,
	preco decimal (10,2),
    catservico_id bigint,
    
    primary key(id),
    foreign key (catservico_id) references tb_categoria(id)
);

INSERT INTO tb_produto(nome, saude, entrega_disponivel, preco, catservico_id) values("Vacina Covid-19","Saúde Viral", 1, 0.00,1);
INSERT INTO tb_produto(nome, saude, entrega_disponivel, preco, catservico_id) values("Vacina H1N1","Saúde Viral", 1, 0.00,1);
INSERT INTO tb_produto(nome, saude, entrega_disponivel, preco, catservico_id) VALUES("Escova de Dente","Saúde Bucal", 1, 20.00,2);
INSERT INTO tb_produto(nome, saude, entrega_disponivel, preco, catservico_id) VALUES("Pasta de Dente","Saúde Bucal", 1, 8.00,2);
INSERT INTO tb_produto(nome, saude, entrega_disponivel, preco, catservico_id) VALUES("Neosaldina","Saúde", 1, 15.00,3);
INSERT INTO tb_produto(nome, saude, entrega_disponivel, preco, catservico_id) VALUES("Dorflex","Saúde", 1, 13.00, 3);
INSERT INTO tb_produto(nome, saude, entrega_disponivel, preco, catservico_id) VALUES("Citalopram","Saúde Mental", 1, 65.00,4);
INSERT INTO tb_produto(nome, saude, entrega_disponivel, preco, catservico_id) VALUES("Fluoxetina","Saúde Mental", 1, 40.00,4);

SELECT * FROM tb_produto;

SELECT * FROM tb_produto WHERE preco > 50;

SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;

SELECT * FROM tb_produto WHERE nome LIKE "%s%";

SELECT * FROM tb_produto INNER JOIN tb_categoria
ON tb_categoria.id = tb_produto.catservico_id;

SELECT * FROM tb_produto INNER JOIN tb_categoria
ON tb_categoria.id = tb_produto.catservico_id
WHERE tb_categoria.id = 1;
