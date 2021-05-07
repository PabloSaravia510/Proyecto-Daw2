CREATE database if not exists `db_proyecto_dawii`;
use `db_proyecto_dawii`;

drop table if exists `tb_alumno`;
create table `tb_alumno`(
COD_ALU int (8) not null primary key,
NOM_ALU varchar(50) not null,
APE_ALU varchar(50) not null,
EDAD_ALU int not null,
DIR_ALU varchar(50) not null,
USU_ALU varchar(80) not null,
CEL_ALU char(9) not null,
PASS_ALU varchar(50) not null,
EST_REG char(1) not null,
COD_CAR int(8) not null
);

drop table if exists `tb_carrera`;
create table `tb_carrera`(
COD_CAR int (8) not null primary key,
DES_CAR varchar(50) not null,
EST_REG char(1) not null
);





























drop table if exists `tb_asistencia`;
create table `tb_asistencia`(
COD_ASI int (8) not null primary key,
COD_ALU int(8) not null
COD_CLA int(8) not null
EST_REG char(1) not null
);



