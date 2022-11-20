use disk_cacamba;

create table pessoa(
id_pessoa int not null auto_increment,
nome varchar(60) not null,
endereco varchar (60) not null,
Cliente_id integer not null,
constraint fk_CliPes foreign key (Cliente_id) references cliente(id_cliente),
primary key(id_pessoa)
) default charset = utf8;
