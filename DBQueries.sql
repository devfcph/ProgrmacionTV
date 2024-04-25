CREATE DATABASE DBTelevisora;

USE DBTelevisora;

CREATE TABLE Canal (
                       idCanal int auto_increment primary key,
                       nombre varchar(50) not null,
                       is_visible tinyint,
                       sys_dtcreation datetime default current_timestamp,
                       sys_dtupdated datetime,
                       sys_deleted datetime,
                       sys_guid varchar(35) DEFAULT (REPLACE(uuid(), '-', ''))
);


CREATE TABLE Programa (
                          idPrograma int auto_increment primary key,
                          nombre varchar(50) not null,
                          is_visible tinyint,
                          sys_dtcreation datetime default current_timestamp,
                          sys_dtupdated datetime,
                          sys_deleted datetime,
                          sys_guid varchar(35) DEFAULT (REPLACE(uuid(), '-', ''))
);


CREATE TABLE Programacion (
                              idProgramacion int auto_increment primary key,
                              idCanal int,
                              idPrograma int,
                              horario time,
                              fecha_evento date,
                              duracion varchar(10),
                              is_visible tinyint,
                              sys_dtcreation datetime default current_timestamp,
                              sys_dtupdated datetime,
                              sys_deleted datetime,
                              sys_guid varchar(35) DEFAULT (REPLACE(uuid(), '-', ''))
);
