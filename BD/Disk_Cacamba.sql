create database disk_cacamba
default character set utf8
default collate utf8_general_ci;

use  disk_cacamba;

create table administrador(
 id integer not null auto_increment,
 email varchar(60) not null unique,
 cpf   NUMERIC(11),
 nome varchar(60) not null,
 senha varchar(60) not null,
 primary key(id)
) default charset = utf8;

create table pessoa(
id int not null auto_increment,
nome varchar(60) not null,
endereco varchar (60) not null,
primary key(id)
) default charset = utf8;

create table fornecedor(
id int not null auto_increment,
id_pessoa int not null,
primary key (id),
constraint fk_forPes foreign key (id_pessoa) references pessoa(id)
)default charset = utf8;

create table fornecedor_produto(
id int not null auto_increment,
id_fornecedor int not null,
id_produto int not null,
primary key (id),
constraint fk_forPes foreign key (id_fornecedor) references fornecedor(id),
constraint fk_forPr foreign key (id_produto) references produto(id)
)default charset = utf8;

create table pessoa_fisica(
id int not null auto_increment,
cpf NUMERIC(11) not null unique,
id_pessoa int not null,
primary key (id),
constraint fk_PesFPes foreign key (id_pessoa) references pessoa(id)
)default charset = utf8;

create table oficina(
id int not null auto_increment,
cnpj NUMERIC(14) not null unique,
endereco varchar(60),
telefone varchar(60),
nome varchar(30) not null,
primary key (id)
)default charset = utf8;

create table pessoa_juridica(
id int not null auto_increment,
cnpj NUMERIC(14) not null unique,
id_pessoa int not null,
primary key (id),
constraint fk_PesJPes foreign key (id_pessoa) references pessoa(id)
)default charset = utf8;

create table cliente(
id int not null auto_increment,
id_pessoa int not null,
primary key (id),
constraint fk_PesCli foreign key (id_pessoa) references pessoa(ids)
)default charset = utf8;

create table manutencao(
id int not null auto_increment,
valor float,
descricao varchar (300),
data_M date,
id_veiculo int not null,
primary key (id),
constraint fk_manut foreign key (id_veiculo) references veiculo(id)
)default charset = utf8;

create table veiculo(
id int not null auto_increment,
placa varchar(7);
carga_max integer,
marca varchar (60),
modelo varchar (60),
primary key (id)
)default charset = utf8;

create table servico_veiculo(
id int not null auto_increment,
id_veic int not null,
id_servico int not null,
primary key (id),
constraint fk_SerV foreign key (id_servico) references servico(id),
constraint fk_SeVS foreign key (id_veic) references veiculo(id)
)default charset = utf8;

create table servico(
id int not null auto_increment,
id_atend int not null,
descricao varchar(200),
valor float,
data_inicio date,
daata_fim date,
primary key (id),
constraint fk_SeAtnd foreign key (id_atend) references atendimento(id)
)default charset = utf8;

create table atendimento(
id int not null auto_increment,
id_cliente int not null,
id_funcionario int not null,
endereco varchar (60) not null,
primary key (id),
constraint fk_PesFPes foreign key (id_funcionario) references funcionario(id),
constraint fk_atCli foreign key (id_cliente) references cliente(id),
constraint fk_atADM foreign key (id_administrador) references administrador(id)
)default charset = utf8;

create table produto(
id int not null auto_increment,
preco_metro float not null,
nome varchar(60),
primary key (id)
)default charset = utf8;

create table funcionario(
id int not null auto_increment,
nome varchar (60),
cpf NUMERIC(11) not null unique,
senha varchar (30),
token integer unique not null,
primary key (id)
)default charset = utf8;

create table token(
id int not null auto_increment,
id_adm int not null,
token varchar(60) not null unique,
primary key (id),
constraint fk_toADM foreign key (id_adm) references produto(id)
)default charset = utf8;

create table venda(
id int not null auto_increment,
id_produto int not null,
id_atend int not null,
quantidade float,
dataV date,
primary key (id),
constraint fk_Vpro foreign key (id_produto) references produto(id),
constraint fk_Vaten foreign key (id_atend) references atendimento(id)
)default charset = utf8;




