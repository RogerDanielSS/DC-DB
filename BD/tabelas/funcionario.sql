use disk_cacamba;

create table funcionario(
id int not null,
nome varchar (60),
cpf integer not null unique,
senha varchar (30) not null,
token integer unique not null,
primary key (id)
)default charset = utf8;