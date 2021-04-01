-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 01, 2021 at 12:04 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ujian_online`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` bigint(20) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `password`, `username`) VALUES
(2, 'Admin', 'Admin'),
(3, 'Admin', 'Admin'),
(4, 'Admin', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `id` bigint(20) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `adminid` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`id`, `nama`, `password`, `username`, `adminid`) VALUES
(1, 'Yanto', 'AHS728821', 'yanto123', 2),
(2, 'Nani Wijaya', 'AHS728821', 'Nani123', 2),
(3, 'Enggar Pratama', 'AH7728331', 'Enggar123', 2),
(4, 'Farah Wijaya', 'AH23723821', 'Fasy123', NULL),
(5, 'Mahisya', 'A5DE23821', 'Masy123', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` bigint(20) NOT NULL,
  `jk` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `adminid` bigint(20) DEFAULT NULL,
  `iddosen` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `jk`, `nama`, `password`, `adminid`, `iddosen`) VALUES
(1, 'Perempuan', 'Dilana Pritasia', 'D2721819', 3, NULL),
(2, 'Laki-laki', 'Suryono', 'D2721889', 3, NULL),
(3, 'Laki-laki', 'Suryono', 'D2721889', NULL, NULL),
(4, 'Perempuan', 'Gisa', 'D333223', NULL, NULL),
(5, 'Perempuan', 'Dilaa', 'D2779819', NULL, 5),
(6, 'Laki-laki', 'Sabar Nayid', 'D27789889', NULL, 5);

-- --------------------------------------------------------

--
-- Table structure for table `matakuliah`
--

CREATE TABLE `matakuliah` (
  `id` bigint(20) NOT NULL,
  `nama_mk` varchar(255) DEFAULT NULL,
  `adminid` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `nilai`
--

CREATE TABLE `nilai` (
  `id` bigint(20) NOT NULL,
  `nilai` bigint(20) DEFAULT NULL,
  `id_soal` bigint(20) DEFAULT NULL,
  `id_mhs` bigint(20) DEFAULT NULL,
  `id_dosen` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nilai`
--

INSERT INTO `nilai` (`id`, `nilai`, `id_soal`, `id_mhs`, `id_dosen`) VALUES
(1, 90, 7, 6, NULL),
(2, 100, NULL, 4, NULL),
(3, 90, NULL, 4, NULL),
(4, 100, NULL, NULL, 4),
(5, 90, NULL, NULL, 4);

-- --------------------------------------------------------

--
-- Table structure for table `pertanyaan`
--

CREATE TABLE `pertanyaan` (
  `id` bigint(20) NOT NULL,
  `jawaban1` varchar(255) DEFAULT NULL,
  `jawaban2` varchar(255) DEFAULT NULL,
  `jawaban3` varchar(255) DEFAULT NULL,
  `jawaban4` varchar(255) DEFAULT NULL,
  `jawabanbenar` varchar(255) DEFAULT NULL,
  `pertanyaan` varchar(255) DEFAULT NULL,
  `statusgambar` varchar(255) DEFAULT NULL,
  `id_soal` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pertanyaan`
--

INSERT INTO `pertanyaan` (`id`, `jawaban1`, `jawaban2`, `jawaban3`, `jawaban4`, `jawabanbenar`, `pertanyaan`, `statusgambar`, `id_soal`) VALUES
(1, '237723788', '237723788', '237723788', '237723788', '237723788', 'Apa yang dimaksud java programming?', '237723788', 6),
(2, '23234334', '232323434', '234322343', '2434334', '2343434', 'Apa yang dimaksud VB.Net?', '23334243', 6);

-- --------------------------------------------------------

--
-- Table structure for table `plotmk`
--

CREATE TABLE `plotmk` (
  `id` bigint(20) NOT NULL,
  `id_dosen` bigint(20) NOT NULL,
  `nim` bigint(20) NOT NULL,
  `id_mk` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `plotmk`
--

INSERT INTO `plotmk` (`id`, `id_dosen`, `nim`, `id_mk`) VALUES
(1, 1, 1, 5),
(2, 1, 2, 5),
(3, 2, 2, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `soal`
--

CREATE TABLE `soal` (
  `id` bigint(20) NOT NULL,
  `nama_soal` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `test_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `soal`
--

INSERT INTO `soal` (`id`, `nama_soal`, `status`, `test_id`) VALUES
(1, 'Algoritma membuat Coffee', 'Easy', NULL),
(2, 'Buatlah aplikasi menghitung luas tabung', 'Difficult', NULL),
(3, 'Buatlah aplikasi menghitung luas Kerucut', 'Difficult', NULL),
(4, 'Matematika Dasar', 'Difficult', 3),
(5, 'Buatlah aplikasi menghitung luas Persegi', 'Difficult', 3),
(6, 'Matematika Dasar Pemrograman', 'Difficult', NULL),
(7, 'Matematika Diskrit', 'Difficult', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `soal_details`
--

CREATE TABLE `soal_details` (
  `plotmk_id` bigint(20) NOT NULL,
  `soal_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `soal_details`
--

INSERT INTO `soal_details` (`plotmk_id`, `soal_id`) VALUES
(3, 1),
(3, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKq4uhlmge3xbk85t0q38oqhef3` (`adminid`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`),
  ADD KEY `FKto3rr8u9vye7f4lu516ftjpso` (`adminid`),
  ADD KEY `FKde4e4b99jem51oetcv1g4yduj` (`iddosen`);

--
-- Indexes for table `matakuliah`
--
ALTER TABLE `matakuliah`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKllenwj444hko2e7b5nopdodf5` (`adminid`);

--
-- Indexes for table `nilai`
--
ALTER TABLE `nilai`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKspkf6m78j2lovkw7ctekx9rxu` (`id_soal`),
  ADD KEY `FKlgdcuh8a38cckm49us8l14qll` (`id_mhs`),
  ADD KEY `FK8325e9fom0gr8clavm9h552f5` (`id_dosen`);

--
-- Indexes for table `pertanyaan`
--
ALTER TABLE `pertanyaan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKjwdowj1x79y78oj4nbbu1idug` (`id_soal`);

--
-- Indexes for table `plotmk`
--
ALTER TABLE `plotmk`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKociiyxuiyijpey5krsmrjx3w2` (`id_mk`);

--
-- Indexes for table `soal`
--
ALTER TABLE `soal`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK2mlqqq6yxog3ce44m9csjyo1h` (`test_id`);

--
-- Indexes for table `soal_details`
--
ALTER TABLE `soal_details`
  ADD KEY `FKd4q9f56cau6jfeehqky9oo0rp` (`soal_id`),
  ADD KEY `FK59ytueyjrh7t98wtqhh8smc` (`plotmk_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `dosen`
--
ALTER TABLE `dosen`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  MODIFY `nim` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `matakuliah`
--
ALTER TABLE `matakuliah`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `nilai`
--
ALTER TABLE `nilai`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `pertanyaan`
--
ALTER TABLE `pertanyaan`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `plotmk`
--
ALTER TABLE `plotmk`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `soal`
--
ALTER TABLE `soal`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
