use disk_cacamba;

create table cliente(
id int not null,
id_pessoa int not null,
primary key (id),
constraint fk_PesCli foreign key (id_pessoa) references pessoa(id_pessoa)
)default charset = utf8;