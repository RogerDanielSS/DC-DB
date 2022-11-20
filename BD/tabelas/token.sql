use disk_cacamba;

create table token(
id int not null,
id_adm int not null,
primary key (id),
constraint fk_toADM foreign key (id_adm) references produto(id)
)default charset = utf8;