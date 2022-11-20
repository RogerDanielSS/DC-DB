use disk_cacamba;

create table pessoa_juridica(
id int not null,
cnpj integer not null unique,
id_pessoa int not null,
primary key (id),
constraint fk_PesJPes foreign key (id_pessoa) references pessoa(id_pessoa)
)default charset = utf8;