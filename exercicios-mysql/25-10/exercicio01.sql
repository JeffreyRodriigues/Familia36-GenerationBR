CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

create table tb_classe(
	id bigint auto_increment,
	descricao varchar (255),
    tipo varchar(255),
    valido boolean,
    primary key (id)
);

select*from tb_classe;

insert into tb_classe(descricao,tipo,valido) values ("Guerreiro","Combate corporal com espada e escudos",1);
insert into tb_classe(descricao,tipo,valido) values ("Arqueiro","Combate a distância com arco e flecha",1);
insert into tb_classe(descricao,tipo,valido) values ("Bruxo","Combate a distância com magias de variados elementos",1);
insert into tb_classe(descricao,tipo,valido) values ("Curandeiro","Combate à distância com magias de luz ou natureza",1);
insert into tb_classe(descricao,tipo,valido) values ("Barbaro","Combate corporal com espadas, machados geralmente com duas mãos",1);

create table tb_personagem(
 id bigint auto_increment,
 nome varchar(255) not null,
 idade int,
 raca varchar(255),
 ataque decimal(10,2),
 defesa decimal(10,2),
 classe_id bigint,
primary key(id),
foreign key(classe_id) references tb_classe(id)
);

select*from tb_personagem;

insert into tb_personagem(nome,idade,raca,ataque,defesa,classe_id) values("Sona",98,"Elfa",2100,6220,3);
insert into tb_personagem(nome,idade,raca,ataque,defesa,classe_id) values("Gargas",32,"Orc",6000,1500,3);
insert into tb_personagem(nome,idade,raca,ataque,defesa,classe_id) values("Teemo",66,"Elfo",3200,2700,2);
insert into tb_personagem(nome,idade,raca,ataque,defesa,classe_id) values("Dravin",158,"Orc",4050,2050,2);
insert into tb_personagem(nome,idade,raca,ataque,defesa,classe_id) values("Fizz",331,"Animal",1900,2200,1);
insert into tb_personagem(nome,idade,raca,ataque,defesa,classe_id) values("Xin Zhao",224,"Humano",5200,5000,3);
insert into tb_personagem(nome,idade,raca,ataque,defesa,classe_id) values("Jhin",15,"Humano",2955,2950,2);
insert into tb_personagem(nome,idade,raca,ataque,defesa,classe_id) values("Varus",58,"Humano",1700,2300,1);


select * from tb_personagem where ataque >2000;

select * from tb_personagem where defesa between 1000 and 2000;

select * from tb_personagem where nome like "x%";

select * 
from tb_personagem 
inner join tb_classe where tb_personagem.classe_id like tb_classe.id;

select * 
from tb_personagem 
inner join tb_classe
on tb_classe.id=tb_personagem.classe_id where tb_classe.descricao = "Bruxo";

SELECT * FROM tb_personagem order by rand() limit 2;

