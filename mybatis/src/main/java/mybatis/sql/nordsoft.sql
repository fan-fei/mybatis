CREATE DATABASE `nordsoft`;

USE nordsoft;

CREATE TABLE `user1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userName` varchar(10) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;