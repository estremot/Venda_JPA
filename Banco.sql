create database estoque,

create table produto(
	codproduto serial primary key,
	nomeproduto varchar(80) not null unique,
	valor numeric(10,2) not null,
	quantidade numeric(10,2) not null

);

create table cliente(
	codcliente serial primary key,
	nomecliente varchar(80) not null
);

create table venda(
	codvenda serial primary key,
	datavenda varchar(20) not null,
	codcliente_fk integer references cliente(codcliente)
);

create table itensvenda(
	codvenda_fk integer references venda(codvenda),
	codproduto_fk integer references produto(codproduto),
	quantv numeric(10,2) not null,
	valorv numeric(10,2) not null
);