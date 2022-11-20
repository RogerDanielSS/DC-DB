use disk_cacamba;

create table pessoa_fisica(
id int not null,
cpf integer not null unique,
id_pessoa int not null,
primary key (id),
constraint fk_PesFPes foreign key (id_pessoa) references pessoa(id_pessoa)
)default charset = utf8;