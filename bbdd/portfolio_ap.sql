-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-06-2023 a las 23:09:30
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `portfolio_ap`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `educacion`
--

CREATE TABLE `educacion` (
  `id` bigint(20) NOT NULL,
  `fecha_fin` datetime(6) DEFAULT NULL,
  `fecha_inicio` datetime(6) DEFAULT NULL,
  `institucion` varchar(255) DEFAULT NULL,
  `mensiones` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `id_persona` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `educacion`
--

INSERT INTO `educacion` (`id`, `fecha_fin`, `fecha_inicio`, `institucion`, `mensiones`, `titulo`, `id_persona`) VALUES
(1, '2005-12-01 00:00:00.000000', '1999-02-01 00:00:00.000000', 'Esc. Secundaria IPET Juan XXII – Paraná – Entre Ríos', 'Abanderado de la Insignia Nacional', 'Técnico en Electrónica', 1),
(2, NULL, '2006-02-01 00:00:00.000000', 'FIUNER – Oro Verde – Entre Ríoss', 'Diseño e Implementación de un dispositivo de medición del tiempo de reacción ante estímulos visuales. Exposición en el Congreso SABI 2013', 'Bioingeniería', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `educacion_seq`
--

CREATE TABLE `educacion_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `educacion_seq`
--

INSERT INTO `educacion_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experiencia`
--

CREATE TABLE `experiencia` (
  `id` bigint(20) NOT NULL,
  `cargo` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `empresa` varchar(255) DEFAULT NULL,
  `fecha_fin` datetime(6) DEFAULT NULL,
  `fecha_inicio` datetime(6) DEFAULT NULL,
  `id_persona` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `experiencia`
--

INSERT INTO `experiencia` (`id`, `cargo`, `descripcion`, `empresa`, `fecha_fin`, `fecha_inicio`, `id_persona`) VALUES
(1, 'Administrativo Técnico, Contable y de RRHH', 'Realización de presupuestos, certificaciones y seguimientos de obra. Responsable de la sección de RRHH.', 'Agustin O. Cavallini', '2019-02-01 00:00:00.000000', '2006-06-01 00:00:00.000000', 1),
(2, 'Socio Gerente', 'Gestión empresarial. Realización de presupuestos, certificaciones y seguimientos de obra. Responsable de la sección de RRHH.', 'Cavallini SRL', NULL, '2019-03-01 00:00:00.000000', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experiencia_seq`
--

CREATE TABLE `experiencia_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `experiencia_seq`
--

INSERT INTO `experiencia_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id` bigint(20) NOT NULL,
  `acerca` varchar(255) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `banner` varchar(255) DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL,
  `localidad` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `posicion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id`, `acerca`, `apellido`, `banner`, `foto`, `localidad`, `nombre`, `posicion`) VALUES
(1, 'Me apasiona la tecnología y el desarrollo de software.', 'Cavallini', '', '', 'Entre Rios, Argentina', 'Nestor D.', 'Desarrollador Full Stack');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_seq`
--

CREATE TABLE `persona_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona_seq`
--

INSERT INTO `persona_seq` (`next_val`) VALUES
(201);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyecto`
--

CREATE TABLE `proyecto` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `id_persona` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proyecto`
--

INSERT INTO `proyecto` (`id`, `descripcion`, `titulo`, `id_persona`) VALUES
(1, 'Proyecto Final Carrera de Bioingeniería – En Desarrollo', 'Análisis del sistema de información del nodo epidemiológico del Hospital Materno Infantil “San Roque” de la ciudad de Paraná y propuesta de optimización de procesos para la obtención de información oportuna', 1),
(2, 'Campaña 2018 – Actualizaciones 2019, 2020, 2021 y 2022', 'Desarrollo de herramienta de registro y análisis para el Nodo de Epidemiología del Hospital San Roque de la ciudad de Paraná', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyecto_seq`
--

CREATE TABLE `proyecto_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proyecto_seq`
--

INSERT INTO `proyecto_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `red_social`
--

CREATE TABLE `red_social` (
  `id` bigint(20) NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `usuario` varchar(255) DEFAULT NULL,
  `id_persona` bigint(20) NOT NULL,
  `id_tipo_red_social` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `red_social`
--

INSERT INTO `red_social` (`id`, `url`, `usuario`, `id_persona`, `id_tipo_red_social`) VALUES
(252, 'https://github.com/NestorCava', 'NestorCava', 1, 2),
(253, 'https://linkedin.com/in/nestor-daniel-cavallini', 'Nestor Daniel Cavallini', 1, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `red_social_seq`
--

CREATE TABLE `red_social_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `red_social_seq`
--

INSERT INTO `red_social_seq` (`next_val`) VALUES
(351);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `skill`
--

CREATE TABLE `skill` (
  `id` bigint(20) NOT NULL,
  `porcentaje` bigint(20) DEFAULT NULL,
  `skill` varchar(255) DEFAULT NULL,
  `id_persona` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `skill`
--

INSERT INTO `skill` (`id`, `porcentaje`, `skill`, `id_persona`) VALUES
(1, 75, 'Python', 1),
(2, 70, 'Java', 1),
(3, 60, 'GIT', 1),
(4, 60, 'HTML', 1),
(5, 60, 'CSS', 1),
(6, 60, 'TS', 1),
(7, 60, 'SCRUM', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `skill_seq`
--

CREATE TABLE `skill_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `skill_seq`
--

INSERT INTO `skill_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_red_social`
--

CREATE TABLE `tipo_red_social` (
  `id` bigint(20) NOT NULL,
  `red_social` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipo_red_social`
--

INSERT INTO `tipo_red_social` (`id`, `red_social`) VALUES
(1, 'OTRO'),
(2, 'GITHUB'),
(3, 'LINKEDIN'),
(4, 'EMAIL'),
(5, 'WHATSAPP'),
(6, 'TELEGRAM'),
(7, 'TELEFONO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_red_social_seq`
--

CREATE TABLE `tipo_red_social_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipo_red_social_seq`
--

INSERT INTO `tipo_red_social_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `usuario` varchar(255) DEFAULT NULL,
  `id_persona` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `password`, `usuario`, `id_persona`) VALUES
(1, 'admin', 'admin', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_seq`
--

CREATE TABLE `usuario_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario_seq`
--

INSERT INTO `usuario_seq` (`next_val`) VALUES
(51);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `educacion`
--
ALTER TABLE `educacion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKty3h2knwsbbta7gcfmttqddb` (`id_persona`);

--
-- Indices de la tabla `experiencia`
--
ALTER TABLE `experiencia`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK2kgkm2qtkciorqpmsrh4pebcl` (`id_persona`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `proyecto`
--
ALTER TABLE `proyecto`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKjwgo0osdsdkh9dvcf5x728aje` (`id_persona`);

--
-- Indices de la tabla `red_social`
--
ALTER TABLE `red_social`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKsrpo2frnfufpygcxj0jrchfi3` (`id_persona`),
  ADD KEY `FK90kutlcychclos09jcyfd3i6n` (`id_tipo_red_social`);

--
-- Indices de la tabla `skill`
--
ALTER TABLE `skill`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKpyuxnqxtx07xax39sla4of4fo` (`id_persona`);

--
-- Indices de la tabla `tipo_red_social`
--
ALTER TABLE `tipo_red_social`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKagix3q8yqktlyj3yp1sn0mcd9` (`id_persona`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `educacion`
--
ALTER TABLE `educacion`
  ADD CONSTRAINT `FKty3h2knwsbbta7gcfmttqddb` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id`);

--
-- Filtros para la tabla `experiencia`
--
ALTER TABLE `experiencia`
  ADD CONSTRAINT `FK2kgkm2qtkciorqpmsrh4pebcl` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id`);

--
-- Filtros para la tabla `proyecto`
--
ALTER TABLE `proyecto`
  ADD CONSTRAINT `FKjwgo0osdsdkh9dvcf5x728aje` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id`);

--
-- Filtros para la tabla `red_social`
--
ALTER TABLE `red_social`
  ADD CONSTRAINT `FK90kutlcychclos09jcyfd3i6n` FOREIGN KEY (`id_tipo_red_social`) REFERENCES `tipo_red_social` (`id`),
  ADD CONSTRAINT `FKsrpo2frnfufpygcxj0jrchfi3` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id`);

--
-- Filtros para la tabla `skill`
--
ALTER TABLE `skill`
  ADD CONSTRAINT `FKpyuxnqxtx07xax39sla4of4fo` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `FKagix3q8yqktlyj3yp1sn0mcd9` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
