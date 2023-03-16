#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------

#------------------------------------------------------------
#        Creation de l utilisateur
#------------------------------------------------------------

CREATE DATABASE spring;

CREATE USER 'spring'@'localhost' IDENTIFIED BY 'spring';

GRANT ALL PRIVILEGES ON spring.* TO 'spring'@'localhost' WITH GRANT OPTION;

FLUSH PRIVILEGES;

USE spring;

#------------------------------------------------------------
# Table: contrat
#------------------------------------------------------------

CREATE TABLE contrat(
        id_contrat      Int  Auto_increment  NOT NULL ,
        description     Varchar (50) NOT NULL ,
        type_de_contrat Varchar (50) NOT NULL
	,CONSTRAINT contrat_PK PRIMARY KEY (id_contrat)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: client
#------------------------------------------------------------

CREATE TABLE client(
        id_client  Int  Auto_increment  NOT NULL ,
        nom        Varchar (50) NOT NULL ,
        prenom     Varchar (50) NOT NULL ,
        id_contrat Int NOT NULL
	,CONSTRAINT client_PK PRIMARY KEY (id_client)

	,CONSTRAINT client_contrat_FK FOREIGN KEY (id_contrat) REFERENCES contrat(id_contrat)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: conseiller
#------------------------------------------------------------

CREATE TABLE conseiller(
        id_conseiller Int  Auto_increment  NOT NULL ,
        nom           Varchar (50) NOT NULL ,
        prenom        Varchar (50) NOT NULL ,
        id_client     Int NOT NULL
	,CONSTRAINT conseiller_PK PRIMARY KEY (id_conseiller)

	,CONSTRAINT conseiller_client_FK FOREIGN KEY (id_client) REFERENCES client(id_client)
)ENGINE=InnoDB;

