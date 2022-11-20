use disk_cacamba;

create table veiculo(
id int not null,
carga_max integer,
marca varchar (60),
modelo varchar (60),
primary key (id)
)default charset = utf8;