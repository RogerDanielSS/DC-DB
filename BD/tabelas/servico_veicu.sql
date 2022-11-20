create table servico(
id int not null,
id_veic int not null,
id_servico int not null,
primary key (id),
constraint fk_SerV foreign key (id_servico) references servico(id),
constraint fk_SeVS foreign key (id_veic) references veiculo(id)
)default charset = utf8;