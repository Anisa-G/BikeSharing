-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 25, 2018 at 07:56 PM
-- Server version: 5.7.19
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bike_sharing`
--

-- --------------------------------------------------------

--
-- Table structure for table `bicycle`
--

DROP TABLE IF EXISTS `bicycle`;
CREATE TABLE IF NOT EXISTS `bicycle` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number_plate` varchar(10) COLLATE utf16_unicode_520_ci NOT NULL,
  `location` varchar(100) COLLATE utf16_unicode_520_ci NOT NULL,
  `available` varchar(10) COLLATE utf16_unicode_520_ci NOT NULL,
  `id_user` varchar(45) COLLATE utf16_unicode_520_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf16 COLLATE=utf16_unicode_520_ci;

--
-- Dumping data for table `bicycle`
--

INSERT INTO `bicycle` (`id`, `number_plate`, `location`, `available`, `id_user`) VALUES
(5, '2025', 'Parku Rinia', 'No', 'anisa'),
(3, '1426', 'Ish-Blloku', 'Yes', ''),
(6, '3549', 'Hyrja e Parkut te liqenit', 'Yes', ''),
(7, '8456', 'Brenda Parkut te liqenit', 'Yes', ''),
(8, '6324', 'Parku Rinia', 'Yes', '');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) COLLATE utf16_unicode_520_ci NOT NULL,
  `password` varchar(45) COLLATE utf16_unicode_520_ci NOT NULL,
  `email` varchar(45) COLLATE utf16_unicode_520_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf16 COLLATE=utf16_unicode_520_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`, `email`) VALUES
(1, 'Anisa', 'Anisa123', ''),
(3, 'admin', 'admin123', '');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

DROP TABLE IF EXISTS `register`;
CREATE TABLE IF NOT EXISTS `register` (
  `id` int(9) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf16_unicode_520_ci NOT NULL,
  `last_name` varchar(45) COLLATE utf16_unicode_520_ci NOT NULL,
  `email` varchar(45) COLLATE utf16_unicode_520_ci NOT NULL,
  `username` varchar(45) COLLATE utf16_unicode_520_ci NOT NULL,
  `password` varchar(45) COLLATE utf16_unicode_520_ci NOT NULL,
  `id_card_number` varchar(10) COLLATE utf16_unicode_520_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_card_number` (`id_card_number`),
  UNIQUE KEY `username` (`username`)
) ENGINE=MyISAM AUTO_INCREMENT=52 DEFAULT CHARSET=utf16 COLLATE=utf16_unicode_520_ci;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`id`, `name`, `last_name`, `email`, `username`, `password`, `id_card_number`) VALUES
(2, 'A', 'B', 'ab@yahoo.com', 'ab', 'ab123', 'C12345678D'),
(1, '', '', 'admin@gmail.com', 'admin', 'admin123', ''),
(50, 'Anisa', 'Gurabardhi', 'anisagurabardhi@gmail.com', 'Anisa', 'anisa123', 'A12345678B'),
(51, 'Name', 'Lastname', 'name123@gmail.com', 'Name123', 'name123', 'B12345678C');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
