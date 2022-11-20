create table oficina(
id int not null,
cnpj integer not null unique,
endereco varchar(60),
telefone varchar(60),
nome varchar(30) not null,
primary key (id)
)default charset = utf8;
