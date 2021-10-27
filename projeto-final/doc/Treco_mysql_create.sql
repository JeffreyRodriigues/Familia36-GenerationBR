CREATE TABLE `tb_usuario` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`nomecompleto` varchar(255) NOT NULL,
	`usuario` varchar(255) NOT NULL,
	`senha` varchar(255) NOT NULL UNIQUE,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tb_categoria` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`nomecategoria` varchar(255) NOT NULL,
	`descricao` varchar(255) NOT NULL,
	`ativo` BOOLEAN NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tb_produto` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`nomeproduto` varchar(255) NOT NULL,
	`descricao` varchar(255) NOT NULL,
	`preco` DECIMAL(8,2) NOT NULL,
	`imagem` varchar(255) NOT NULL,
	`categoria_id` bigint NOT NULL,
	`usuario_id` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `tb_produto` ADD CONSTRAINT `tb_produto_fk0` FOREIGN KEY (`categoria_id`) REFERENCES `tb_categoria`(`id`);

ALTER TABLE `tb_produto` ADD CONSTRAINT `tb_produto_fk1` FOREIGN KEY (`usuario_id`) REFERENCES `tb_usuario`(`id`);




