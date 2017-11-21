use trab_prog_ii;

select * from trab_prog_ii.endereco;

drop table trab_prog_ii.endereco;

create table usuario (
 id_usuario int AUTO_INCREMENT primary key,
 nome varchar(50) not null,
 sobrenome varchar(50) not null
);

create table endereco (
 id_endereco int AUTO_INCREMENT primary key,
 logradouro varchar(50) not null,
 complemento varchar(50),
 bairro varchar(50) not null,
 numero varchar(50) not null,
 cep varchar(50) not null
 );
 
 create table perfil (
  id_perfil int AUTO_INCREMENT primary key,
  nomeperfil varchar(20) not null,
  descricao varchar(50) not null
  );
  
  