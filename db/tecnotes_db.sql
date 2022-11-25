DROP DATABASE IF EXISTS tecnotes_db;
CREATE DATABASE tecnotes_db;
USE tecnotes_db;

create table alumno (
id_alumno INT          NOT NULL AUTO_INCREMENT,
carnet    VARCHAR(25)  NOT NULL,
nombre    VARCHAR(25)  NOT NULL,
apellido  VARCHAR(25)  NOT NULL,
carrera   VARCHAR(75)  NOT NULL,
email     VARCHAR(50)  NOT NULL,
pw        VARCHAR(250) NOT NULL,
CONSTRAINT pk_id_alumno PRIMARY KEY(id_alumno),
CONSTRAINT uq_carnet UNIQUE (carnet)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci; 

create table contactos (
id_contactos    INT         NOT NULL AUTO_INCREMENT,
nombre          VARCHAR(25) NOT NULL,
apellido        VARCHAR(25) NOT NULL,
telefono        VARCHAR(15) NOT NULL,
email           VARCHAR(50) NOT NULL,
carnet_contacto VARCHAR(25) NOT NULL, 
apunte          TEXT        NOT NULL,
id_alumno       INT         NOT NULL,
CONSTRAINT pk_id_contactos PRIMARY KEY(id_contactos)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci; 

create table notas (
id_notas   INT         NOT NULL AUTO_INCREMENT,
titulo     VARCHAR(25) NOT NULL,
notas      TEXT        NOT NULL,
id_alumno  INT         NOT NULL,
CONSTRAINT pk_id_notas PRIMARY KEY(id_notas)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci; 

-- Relacionamos las alumno con contactos
ALTER TABLE contactos 
ADD CONSTRAINT Fk_contacto_alumno FOREIGN KEY(id_alumno) 
REFERENCES alumno(id_alumno) ON DELETE CASCADE;
-- Relacionamos las alumno con notas
ALTER TABLE notas 
ADD CONSTRAINT Fk_notas_alumno FOREIGN KEY(id_alumno) 
REFERENCES alumno(id_alumno) ON DELETE CASCADE;

--
-- Procedimientos almacenados
--

-- Procedimiento almacenado para el inicio de sesion por medio del login en la tabla alumno
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_login_alumno;
CREATE PROCEDURE PA_login_alumno(
IN carnet_1  VARCHAR(25),
IN pw_1      VARCHAR(250)
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
SELECT * FROM alumno WHERE carnet = carnet_1 AND pw = pw_1;

-- Procedimiento para insertar alumno en la tabla alumno
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_insertar_alumno;
CREATE PROCEDURE PA_insertar_alumno(
IN carnet   VARCHAR(25),
IN nombre   VARCHAR(25),
IN apellido VARCHAR(25),
IN carrera  VARCHAR(75),
IN email    VARCHAR(50),
IN pw       VARCHAR(250)
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
INSERT INTO alumno VALUES (NULL,carnet,nombre,apellido,carrera,email,pw);

-- Procedimiento para editar alumno en la tabla alumno
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_actualizar_alumno;
CREATE PROCEDURE PA_actualizar_alumno(
IN id_alumno2  INT,
IN carrera2    VARCHAR(75),
IN email2      VARCHAR(50)
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
UPDATE alumno SET carrera=carrera2,email=email2
WHERE id_alumno=id_alumno2;

-- Procedimiento para buscar alumno en la tabla alumno
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_buscar_alumnos;
CREATE PROCEDURE PA_buscar_alumnos(
IN id_alumno1  INT
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
SELECT * FROM alumno WHERE id_alumno=id_alumno1;

-- Procedimiento para eliminar alumno en la tabla alumno
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_eliminar_alumno;
CREATE PROCEDURE PA_eliminar_alumno(
IN id_alumno1  INT
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
DELETE FROM alumno WHERE id_alumno=id_alumno1;

-- Procedimiento almacenado para insertar en la tabla contactos
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_insertar_contactos;
CREATE PROCEDURE PA_insertar_contactos(
IN nombre VARCHAR(25),
IN apellido VARCHAR(25),
IN telefono VARCHAR(15),
IN email VARCHAR(50),
IN carnet_contacto VARCHAR(25), 
IN apunte TEXT,
IN id_alumno INT
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
INSERT INTO contactos VALUES (NULL,nombre,apellido,telefono,email,carnet_contacto,apunte,id_alumno);

-- procedimiento almacenado para actualizar la tabla contactos
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_actualizar_contactos;
create procedure PA_actualizar_contactos(
IN id_contactos2 INT,
IN nombre2 VARCHAR(25),
IN apellido2 VARCHAR(25),
IN telefono2 VARCHAR(15),
IN email2 VARCHAR(50),
IN carnet_contacto2 VARCHAR(25), 
IN punte2 TEXT
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
UPDATE contactos SET nombre=nombre2,apellido=apellido2,telefono=telefono2,email=email2,
carnet_contacto=carnet_contacto2, apunte=punte2
WHERE id_contactos=id_contactos2;

-- procedimiento para eliminar un contacto de la tabla contactos
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_eliminar_contactos;
CREATE PROCEDURE PA_eliminar_contactos(
IN id_contactos1 INT
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
DELETE FROM contactos WHERE id_contactos=id_contactos1;

-- Procedimiento almacenado para insertar en la tabla notas
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_insertar_notas; 
create procedure PA_insertar_notas(
IN titulo      VARCHAR(25),
IN notas       TEXT,
IN id_alumno   INT
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
INSERT INTO notas VALUES(NULL,titulo,notas,id_alumno);

-- procedimiento almacenado para actualizar la tabla contactos
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_actualizar_notas; 
CREATE PROCEDURE PA_actualizar_notas(
IN id_notas2 INT,
IN titulo2 VARCHAR(25),
IN notas2 TEXT
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
UPDATE notas SET titulo=titulo2,notas=notas2
WHERE id_notas=id_notas2;

-- procedimiento para eliminar la tabla una nota de la tabla notas
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_eliminar_notas; 
CREATE PROCEDURE PA_eliminar_notas(
id_notas1  INT
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
DELETE FROM notas WHERE id_notas=id_notas1;

-- Consulta para el alumno a sus contactos
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_consulta_contactos; 
CREATE PROCEDURE PA_consulta_contactos (
IN id_alumno1 INT
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
SELECT * FROM contactos WHERE id_alumno = id_alumno1 ORDER BY id_contactos DESC;

-- PROBANDO EL PROCEDIMIENTO ALMACENADO PARA CONSULTAR ALUMNO A SUS CONTACTOS
-- CALL PA_consulta_contactos(2);

-- Consulta para el alumno
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_consulta_notas;
CREATE PROCEDURE PA_consulta_notas(
IN id_alumno1 INT
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
SELECT * FROM notas WHERE id_alumno = id_alumno1 ORDER BY id_notas DESC;

-- PROBANDO EL PROCEDIMIENTO ALMACENADO PARA CONSULTAR ALUMNO A SUS NOTAS
-- CALL PA_consulta_notas(2);

-- Consulta para el alumno
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_cantidad_contactos;
CREATE PROCEDURE PA_cantidad_contactos(
IN id_alumno1 INT
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
SELECT COUNT(*) AS cantidad_contactos FROM contactos WHERE id_alumno = id_alumno1;

-- PROBANDO EL PROCEDIMIENTO ALMACENADO PARA CONSULTAR ALUMNO A SUS CONTACTOS
-- CALL cantidad_contactos(2);

-- Consulta para el alumno
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_cantidad_notas;
CREATE PROCEDURE PA_cantidad_notas(
IN id_alumno1 int
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
SELECT COUNT(*) AS cantidad_notas FROM notas WHERE id_alumno = id_alumno1;

-- PROBANDO EL PROCEDIMIENTO ALMACENADO PARA CONSULTAR ALUMNO A SUS CONTACTOS
-- CALL cantidad_notas(2);

-- Procedimiento obtener la cantidad de carnet existentes
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_global_carnet;
CREATE PROCEDURE PA_global_carnet(
IN carnet_1  VARCHAR(25)
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
SELECT COUNT(*) AS cantidad_carnet FROM alumno WHERE carnet = carnet_1;

-- Procedimiento obtener la cantidad de carnet existentes
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_global_email;
CREATE PROCEDURE PA_global_email(
IN email_1  VARCHAR(150)
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
SELECT COUNT(*) AS cantidad_email FROM alumno WHERE email = email_1;

-- Procedimiento para procesar la nota automatica al registrarse
USE tecnotes_db;
DROP PROCEDURE IF EXISTS PA_nota_defecto; 
create procedure PA_nota_defecto(
IN nombre      VARCHAR(50),
IN id_alumno   INT
)NOT DETERMINISTIC CONTAINS SQL SQL SECURITY
DEFINER
INSERT INTO notas VALUES(NULL,"¡Hola, gracias!", concat("Gracias por registrarte ", nombre ,", disfruta de TecNotes."), id_alumno);

-- *************************************************************
-- TOTAL
-- 3 TABLAS PRINCIPALES
-- 2 RELACICONES DE TIPO FOREIGN KEY
-- 18 PROCEDIMIENTOS ALMACENADOS
-- TODAS SE UTILIZAN EN EL DESARROLLO DEL PROYECTO tecnotes_db
-- *************************************************************