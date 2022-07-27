create database db_rpg;

use db_rpg;

create table tb_classe(
id bigint auto_increment,
nome varchar(255),
arma varchar(255),
descricao varchar(1000),
primary key(id)
);

create table tb_personagem(
id bigint auto_increment,
primary key (id),
nome varchar(255),
raca varchar(255),
ataque double,
defesa double,
hp int,
/*foreign key que esta intrelaçando com a id de classe.
*/
classe_id bigint,
foreign key (classe_id) references tb_classe(id)
);

select * from tb_classe;
select * from tb_personagem;

insert into tb_classe(nome, arma, descricao) values ('mago', 'livro', 'solta magia');
insert into tb_classe(nome, arma, descricao) values ('ladrao', 'espada', 'rouba');

insert into tb_personagem(nome, raca, ataque, defesa, hp, classe_id) values ('ale', 'humano', 1000, 500, 200,2);
insert into tb_personagem(nome, raca, ataque, defesa, hp, classe_id) values ('sandro', 'cachorro', 500, 1000, 400,1);











