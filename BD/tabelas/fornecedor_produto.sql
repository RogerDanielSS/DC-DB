use disk_cacamba;

create table fornecedor_produto(
id int not null,
id_fornecedor int not null,
id_produto int not null,
primary key (id),
constraint fk_forPes foreign key (id_fornecedor) references fornecedor(id),
constraint fk_forPr foreign key (id_produto) references produto(id)
)default charset = utf8;