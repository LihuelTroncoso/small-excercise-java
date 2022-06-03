# Host: localhost  (Version 8.0.26)
# Date: 2021-10-27 10:42:52
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "alumno"
#
create database instituto;
use instituto;

DROP TABLE IF EXISTS `alumno`;
CREATE TABLE `alumno` (
  `legajo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `promedio` double DEFAULT NULL,
  PRIMARY KEY (`legajo`)
) ;

#
# Data for table "alumno"
#

