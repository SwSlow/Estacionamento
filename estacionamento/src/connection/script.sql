CREAT DATABASE IF NOT EXIST estacionamento;
USE estacionemento;

CREATE TABLE vaga (
    idVage int NOT NULL AUTO_INCREMENT,
    numero int NOT NULL,
    rua varchar(100) NOT NULL,
    obliqua boolean NOT NULL,
    PRIMARY KEY (idVaga));
)