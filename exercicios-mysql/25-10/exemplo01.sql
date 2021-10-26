create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

insert into tb_categoria (descricao, ativo) values ("Bovino",true);
insert into tb_categoria (descricao, ativo) values ("Suino",true);
insert into tb_categoria (descricao, ativo) values ("Aves",true);
insert into tb_categoria (descricao, ativo) values ("pertence feijoada",true);
insert into tb_categoria (descricao, ativo) values ("imbutidos",true);
insert into tb_categoria (descricao, ativo) values ("soja",true);
insert into tb_categoria (descricao, ativo) values ("outros",true);

select * from tb_categoria;

create table tb_produtos (
id bigint auto_increment,
nome varchar (255) not null,
preco decimal(6,2) not null,
qtproduto int not null,
dtvalidade date,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("ASA",40.00,30, "2021-11-07", 3);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Picanha",20.00,30, "2021-11-08", 1);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("coxa de frango",20.00,30, "2021-11-07", 3);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Bacon",30.00,30, "2021-11-09", 1);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("hamburguer",60.00,30, "2021-09-07", 5);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Cupim",20.00,30, "2021-11-10", 1);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Peito de frango",25.00,30, "2021-11-09", 3);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Orelha de porco",20.00,30, "2021-11-07", 4);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Salame",18.00,30, "2021-11-21", 5);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("medalhao",50.00,30, "2021-11-15", 3);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("mocoto",20.00,30, "2021-10-05", 2);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("chuleta",20.00,30, "2021-10-07", 1);
insert into tb_produtos (nome, preco, qtProduto) values ("acendedor de churrasqueira",20.00,30);
insert into tb_produtos (nome, preco, qtProduto) values ("soprador de churrasqueira",35.00,30);

select * from tb_produtos;

select * from tb_produtos order by nome; -- Ordenando por nome A a Z--

select * from tb_produtos order by nome DESC; -- Ordenado por nome Z a A --

select * from tb_produtos where preco > 20.00 and categoria_id = 1; -- Produtos com preço maior que 20 E com o ID 1 --

select * from tb_produtos where preco > 20.00 or categoria_id = 1; -- Produtos com preço maior que 20 OU com o ID 1 --

select * from tb_produtos where not categoria_id = 1; -- Consulta todas informações cm excessão dos de categoria 1 --

select * from tb_produtos where nome like "ha%"; -- Consulta letras com "ha" no início -- 

select * from tb_produtos where nome like "%ha"; -- Consulta letras com "ha" no fim --

select * from tb_produtos where nome like "%ha%"; -- Consulta letras com "ha" no meio --

select * from tb_produtos where nome like "%ha%" order by nome; -- Consulta letras com "ha" no meio e em ordem alfabética --

show create table tb_produtos; -- Mostra as informações da tabela  --

select * from tb_produtos where preco in (20, 30, 40) order by preco; -- mostra produtos com valores de 20, 30 e 40 e ordena em crescente  --

select * from tb_produtos where preco between 20 and 40; -- Mostra produtos com valor entre 20 e 40 --

select nome, DATE_FORMAT(dtvalidade, "%d/%m/%Y") as Data_de_Validade from tb_produtos where dtvalidade between "2021-11-07" and "2021-12-01"; -- Formata a data de vencimento para ptBR --

select count(*) from tb_produtos; -- Conta quantos produtos tem na tabela --

select count(categoria_id) from tb_produtos; -- Conta quantos produtos tem na tabela que tenha categoria_id --

select sum(preco) from tb_produtos; -- Soma o valor de todos os produtos  --

select avg(preco) from tb_produtos; -- Mostra a média do valor de todos os produtos --

select categoria_id, avg(preco) from tb_produtos group by categoria_id; -- Mostra a média dos valores referente a cada categoria --

select max(preco) from tb_produtos; -- Mostrar produto de maior valor --

select min(preco) from tb_produtos; -- Mostrar produto de maior valor --


-- Inner Join --
select tb_produtos.nome, tb_produtos.preco, tb_produtos.qtproduto, tb_categoria.descricao 
-- Inserir sempre qual campo você quer da tabela, mas sempre associando a qual tabela esta vindo este campo -- 
from tb_produtos inner join tb_categoria
-- Colocar de qual tabela para qual tabela queremor consultar --
on tb_categoria.id = tb_produtos.categoria_id;


-- left join --
select tb_produtos.nome, tb_produtos.preco, tb_produtos.qtproduto, tb_categoria.descricao 
from tb_produtos left join tb_categoria
on tb_categoria.id = tb_produtos.categoria_id;

-- right join --
select tb_produtos.nome, tb_produtos.preco, tb_produtos.qtproduto, tb_categoria.descricao 
from tb_produtos right join tb_categoria
on tb_categoria.id = tb_produtos.categoria_id;

select tb_categoria.descricao, avg(tb_produtos.preco) as preco_medio
from tb_produtos inner join tb_categoria
on tb_categoria.id = tb_produtos.categoria_id
group by tb_produtos.categoria_id;