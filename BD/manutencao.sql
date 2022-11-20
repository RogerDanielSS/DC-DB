create table manutencao(
id int not null,
valor float,
descricao varchar (300),
data_M date,
id_veiculo int not null,
primary key (id),
constraint fk_manut foreign key (id_veiculo) references veiculo(id)
)default charset = utf8;