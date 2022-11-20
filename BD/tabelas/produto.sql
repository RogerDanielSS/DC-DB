use disk_cacamba;


create table produto(
id int not null,
preco_metro float not null,
nome varchar(60),
primary key (id)
)default charset = utf8;
