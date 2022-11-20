use disk_cacamba;

create table venda(
id int not null,
id_produto int not null,
id_atend int not null,
quantidade float,
dataV date,
primary key (id),
constraint fk_Vpro foreign key (id_produto) references produto(id),
constraint fk_Vaten foreign key (id_atend) references atendimento(id)
)default charset = utf8;