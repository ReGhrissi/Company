-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 11 nov. 2020 à 09:11
-- Version du serveur :  10.4.14-MariaDB
-- Version de PHP : 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `company`
--

-- --------------------------------------------------------

--
-- Structure de la table `departement`
--

CREATE TABLE `departement` (
  `DeptNO` int(11) NOT NULL,
  `DeptName` varchar(150) DEFAULT NULL,
  `Location` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `departement`
--

INSERT INTO `departement` (`DeptNO`, `DeptName`, `Location`) VALUES
(1, 'Informatique', 'Oujda, Quartier ENNASR'),
(2, 'Réseaux', 'Oujda, Quartier Agdal'),
(3, 'Télécommunications', 'Oujda, Quartier Lazaret'),
(4, 'IT', 'Berkane, Quartier Essalam'),
(5, 'RH', 'Casablanca, Ain-Sbaa'),
(6, 'Management', 'Casablanca, Ain-Sbaa'),
(7, 'Maintenance', 'Oujda, Route Marrakech'),
(8, 'Gestion de qualité', 'Rabat, Boulvard Med 5'),
(9, 'Gestion de projets', 'Rabat, Boulvard Med 5'),
(10, 'Comptabilité', 'Casablanca, Ain Sbaa');

-- --------------------------------------------------------

--
-- Doublure de structure pour la vue `departement_data`
-- (Voir ci-dessous la vue réelle)
--
CREATE TABLE `departement_data` (
`Departement_NO` int(11)
,`Departement` varchar(150)
,`Location` varchar(100)
);

-- --------------------------------------------------------

--
-- Structure de la table `employee`
--

CREATE TABLE `employee` (
  `EmpNO` int(11) NOT NULL,
  `EmpName` varchar(120) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `Salary` double DEFAULT NULL,
  `HiringDate` date DEFAULT NULL,
  `BirthDate` date DEFAULT NULL,
  `DeptNo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `employee`
--

INSERT INTO `employee` (`EmpNO`, `EmpName`, `Address`, `Salary`, `HiringDate`, `BirthDate`, `DeptNo`) VALUES
(202011001, 'Mostafa BELARHRISSI', 'Oujda, Quartier Ennasr', 12000, '2017-06-15', '1992-09-27', 1),
(202011002, 'Ahmed ', ' Oujda', 10000, '2009-06-09', '1994-11-11', 2),
(202011003, 'Kenza', ' Casablanca, Ain-Chok', 6000, '2014-07-26', '1996-11-15', 5),
(202011004, 'Amine', ' Oujda, Quartier Essalam', 6000, '2019-02-13', '2001-12-05', 1),
(202011005, 'Youssef', ' Rabat, Boulvard Hassan 2', 10000, '2009-05-23', '1987-11-13', 9),
(202011006, 'Sami', ' Berkane, Quartier Elquods', 9000, '2012-04-28', '1990-01-16', 4),
(202011007, 'Khadija', ' Casablanca, Boulvard Zerktouni', 7000, '2013-08-08', '1998-03-26', 5),
(202011008, 'Karim', ' Oujda, Quartier Almanar', 13000, '2006-09-14', '1987-07-08', 2),
(202011009, 'Ali', ' Oujda Quartier Essalam', 14500, '2003-06-21', '1981-12-22', 3),
(202011010, 'Asmae', ' Casablanca Boulvard Allal Elfasi', 7000, '2014-07-06', '1997-02-26', 10);

-- --------------------------------------------------------

--
-- Doublure de structure pour la vue `employee_data`
-- (Voir ci-dessous la vue réelle)
--
CREATE TABLE `employee_data` (
`Number` int(11)
,`Name` varchar(120)
,`Address` varchar(200)
,`Salary` double
,`Hiring_Date` date
,`Date_Of_Birth` date
,`Departement_NO` int(11)
,`Departement` varchar(150)
);

-- --------------------------------------------------------

--
-- Structure de la table `employee_phones`
--

CREATE TABLE `employee_phones` (
  `EmpNO` int(11) NOT NULL,
  `Phone` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `employee_phones`
--

INSERT INTO `employee_phones` (`EmpNO`, `Phone`) VALUES
(202011001, '+212 6 53 35 23 27'),
(202011001, 'mostafa.belarhrissi@gmail.com'),
(202011003, '+212 6 25 87 95 62'),
(202011003, 'kenza@gmail.com'),
(202011004, '+212 6 25 48 96 74'),
(202011005, '+212 6 36 59 85 74'),
(202011006, '+212 6 08 79 00 41'),
(202011007, '+212 6 32 54 87 95'),
(202011008, '+212 6 66 98 75 41'),
(202011009, '+212 6 89 24 12 35'),
(202011010, '+212 6 85 63 98 57 ');

-- --------------------------------------------------------

--
-- Doublure de structure pour la vue `employee_phones_data`
-- (Voir ci-dessous la vue réelle)
--
CREATE TABLE `employee_phones_data` (
`Number` int(11)
,`Name` varchar(120)
,`Phone` varchar(55)
);

-- --------------------------------------------------------

--
-- Structure de la table `project`
--

CREATE TABLE `project` (
  `ProjectNO` int(11) NOT NULL,
  `ProjectName` varchar(150) NOT NULL,
  `Location` varchar(100) DEFAULT NULL,
  `DeptNo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `project`
--

INSERT INTO `project` (`ProjectNO`, `ProjectName`, `Location`, `DeptNo`) VALUES
(1, 'Projet_1', 'Oujda, Quartier ENNASR', 1),
(2, 'Projet_2', 'Berkane', 4),
(3, 'Projet_3', 'Oujda', 2),
(4, 'Projet_4', 'Oujda', 3);

-- --------------------------------------------------------

--
-- Doublure de structure pour la vue `project_data`
-- (Voir ci-dessous la vue réelle)
--
CREATE TABLE `project_data` (
`Project_NO` int(11)
,`Project_Name` varchar(150)
,`Location` varchar(100)
,`Departement_NO` int(11)
,`Departement` varchar(150)
);

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE `users` (
  `UserName` varchar(40) NOT NULL,
  `PassWord` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `users`
--

INSERT INTO `users` (`UserName`, `PassWord`) VALUES
('a', 'a'),
('admin', 'mostafa'),
('user', 'user');

-- --------------------------------------------------------

--
-- Structure de la table `work_on`
--

CREATE TABLE `work_on` (
  `EmpNO` int(11) NOT NULL,
  `ProjectNO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `work_on`
--

INSERT INTO `work_on` (`EmpNO`, `ProjectNO`) VALUES
(202011001, 1),
(202011002, 3),
(202011006, 2),
(202011009, 4);

-- --------------------------------------------------------

--
-- Doublure de structure pour la vue `work_on_data`
-- (Voir ci-dessous la vue réelle)
--
CREATE TABLE `work_on_data` (
`Number` int(11)
,`Name` varchar(120)
,`Project_NO` int(11)
,`Project_Name` varchar(150)
);

-- --------------------------------------------------------

--
-- Structure de la vue `departement_data`
--
DROP TABLE IF EXISTS `departement_data`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `departement_data`  AS SELECT `departement`.`DeptNO` AS `Departement_NO`, `departement`.`DeptName` AS `Departement`, `departement`.`Location` AS `Location` FROM `departement` ORDER BY `departement`.`DeptNO` ASC ;

-- --------------------------------------------------------

--
-- Structure de la vue `employee_data`
--
DROP TABLE IF EXISTS `employee_data`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `employee_data`  AS SELECT `employee`.`EmpNO` AS `Number`, `employee`.`EmpName` AS `Name`, `employee`.`Address` AS `Address`, `employee`.`Salary` AS `Salary`, `employee`.`HiringDate` AS `Hiring_Date`, `employee`.`BirthDate` AS `Date_Of_Birth`, `employee`.`DeptNo` AS `Departement_NO`, `departement`.`DeptName` AS `Departement` FROM (`employee` join `departement`) WHERE `employee`.`DeptNo` = `departement`.`DeptNO` ORDER BY `employee`.`EmpNO` ASC ;

-- --------------------------------------------------------

--
-- Structure de la vue `employee_phones_data`
--
DROP TABLE IF EXISTS `employee_phones_data`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `employee_phones_data`  AS SELECT `employee`.`EmpNO` AS `Number`, `employee`.`EmpName` AS `Name`, `employee_phones`.`Phone` AS `Phone` FROM (`employee` join `employee_phones`) WHERE `employee`.`EmpNO` = `employee_phones`.`EmpNO` ORDER BY `employee`.`EmpNO` ASC ;

-- --------------------------------------------------------

--
-- Structure de la vue `project_data`
--
DROP TABLE IF EXISTS `project_data`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `project_data`  AS SELECT `project`.`ProjectNO` AS `Project_NO`, `project`.`ProjectName` AS `Project_Name`, `project`.`Location` AS `Location`, `project`.`DeptNo` AS `Departement_NO`, `departement`.`DeptName` AS `Departement` FROM (`project` join `departement`) WHERE `project`.`DeptNo` = `departement`.`DeptNO` ORDER BY `project`.`ProjectNO` ASC ;

-- --------------------------------------------------------

--
-- Structure de la vue `work_on_data`
--
DROP TABLE IF EXISTS `work_on_data`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `work_on_data`  AS SELECT `work_on`.`EmpNO` AS `Number`, `employee`.`EmpName` AS `Name`, `work_on`.`ProjectNO` AS `Project_NO`, `project`.`ProjectName` AS `Project_Name` FROM ((`work_on` join `employee`) join `project`) WHERE `work_on`.`EmpNO` = `employee`.`EmpNO` AND `work_on`.`ProjectNO` = `project`.`ProjectNO` ORDER BY `work_on`.`EmpNO` ASC ;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `departement`
--
ALTER TABLE `departement`
  ADD PRIMARY KEY (`DeptNO`);

--
-- Index pour la table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`EmpNO`),
  ADD UNIQUE KEY `EmpName` (`EmpName`),
  ADD KEY `DeptNo` (`DeptNo`);

--
-- Index pour la table `employee_phones`
--
ALTER TABLE `employee_phones`
  ADD PRIMARY KEY (`EmpNO`,`Phone`);

--
-- Index pour la table `project`
--
ALTER TABLE `project`
  ADD PRIMARY KEY (`ProjectNO`),
  ADD KEY `DeptNo` (`DeptNo`);

--
-- Index pour la table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`UserName`);

--
-- Index pour la table `work_on`
--
ALTER TABLE `work_on`
  ADD PRIMARY KEY (`EmpNO`,`ProjectNO`),
  ADD KEY `ProjectNO` (`ProjectNO`);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`DeptNo`) REFERENCES `departement` (`DeptNO`);

--
-- Contraintes pour la table `employee_phones`
--
ALTER TABLE `employee_phones`
  ADD CONSTRAINT `employee_phones_ibfk_1` FOREIGN KEY (`EmpNO`) REFERENCES `employee` (`EmpNO`);

--
-- Contraintes pour la table `project`
--
ALTER TABLE `project`
  ADD CONSTRAINT `project_ibfk_1` FOREIGN KEY (`DeptNo`) REFERENCES `departement` (`DeptNO`);

--
-- Contraintes pour la table `work_on`
--
ALTER TABLE `work_on`
  ADD CONSTRAINT `work_on_ibfk_1` FOREIGN KEY (`EmpNO`) REFERENCES `employee` (`EmpNO`),
  ADD CONSTRAINT `work_on_ibfk_2` FOREIGN KEY (`ProjectNO`) REFERENCES `project` (`ProjectNO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
