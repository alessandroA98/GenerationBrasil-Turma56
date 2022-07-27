/*Crie um banco de dados para um serviço de uma Pizzaria. 
O nome do Banco de dados deverá ter o seguinte nome db_pizzaria_legal.
 O sistema trabalhará com as informações dos produtos comercializados pela empresa.
 O sistema trabalhará com 2 tabelas tb_pizzas e tb_categorias, que deverão estar relacionadas.*/
 
 
 /*Crie a tabela tb_categorias e determine pelo menos 2 atributos, além da Chave Primária, 
 relevantes para classificar as pizzas.
Crie a tabela tb_pizzas e determine 4 atributos, além da Chave Primária, relevantes aos produtos da pizzaria.
*/
 create database db_pizzaria_legal;
 
 use db_pizzaria_legal;
 
 create table tb_pizzas(
 id bigint auto_increment,
 primary key (id),
 categoria_id bigint,
 foreign key (categoria_id) references tb_categoria(id),
 valor double,
 sabor varchar(50),
esfiha varchar(50),
saborBebida varchar(50)
);
 create table tb_categoria(
 id bigint auto_increment,
 primary key (id),
 pizza int,
 bebidas int
 );
 
 select * from tb_categoria;
 select * from tb_pizzas;
 /*Não esqueça de criar a Foreign Key da tabela tb_categorias na tabela tb_pizzas.
Insira 5 registros na tabela tb_categorias.
Insira 8 registros na tabela tb_pizzas, preenchendo a Chave Estrangeira para criar a relação com a tabela tb_categorias.
Faça um SELECT que retorne todas as pizzas cujo valor seja maior do que R$ 45,00.
Faça um SELECT que retorne todas as pizzas cujo valor esteja no intervalo R$ 50,00 e R$ 100,00.
*/

insert into tb_categoria(pizza, bebidas) values (2, 0);
insert into tb_categoria(pizza, bebidas) values (5, 3);
insert into tb_categoria(pizza, bebidas) values (2, 1);
insert into tb_categoria(pizza, bebidas) values (0, 2);
insert into tb_categoria(pizza, bebidas ) values (0, 2);
 
 insert into tb_pizzas(valor,sabor, saborBebida, esfiha, categoria_id) values (30.00, "chocolate e brocolis", "nenhum", "FRANGO", 1);
 insert into tb_pizzas(valor,sabor, saborBebida, esfiha,categoria_id) values (450.00, "TRES CHOCOLATES 2 frango com catupiry", "3 coca", "nenhum", 2);
 insert into tb_pizzas(valor,sabor, saborBebida, esfiha,categoria_id)  values (80.00, "mussarela", "fanta uva", "", 3);
insert into tb_pizzas(valor,sabor, saborBebida, esfiha,categoria_id)  values (100, "", "dolly", "FRANGO", 4);
 insert into tb_pizzas(valor,sabor, saborBebida, esfiha,categoria_id)  values (15.00, "", "", "carne", 5);
 insert into tb_pizzas(valor,sabor, saborBebida, esfiha,categoria_id)  values (48.00, "chocolate", "nenhum", "FRANGO", 1);
 
 select * from tb_pizzas where valor > 45.00;
 select * from tb_pizzas where valor >= 50.00 and valor <= 100.00;

/*Faça um SELECT utilizando o operador LIKE, buscando todas as pizzas que possuam a letra M no atributo nome.
Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da 
tabela tb_categorias.
Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os
 dados da tabela tb_categorias, onde traga apenas as pizzas que pertençam a uma categoria específica 
 (Exemplo: Todas as pizzas que são doce).
Salve todas as queries para cada um dos requisitos do exercício em um único script (arquivo .SQL) e coloque no seu Github pessoal, no repositório que você criou sobre Banco de dados.
*/

select * from tb_pizzas where sabor like "%M%";
 
select * from tb_pizzas inner join tb_categoria on tb_categoria.id = tb_pizzas.categoria_id;
select * from tb_pizzas LEFT JOIN tb_categoria on tb_pizzas.categoria_id = 3;
 