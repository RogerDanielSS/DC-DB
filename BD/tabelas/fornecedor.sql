use disk_cacamba;

create table fornecedor(
id int not null,
id_pessoa int not null,
primary key (id),
constraint fk_forPes foreign key (id_pessoa) references pessoa(id_pessoa)
)default charset = utf8;