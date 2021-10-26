CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

create table tb_categoria (
	id bigint auto_increment,
	categoria varchar (255) not null,
    tipo varchar (255) not null,
    ativo boolean,
    primary key (id)		
    );
    
    select * from tb_categoria;

    insert into tb_categoria (categoria, tipo, ativo) values ("Pizza","Salgada",1);
	insert into tb_categoria (categoria, tipo, ativo) values ("Broto","Salgada",1);
    insert into tb_categoria (categoria, tipo, ativo) values ("Esfiha","Salgada",1);
    insert into tb_categoria (categoria, tipo, ativo) values ("Pizza","Doce",1);
    insert into tb_categoria (categoria, tipo, ativo) values ("Broto","Doce",1);
    insert into tb_categoria (categoria, tipo, ativo) values ("Esfiha","Doce,",0);
    
	create table tb_pizza(
			id bigint auto_increment,
		    sabor varchar (255) not null,
            tamanho varchar (255) not null,
            preco decimal (6,2) not null,
            recheio_borda varchar (255) not null,
            categoria_id bigint,
            
            primary key (id),
            foreign key (categoria_id) REFERENCES tb_categoria (id)           
    );
    
    select * from tb_pizza;
    
    insert into tb_pizza (sabor, tamanho, preco,recheio_borda, categoria_id) values ("Pepperoni com Catupiry","Grande",75,"Com catupiry",1);
	insert into tb_pizza (sabor, tamanho, preco,recheio_borda, categoria_id) values ("Palmito com Mussarela","Grande",95,"Com catupiry",1);
	insert into tb_pizza (sabor, tamanho, preco,recheio_borda, categoria_id) values ("Calabresa","Média",25,"Sem borda recheada",2);
	insert into tb_pizza (sabor, tamanho, preco,recheio_borda, categoria_id) values ("Marguerita","Média",30,"Sem borda recheada",2);
	insert into tb_pizza (sabor, tamanho, preco,recheio_borda, categoria_id) values ("Doce de leite com banana","Grande",75,"Com chocolate",4);
	insert into tb_pizza (sabor, tamanho, preco,recheio_borda, categoria_id) values ("Romeu e Julieta","Média",38,"Sem borda recehada",5);
    insert into tb_pizza (sabor, tamanho, preco,recheio_borda, categoria_id) values ("Bacon com queijo","Pequena",7,"Sem borda",3);
	insert into tb_pizza (sabor, tamanho, preco,recheio_borda, categoria_id) values ("Aliche","Pequena",15,"Sem borda",3);
    
    select * from tb_pizza where preco > 45;
    
    select * from tb_pizza where preco between 29 and 60;
    
    select * from tb_pizza where sabor like "%d%";
    
	select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;
    
    select tb_categoria.categoria, tb_pizza.tamanho, tb_pizza.sabor, tb_pizza.recheio_borda, tb_pizza.preco
    from tb_pizza inner join tb_categoria
    on tb_categoria.id = tb_pizza.categoria_id;
    
    select * from tb_pizza where categoria_id in(4,5); 