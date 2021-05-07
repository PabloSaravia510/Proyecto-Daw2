CREATE database if not exists `db_proyecto_dawii`;
use `db_proyecto_dawii`;

drop table if exists `tb_alumnos`;
create table `tb_alumnos`(
id int (8) not null primary key,
nombre varchar(50) not null,
estado char not null 
);












































drop table if exists `tb_seccion`;
create table `tb_seccion`(
COD_SEC int(8) primary key not null,
DES_SEC char(4) not null,
EST_REG char(1) not null,
LFAL_SEC int(2) not null,
LCLA_SEC int(2) not null,
COD_PRO int(8) not null,
COD_HOR int(8) not null
);