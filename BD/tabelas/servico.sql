use disk_cacamba;

create table servico(
id int not null,
id_atend int not null,
descricao varchar(200),
valor float,
data_inicio date,
daata_fim date,
primary key (id),
constraint fk_SeAtnd foreign key (id_atend) references atendimento(id)
)default charset = utf8;