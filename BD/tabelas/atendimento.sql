use disk_cacamba;

create table atendimento(
id int not null,
cpf integer not null unique,
id_cliente int not null,
id_funcionario int not null,
id_administrador int not null,
endereco varchar (60) not null,
primary key (id),
constraint fk_PesFPes foreign key (id_funcionario) references funcionario(id),
constraint fk_atCli foreign key (id_cliente) references cliente(id),
constraint fk_atADM foreign key (id_administrador) references administrador(id)
)default charset = utf8;