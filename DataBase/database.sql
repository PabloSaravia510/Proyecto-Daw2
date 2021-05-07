CREATE database if not exists `db_proyecto_dawii`;
use `db_proyecto_dawii`;


drop table if exists `tb_carrera`;
create table `tb_carrera`(
COD_CAR int (8) not null primary key,
DES_CAR varchar(250) not null,
EST_REG char(1) not null
);


drop table if exists `tb_alumno`;
create table `tb_alumno`(
COD_ALU int (8) not null primary key,
NOM_ALU varchar(150) not null,
APE_ALU varchar(150) not null,
USU_ALU char(10) not null,
PASS_ALU char(16) not null,
COD_CAR int(8) not null,
EDAD_ALU int not null,
CEL_ALU char(9) not null,
DIR_ALU varchar(250) not null,
EST_REG char(1) not null
);


drop table if exists `tb_profesor`;
create table `tb_profesor`(
COD_PRO int (8) not null primary key,
NOM_PRO varchar(150) not null,
APE_PRO varchar(150) not null,
USU_PRO char(10) not null,
PASS_PRO char(16) not null,
COD_SEC int(8) not null,
EDAD_PRO int not null,
CEL_PRO char(9) not null,
DIR_PRO varchar(250) not null,
EST_PRO char(1) not null
);


drop table if exists `tb_horario`;
create table `tb_horario`(
COD_HOR int(8) not null primary key,
DES_HOR datetime not null
);


drop table if exists `tb_seccion`;
create table `tb_seccion`(
COD_SEC int(8) primary key not null,
DES_SEC char(4) not null,
COD_PRO int(8) not null,
COD_HOR int(8) not null,
LFAL_SEC int(2) not null,
LCLA_SEC int(2) not null,
EST_REG char(1) not null
);


drop table if exists `tb_clase`;
create table `tb_clase`(
COD_CLA int(8) not null primary key,
COD_SEC int(8)  not null,
EST_REG char(1) not null
);


drop table if exists `tb_asistencia`;
create table `tb_asistencia`(
COD_ASI int (8) not null primary key,
COD_ALU int(8) not null,
COD_CLA int(8) not null,
EST_REG char(1) not null
);




drop table if exists `tb_administrador`;
create table `tb_administrador`(
COD_ADMIN int (8) not null primary key,
NOM_ADMIN varchar(150) not null,
APE_ADMIN varchar(150) not null,
USU_ADMIN char(10) not null,
PASS_ADMIN char(16) not null,
COD_SEC int(8) not null,
COD_PRO int(8) not null,
COD_ALU int(8) not null,
EDAD_ADMIN int not null,
CEL_ADMIN char(9) not null,
DIR_ADMIN varchar(250) not null,
EST_REG char(1) not null
);



drop table if exists `tb_geolocalizacion`;
create table `tb_geolocalizacion`(
COD_GEO int(8) primary key not null,
COR_GEO char(4) not null,
COD_ALU char(1) not null
);




