DROP DATABASE `db_proyecto_dawii`;
CREATE database `db_proyecto_dawii`;
use `db_proyecto_dawii`;


drop table if exists `tb_carrera`;
create table `tb_carrera`(
COD_CAR int (8) not null auto_increment primary key,
DES_CAR varchar(250) not null,
EST_REG char(1) not null
);


drop table if exists `tb_alumno`;
create table `tb_alumno`(
COD_ALU int (8) not null auto_increment primary key,
NOM_ALU varchar(150) not null,
APE_ALU varchar(150) not null,
USU_ALU char(10) not null,
PASS_ALU char(16) not null,
COD_CAR int(8) not null,
EDAD_ALU int not null,
CEL_ALU char(9) not null,
DIR_ALU varchar(250) not null,
ROL_USU int not null,
EST_REG char(1) not null
);


drop table if exists `tb_profesor`;
create table `tb_profesor`(
COD_PRO int (8) not null auto_increment primary key,
NOM_PRO varchar(150) not null,
APE_PRO varchar(150) not null,
USU_PRO char(10) not null,
PASS_PRO char(16) not null,
EDAD_PRO int not null,
CEL_PRO char(9) not null,
DIR_PRO varchar(250) not null,
ROL_USU int not null,
EST_REG char(1) not null

);


drop table if exists `tb_horario`;
create table `tb_horario`(
COD_HOR int(8) not null auto_increment primary key,
DES_HOR datetime not null
);


drop table if exists `tb_seccion`;
create table `tb_seccion`(
COD_SEC int(8)  not null auto_increment primary key,
DES_SEC char(4) not null,
DES_CURS varchar(50) not null,
NOTA_1 int(2) not null,
NOTA_2 int(2) not null,
COD_PRO int(8) not null,
COD_HOR int(8) not null,
LFAL_SEC int(2) not null,
LCLA_SEC int(2) not null,
EST_REG char(1) not null
);


drop table if exists `tb_det_sec_alu`;
create table `tb_det_sec_alu`(
COD_SEC int(8) not null,
COD_ALU int(8) not null,
primary key (COD_SEC,COD_ALU)
);



drop table if exists `tb_clase`;
create table `tb_clase`(
COD_CLA int(8) not null auto_increment primary key,
COD_SEC int(8)  not null,
EST_REG char(1) not null
);


drop table if exists `tb_asistencia`;
create table `tb_asistencia`(
COD_ASI int (8) not null auto_increment primary key,
COD_ALU int(8) not null,
COD_CLA int(8) not null,
EST_REG char(1) not null
);




drop table if exists `tb_geolocalizacion`;
create table `tb_geolocalizacion`(
COD_GEO int(8)  not null auto_increment primary key,
COR_GEO char(4) not null,
COD_ALU int(8) not null
);



drop table if exists `tb_administrador`;
create table `tb_administrador`(
COD_ADMIN int (8) not null auto_increment primary key,
NOM_ADMIN varchar(150) not null,
APE_ADMIN varchar(150) not null,
USU_ADMIN char(10) not null,
PASS_ADMIN char(16) not null,
ROL_USU int not null,
EST_REG char(1) not null
);


drop table if exists `tb_QR`;
create table `tb_QR`(
COD_QR int(8)  not null auto_increment primary key,
DES_QR varchar(50) not null,
FEC_QR datetime not null
);


-------------------------------------------------------------------------------------------------------------

ALTER TABLE tb_alumno
	ADD	CONSTRAINT FK_ALU_COD_CAR_ID FOREIGN KEY (COD_CAR) REFERENCES tb_carrera (COD_CAR);
ALTER TABLE tb_seccion
	ADD	CONSTRAINT FK_SEC_COD_PRO_ID FOREIGN KEY (COD_PRO) REFERENCES tb_profesor (COD_PRO),
    ADD	CONSTRAINT FK_SEC_COD_HOR_ID FOREIGN KEY (COD_HOR) REFERENCES tb_horario (COD_HOR);
ALTER TABLE tb_clase
	ADD	CONSTRAINT FK_CLA_COD_SEC_ID FOREIGN KEY (COD_SEC) REFERENCES tb_seccion (COD_SEC);
ALTER TABLE tb_asistencia
	ADD	CONSTRAINT FK_ASI_COD_ALU_ID FOREIGN KEY (COD_ALU) REFERENCES tb_alumno (COD_ALU),
    ADD	CONSTRAINT FK_ASI_COD_CLA_ID FOREIGN KEY (COD_CLA) REFERENCES tb_clase (COD_CLA);
ALTER TABLE tb_geolocalizacion
	ADD	CONSTRAINT FK_GEO_COD_ALU_ID FOREIGN KEY (COD_ALU) REFERENCES tb_alumno (COD_ALU);
ALTER TABLE tb_det_sec_asu
	ADD	CONSTRAINT FK_DET_SEC_ALU_COD_SEC_ID FOREIGN KEY (COD_SEC) REFERENCES tb_seccion (COD_SEC),
    ADD	CONSTRAINT FK_DET_SEC_ALU_COD_ALU_ID FOREIGN KEY (COD_ALU) REFERENCES tb_alumno (COD_ALU);   















    




