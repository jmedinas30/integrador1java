-- Creación de la base de datos
CREATE DATABASE dbveterinaria;

-- Selección de la base de datos
USE dbveterinaria;

-- Creación de la tabla departamento
CREATE TABLE `departamento` (
  `id_departamento` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id_departamento`)
);

-- Creación de la tabla provincia
CREATE TABLE `provincia` (
  `id_provincia` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(50) NOT NULL,
  `id_departamento` INT(11) NOT NULL,
  PRIMARY KEY (`id_provincia`),
  FOREIGN KEY (`id_departamento`) REFERENCES `departamento` (`id_departamento`) ON DELETE CASCADE ON UPDATE CASCADE
);

-- Creación de la tabla distrito
CREATE TABLE `distrito` (
  `id_distrito` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(50) NOT NULL,
  `id_provincia` INT(11) NOT NULL,
  PRIMARY KEY (`id_distrito`),
  FOREIGN KEY (`id_provincia`) REFERENCES `provincia` (`id_provincia`) ON DELETE CASCADE ON UPDATE CASCADE
);

-- Creación de la tabla personal
CREATE TABLE `personal` (
  `id_personal` INT(11) NOT NULL AUTO_INCREMENT,
  `nombres` VARCHAR(50) NOT NULL,
  `apellidos` VARCHAR(50) NOT NULL,
  `dni` VARCHAR(8) NOT NULL,
  `direccion` VARCHAR(100) NOT NULL,
  `id_distrito` INT(11) NOT NULL,
  `id_provincia` INT(11) NOT NULL,
  `id_departamento` INT(11) NOT NULL,
  `telefono` VARCHAR(20) NOT NULL,
  `correo` VARCHAR(50) NOT NULL,
  `tipo_personal` ENUM('veterinario','administrativo') NOT NULL,
  `usuario` VARCHAR(50) NOT NULL,
  `contrasena` VARCHAR(32) NOT NULL,
  `estado` ENUM('activo','inactivo') NOT NULL,  
  PRIMARY KEY (`id_personal`),
  FOREIGN KEY (`id_distrito`) REFERENCES `distrito` (`id_distrito`) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (`id_provincia`) REFERENCES `provincia` (`id_provincia`) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (`id_departamento`) REFERENCES `departamento` (`id_departamento`) ON DELETE CASCADE ON UPDATE CASCADE
);

-- Creación de la tabla especie
CREATE TABLE Especie (
  id_especie INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  PRIMARY KEY (id_especie)
);

-- Creación de la tabla raza
CREATE TABLE Raza (
  id_raza INT NOT NULL AUTO_INCREMENT,
  id_especie INT NOT NULL,
  nombre VARCHAR(50) NOT NULL,
  PRIMARY KEY (id_raza),
  FOREIGN KEY (id_especie) REFERENCES Especie(id_especie)
    ON DELETE CASCADE ON UPDATE CASCADE
);

-- Creación de la tabla cliente
CREATE TABLE cliente (
    id_cliente int NOT NULL AUTO_INCREMENT,
    nombre varchar(100) NOT NULL,
    apellidos varchar(100) NOT NULL,
    dni varchar(8) NOT NULL,
    telefono varchar(15) NOT NULL,
    correo varchar(100) NOT NULL,
    direccion varchar(255) NOT NULL,
    id_departamento int NOT NULL,
    id_provincia int NOT NULL,
    id_distrito int NOT NULL,
	foto VARCHAR(100),
    PRIMARY KEY (id_cliente),
    FOREIGN KEY (id_departamento) REFERENCES departamento(id_departamento),
    FOREIGN KEY (id_provincia) REFERENCES provincia(id_provincia),
    FOREIGN KEY (id_distrito) REFERENCES distrito(id_distrito)
);


-- Creación de la tabla mascota
CREATE TABLE Mascota (
  id_mascota INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  fecha_nacimiento DATE NOT NULL,
  id_cliente INT NOT NULL,
  id_especie INT NOT NULL,
  id_raza INT NOT NULL,
  sexo ENUM('Macho', 'Hembra') NOT NULL,
  foto VARCHAR(100),
  PRIMARY KEY (id_mascota),
  FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
    ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (id_especie) REFERENCES especie(id_especie)
    ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (id_raza) REFERENCES raza(id_raza)
    ON DELETE CASCADE ON UPDATE CASCADE
);


-- Creación de la tabla cita
CREATE TABLE cita (
  id_cita INT PRIMARY KEY AUTO_INCREMENT,
  fecha_hora TIMESTAMP NOT NULL,
  id_mascota INT NOT NULL,
  id_veterinario INT NOT NULL,
  FOREIGN KEY (id_mascota) REFERENCES mascota(id_mascota),
  FOREIGN KEY (id_veterinario) REFERENCES personal(id_personal)
);

-- Creación de la tabla historial_medico
CREATE TABLE historial_medico (
  id_historial INT PRIMARY KEY AUTO_INCREMENT,
  fecha DATE NOT NULL,
  diagnostico VARCHAR(500) NOT NULL,
  id_mascota INT NOT NULL,
  FOREIGN KEY (id_mascota) REFERENCES mascota(id_mascota)
);

-- Creación de la tabla tratamiento
CREATE TABLE tratamiento (
  id_tratamiento INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  precio DECIMAL(8,2) NOT NULL
);

-- Creación de la tabla historial_medico_tratamiento
CREATE TABLE detalle_historial_medico (
  id_detalle INT AUTO_INCREMENT PRIMARY KEY,
  id_historial INT NOT NULL,
  id_tratamiento INT NOT NULL,
  precio DECIMAL(10,2) NOT NULL,
  FOREIGN KEY (id_historial) REFERENCES historial_medico(id_historial),
  FOREIGN KEY (id_tratamiento) REFERENCES tratamiento(id_tratamiento)
);


-- Creación de la tabla prescripcion_medica
CREATE TABLE prescripcion_medica (
    id_prescripcion_medica INT AUTO_INCREMENT,
    medicamento TEXT,
    dosis TEXT,
    duracion TEXT,
    id_historial INT,
    PRIMARY KEY (id_prescripcion_medica),
    FOREIGN KEY (id_historial) REFERENCES historial_medico(id_historial)
);

-- Creación de la tabla vacunas
CREATE TABLE vacunas (
    id_vacuna INT NOT NULL AUTO_INCREMENT,
    nombre_vacuna VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_vacuna)
);

-- Creación de la tabla programacion_vacunas
CREATE TABLE programacion_vacunas (
    id_programacion_vacuna INT NOT NULL AUTO_INCREMENT,
    id_mascota INT NOT NULL,
    id_vacuna INT NOT NULL,
    fecha_programada DATE NOT NULL,
    fecha_aplicacion DATE DEFAULT NULL,
    precio DECIMAL(8, 2) NOT NULL,
    estado ENUM('pendiente', 'aplicada', 'cancelada') NOT NULL DEFAULT 'pendiente',
    PRIMARY KEY (id_programacion_vacuna),
    FOREIGN KEY (id_mascota) REFERENCES mascota(id_mascota),
    FOREIGN KEY (id_vacuna) REFERENCES vacunas(id_vacuna)
);


-- Creación de la tabla notificación
CREATE TABLE Notificacion (
    id_notificacion INT NOT NULL AUTO_INCREMENT,
    id_cliente INT NOT NULL,
    id_mascota INT NOT NULL,
    id_programacion_vacuna INT,
    id_cita INT ,
    tipo_notificacion VARCHAR(50) NOT NULL,
    fecha_envio DATE NOT NULL,
    PRIMARY KEY (id_notificacion),
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente),
    FOREIGN KEY (id_mascota) REFERENCES Mascota(id_mascota),
    FOREIGN KEY (id_programacion_vacuna) REFERENCES programacion_vacunas(id_programacion_vacuna),
    FOREIGN KEY (id_cita) REFERENCES cita(id_cita)
);

-- Creación de la tabla control de acceso
CREATE TABLE Control_Acceso (
  ID_control INT NOT NULL AUTO_INCREMENT,
  ID_personal INT NOT NULL,
  modulo VARCHAR(50) NOT NULL,
  permiso VARCHAR(50) NOT NULL,
  fecha_entrada DATETIME NOT NULL,
  fecha_salida DATETIME NOT NULL,
  PRIMARY KEY (ID_control),
  FOREIGN KEY (ID_personal) REFERENCES Personal(ID_personal)
);

-- Creación de la tabla licencia
CREATE TABLE Licencia (
  ID_licencia INT NOT NULL AUTO_INCREMENT,
  ID_personal INT NOT NULL,
  fecha_inicio DATE NOT NULL,
  fecha_fin DATE NOT NULL,
  PRIMARY KEY (ID_licencia),
  FOREIGN KEY (ID_personal) REFERENCES Personal(ID_personal)
);
