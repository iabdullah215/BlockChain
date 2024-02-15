CREATE DATABASE  IF NOT EXISTS `blockchain` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `blockchain`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: blockchain
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(250) DEFAULT NULL,
  `password` varchar(250) DEFAULT NULL,
  `dollars` int(11) DEFAULT 40000,
  `Transaction` int(11) DEFAULT 0,
  `bitcoin` float DEFAULT 0,
  `etherium` float DEFAULT 0,
  `ripple` float DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1,'munib','123',25000,14,-120.2,0,0),(2,'Mabdullah','123',22000,3,141.2,0,0),(3,'munibnawaz','123',37600,0,0,0,2),(4,'munibnawaz1','123',40000,0,0,0,0),(5,'munibnawaz3','123',40000,0,0,0,0),(6,'munibnawaz2','hello',41693,0,1,0,0);
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blockchains`
--

DROP TABLE IF EXISTS `blockchains`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `blockchains` (
  `Name` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blockchains`
--

LOCK TABLES `blockchains` WRITE;
/*!40000 ALTER TABLE `blockchains` DISABLE KEYS */;
INSERT INTO `blockchains` VALUES ('mnm');
/*!40000 ALTER TABLE `blockchains` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `currencywithtime`
--

DROP TABLE IF EXISTS `currencywithtime`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `currencywithtime` (
  `Time` varchar(250) DEFAULT NULL,
  `bitcoin` float DEFAULT NULL,
  `etherium` float DEFAULT NULL,
  `ripple` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `currencywithtime`
--

LOCK TABLES `currencywithtime` WRITE;
/*!40000 ALTER TABLE `currencywithtime` DISABLE KEYS */;
INSERT INTO `currencywithtime` VALUES ('1703758152644',4791.57,4530.78,3151.31),('1703758154407',4433.69,4699.44,3240),('1703758155267',236.017,4704.17,4481.94),('1703758155565',6824.6,1258.12,5656.59),('1703758155785',1201.42,7285.45,5739.06),('1703758155954',6221.05,1602.16,9904.31),('1703758156139',684.907,8131.52,231.932),('1703758156309',4406.23,8154.51,2845.95),('1703758156473',5858.55,3358.64,8143.84),('1703758156672',8179.75,1484.43,3873.49),('1703758156857',1771.9,6258.99,4601.2),('1703758156857',1771.9,6258.99,4601.2),('1703758157020',6672.36,7659.14,3901.69),('1703758157214',5733.71,4667.48,8137.65),('1703758554316',9896.83,2123.35,1797.95),('1703758865255',5699.44,412.981,9792.16),('1703759720697',7240.28,2532.02,986.99),('1703759774923',3696.88,4516.53,947.979),('1703765083816',7664.08,6672.8,7983.67),('1703765350305',9842.99,2149.71,5740.49),('1703767073522',8132.24,7326.83,2781.8),('1703767786603',7563.04,5605.62,1029.82),('1703864078671',5957.03,2975.94,595.016),('1703914520708',8519.01,1406.56,5908.36),('1703914627427',956.11,2562.55,2205.93),('1703914883439',8293.44,5935.84,5357.67),('1703914972114',5473.81,8753.07,1110.04),('1703915051468',3834.41,4689.2,9153.83),('1703915123992',4693.49,9210.88,7647.6),('1703915159501',8684.5,5796.09,5062.7),('1703915378032',291.609,2673.27,101.079),('1703915503194',5615.6,8333.62,5904.71),('1703915785781',7293.06,6194.04,2182.83),('30-12-2023 11:05:01.660',5999.77,2019.18,476.743);
/*!40000 ALTER TABLE `currencywithtime` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ledger`
--

DROP TABLE IF EXISTS `ledger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ledger` (
  `blockindex` int(11) NOT NULL AUTO_INCREMENT,
  `Sender` varchar(250) DEFAULT NULL,
  `Data` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`blockindex`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ledger`
--

LOCK TABLES `ledger` WRITE;
/*!40000 ALTER TABLE `ledger` DISABLE KEYS */;
INSERT INTO `ledger` VALUES (1,'munib','Mabdullah'),(2,'munib','Mabdullah'),(3,'munib','Mabdullah'),(4,'munib','Mabdullah'),(5,'munib','Mabdullah'),(6,'munib','Mabdullah'),(7,'munib','munib'),(8,'munib','Mabdullah'),(9,'munib','Mabdullah'),(10,'Mabdullah','munib'),(11,'Mabdullah','munib'),(12,'Mabdullah','munib');
/*!40000 ALTER TABLE `ledger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mnm`
--

DROP TABLE IF EXISTS `mnm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mnm` (
  `id` varchar(250) DEFAULT NULL,
  `TimeStamp` varchar(250) DEFAULT NULL,
  `hash` varchar(250) DEFAULT NULL,
  `previousHash` varchar(250) DEFAULT NULL,
  `data` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mnm`
--

LOCK TABLES `mnm` WRITE;
/*!40000 ALTER TABLE `mnm` DISABLE KEYS */;
INSERT INTO `mnm` VALUES ('1','28-12-2023 17:56:42.807','4VEvybIJvmQlkITPqeBctuNrIuajv3swA3nHyiUAeybYxzVkTCwFf+iKkOwduBXNi1rcwZ2tq90LIr0LKHkY6Q==','Genesis Block','4'),('1','28-12-2023 17:59:06.050','+hyirzIhxi7xgEtlAxKtmXuOr8PO2cGHzkiu4iMCvuh3dl8qlBROJ+zVmX4pv8PCk2wKyaT+svzT9LPfHdTgeg==','Genesis Block','4'),('2','28-12-2023 18:04:17.095','oyHYtAXj7yYElZhHs20XHuvrxKiUHccKR4STWk/KXVgT3oTfoEnwZUmqYbIISMFjPOgbZ1KG6o+1PbJA2DHFaA==','4VEvybIJvmQlkITPqeBctuNrIuajv3swA3nHyiUAeybYxzVkTCwFf+iKkOwduBXNi1rcwZ2tq90LIr0LKHkY6Q==','4');
/*!40000 ALTER TABLE `mnm` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publicledger`
--

DROP TABLE IF EXISTS `publicledger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `publicledger` (
  `blockindex` int(11) NOT NULL AUTO_INCREMENT,
  `Sender` varchar(250) DEFAULT NULL,
  `Reciever` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`blockindex`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publicledger`
--

LOCK TABLES `publicledger` WRITE;
/*!40000 ALTER TABLE `publicledger` DISABLE KEYS */;
INSERT INTO `publicledger` VALUES (1,'zjhLYM7Jy6TfowGJYZXNjg==',' send coins to /CoBV/1hR+w/m7vLfuZufg=='),(2,'iZeZa4yMKVRxVm9BqWmOPA==',' send coins to QXkRj7REJThMTrMskxg4BA=='),(3,'mrqkJHukNxfuBre2cXKuOw==',' send coins to tNKFoWIY53cphz8sKRqFoA=='),(4,'ePBcDw+Jv5jzpxHW5Tvomg==',' send coins to Ib8cpWcprYsXaJIwulOfUw=='),(5,'uU51oL0NrxRh4OiAVz0HWQ==',' send coins to 9ruB7a8lPjNvgywxv+6srA=='),(6,'29MBLXnUDihewo5fRGKWpQ==',' send coins to lj9j0EN39QCumJ22i6ASxA=='),(7,'NjON2/MrGHZjvjJawzpibA==',' send coins to 095dlIBbB+kLM+hvSjhZow=='),(8,'y4HUGKlcYL/TqmHBa9pY7Q==',' send coins to y4HUGKlcYL/TqmHBa9pY7Q=='),(9,'DlmMb8TNi0amwrYW7Y/ICA==',' send coins to ZO/RMrcRyaYiYyYhmCiVng=='),(10,'8Ox9bKZKYknazJ5w/5BnRw==',' send coins to b6D24s7L4wb2jdtJI31ucQ=='),(11,'nJDz80H8nixvVJauY8c7gA==',' send coins to bv2XQRpeI8dU8JnGHQ0/oA=='),(12,'hbKnPHGLB/J/jCrzv1VGRw==',' send coins to UXPraDA1sk5mWOCjQdVNmg=='),(13,'bCfSMwOiQz8NYOd3ZQhxtQ==',' send coins to eWSBebi7V1KZDGGk0EdRNQ==');
/*!40000 ALTER TABLE `publicledger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `systemblocks`
--

DROP TABLE IF EXISTS `systemblocks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `systemblocks` (
  `name` varchar(50) DEFAULT NULL,
  `id` varchar(250) DEFAULT NULL,
  `TimeStamp` varchar(250) DEFAULT NULL,
  `hash` varchar(250) DEFAULT NULL,
  `previousHash` varchar(250) DEFAULT NULL,
  `Data` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `systemblocks`
--

LOCK TABLES `systemblocks` WRITE;
/*!40000 ALTER TABLE `systemblocks` DISABLE KEYS */;
/*!40000 ALTER TABLE `systemblocks` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-30 11:53:17
