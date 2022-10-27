CREAT DATABASE IF NOT EXIST estacionamento;
USE estacionemento;

CREATE TABLE vaga (
    idVaga      int NOT NULL AUTO_INCREMENT,
    numero      int NOT NULL,
    rua         varchar(100) NOT NULL,
    obliqua     boolean NOT NULL,
    PRIMARY KEY (idVaga)
);

create table motorista (
    idMotorista int NOT NULL AUTO_INCREMENT,
    nome        varchar (100) NOT NULL,
    genero      varchar(32) NOT NULL,
    rg          int NOT NULL,
    cpf         int NOT NULL,
    celular     int NOT NULL,
    email       varchar (50),
    senha       varchar (32)
    PRIMARY KEY (idMotorista)
);