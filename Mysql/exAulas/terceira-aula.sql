create database db_exemplo_func;

use db_exemplo_func;

create table func(
nome varchar(100),
idade int, 
id bigint auto_increment,
primary key(id)
);
create table cargo(
cargo varchar(50),
salarion double,
cargo_id bigint,
foreign key(cargo_id) references func(id)
);

select * from func;
select * from cargo;

insert into func (nome, idade) values ("alessandro", 24, 2);
insert into func (nome, idade) values ("ale", 40, 1);
insert into func (nome, idade) values ("junior", 50, 3);
insert into func (nome, idade) values ("adriano", 52, 1);
insert into func (nome, idade) values ("maicon", 41, 2);
insert into func (nome, idade) values ("valdirene", 36, 3);
insert into func (nome, idade) values ("julia", 41, 1);
insert into func (nome, idade) values ("maite", 26, 2);

insert into cargo(cargo, salarion) values ("dev Junior", 3000);
insert into cargo(cargo, salarion) values ("dev pleno", 5000);
insert into cargo(cargo, salarion) values ("dev senior", 9000);


