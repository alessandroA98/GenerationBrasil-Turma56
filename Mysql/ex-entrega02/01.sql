create database db_generation_game_online;
/*Crie a tabela tb_classes e determine pelo menos 2 atributos, além da Chave Primária, relevantes para classificar os personagens do Game Online.
Crie a tabela tb_personagens e determine 4 atributos, além da Chave Primária, relevantes aos personagens do Game Online.
Não esqueça de criar a Foreign Key da tabela tb_classes na tabela tb_personagens.
Insira 5 registros na tabela tb_classes.//
Insira 8 registros na tabela tb_personagens, preenchendo a Chave Estrangeira para criar a relação 
com a tabela tb_classes.//
Faça um SELECT que retorne todes os personagens cujo poder de ataque seja maior do que 2000.
Faça um SELECT que retorne todes os personagens cujo poder de defesa esteja no intervalo 1000 e 2000.
Faça um SELECT utilizando o operador LIKE, buscando todes os personagens que possuam a letra C no atributo nome.
Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens com os dados da tabela tb_classes.
Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens com os dados da tabela tb_classes, onde traga apenas os personagens que pertençam a uma classe específica (Exemplo: Todes os personagens da classe dos arqueiros).
Salve todas as queries para cada um dos requisitos do exercício em um único script (arquivo .SQL) e coloque no seu Github pessoal, no repositório que você criou sobre Banco de dados.
*/
use db_generation_game_online;

 create table tb_personagens(
 id bigint auto_increment,
 primary key (id),
 classe_id bigint,
 foreign key (classe_id) references tb_classes(id),
 nome varchar(100),
 nivel int,
 habilidade varchar(100),
 especial varchar(100)
 );
 create table tb_classes(
 id bigint auto_increment,
 primary key(id),
 tipo varchar(50),
 raca varchar(50)
 );
 
 select * from tb_personagens;
 select * from tb_classes;

insert into tb_classes(tipo, raca) values("cacador", "voador");
insert into tb_classes(tipo, raca) values("defensor", "rastejante");
insert into tb_classes(tipo, raca) values("arqueiro", "corredor");
insert into tb_classes(tipo, raca) values("defensor", "andante");
insert into tb_classes(tipo, raca) values("cacador", "teletransportador");

insert into tb_personagens(nome, nivel, habilidade, especial,classe_id) values ("alessandro", "52", "ataque", "atirar penas de lanca", 1);
insert into tb_personagens(nome, nivel, habilidade, especial, classe_id) values ("xita", "80", "defesa", "regeneração de aliados", 2);
insert into tb_personagens(nome, nivel, habilidade, especial, classe_id) values ("mac", "21", "ataque", "super flexada", 3);
insert into tb_personagens(nome, nivel, habilidade, especial, classe_id) values ("jose", "69", "ataque", "ficar invisivel", 4);
insert into tb_personagens(nome, nivel, habilidade, especial, classe_id) values ("momo", "47", "ataque", "tempo imune", 5);
insert into tb_personagens(nome, nivel, habilidade, especial,classe_id) values ("arc", "182", "defesa", "veloz", 1);
insert into tb_personagens(nome, nivel, habilidade, especial,classe_id) values ("yanushi", "512", "ataque", "martelada", 2);
insert into tb_personagens(nome, nivel, habilidade, especial,classe_id) values ("zoe", "214", "defesa", "levanta uma barreira", 3);

select * from tb_personagens where nivel > 80;
select * from tb_personagens where nivel > 80 and nivel < 200;
select * from tb_personagens where nome like "%C%";
select * from tb_personagens inner join tb_classes on tb_classes.id = tb_personagens.classe_id;
select * from tb_personagens inner join tb_classes on tb_personagens.classe_id = 3;