CREATE TABLE db_rh; /*Criando tabela*/

USE db_rh; /*Selecionando a tabela e deixando em uso*/

CREATE TABLE tb_funcionarie( /*Criando tabela funcionárie*/
	id bigint(5) auto_increment,
    nome varchar(60) not null,
    cpf varchar(11) not null,
    dt_nascimento date not null,
    cargo varchar(20) not null,
	salario decimal (10,2),
    
    primary key (id)
);

select * from tb_funcionarie; /*Mostrando estrutura da tabela*/

/*Inserindo os valores*/
insert into tb_funcionarie(nome,cpf,dt_nascimento,cargo,salario) values ("Gohan","44433322211", "1998-09-11" , "Tech Lead" , 6000);
insert into tb_funcionarie(nome,cpf,dt_nascimento,cargo,salario) values ("Meliodas","99988877766", "1815-10-21" , "Dev Full Stack PL" , 3000);
insert into tb_funcionarie(nome,cpf,dt_nascimento,cargo,salario) values ("Ichigo","55544466699", "2001-11-15" , "Dev Full Stack JR" , 1500);
insert into tb_funcionarie(nome,cpf,dt_nascimento,cargo,salario) values ("Tanjiro","66688811105", "1988-06-15" , "Designer UX/UI" , 1900);
insert into tb_funcionarie(nome,cpf,dt_nascimento,cargo,salario) values ("BlitzCrank","88888888888", "1911-06-18" , "Analista de Supporte" , 2100);

/*Mostrando salários acima de 2000*/
select nome, cargo, salario from tb_funcionarie where salario > 2000;

/*Mostrando salários avaixo de 2000*/
select nome, cargo, salario from tb_funcionarie where salario < 2000;

/*Atualizando salário de funcionário que recebia 3000, para 5000 através do campo salario*/
update tb_funcionarie 
set salario = 5000 
where salario = 3000;