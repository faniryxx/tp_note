#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------

#------------------------------------------------------------
#        Creation de l utilisateur
#------------------------------------------------------------

DROP DATABASE IF EXISTS spring;

CREATE DATABASE spring;

CREATE USER IF NOT EXISTS 'spring'@'localhost' IDENTIFIED BY 'spring';

GRANT ALL PRIVILEGES ON spring.* TO 'spring'@'localhost' WITH GRANT OPTION;

FLUSH PRIVILEGES;

USE spring;
#------------------------------------------------------------

CREATE TABLE Conseiller(
        id_conseiller Int  Auto_increment  NOT NULL ,
        nom           Varchar (50) NOT NULL ,
        prenom        Varchar (50) NOT NULL
	,CONSTRAINT Conseiller_PK PRIMARY KEY (id_conseiller)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: client
#------------------------------------------------------------

CREATE TABLE client(
        id_client     Int  Auto_increment  NOT NULL ,
        nom           Varchar (50) NOT NULL ,
        prenom        Varchar (50) NOT NULL ,
        id_conseiller Int NOT NULL
	,CONSTRAINT client_PK PRIMARY KEY (id_client)

	,CONSTRAINT client_Conseiller_FK FOREIGN KEY (id_conseiller) REFERENCES Conseiller(id_conseiller)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: contrat
#------------------------------------------------------------

CREATE TABLE contrat(
        id_contrat     Int  Auto_increment  NOT NULL ,
        type_de_conrat Varchar (50) NOT NULL ,
        description    Varchar (50) NOT NULL ,
        id_client      Int NOT NULL
	,CONSTRAINT contrat_PK PRIMARY KEY (id_contrat)

	,CONSTRAINT contrat_client_FK FOREIGN KEY (id_client) REFERENCES client(id_client)
)ENGINE=InnoDB;

