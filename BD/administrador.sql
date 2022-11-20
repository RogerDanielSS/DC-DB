
use disk_cacamba;

create table administrador(
 id integer not null auto_increment,
 email varchar(60) not null unique,
 cpf   integer,
 nome varchar(60) not null,
 senha varchar(60) not null,
 primary key(id)
) default charset = utf8;