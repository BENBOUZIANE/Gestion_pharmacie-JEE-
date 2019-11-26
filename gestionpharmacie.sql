-- phpMyAdmin SQL Dump
-- version 2.6.1
-- http://www.phpmyadmin.net
-- 
-- Serveur: localhost
-- Généré le : Lundi 23 Novembre 2015 à 21:00
-- Version du serveur: 4.1.9
-- Version de PHP: 4.3.10
-- 
-- Base de données: `gestionpharmacie`
-- 

-- --------------------------------------------------------

-- 
-- Structure de la table `medicament`
-- 

CREATE TABLE `medicament` (
  `id` int(11) NOT NULL auto_increment,
  `nom` varchar(255) NOT NULL default '',
  `concentration` varchar(255) NOT NULL default '',
  `description` varchar(255) NOT NULL default '',
  `prix` int(11) NOT NULL default '0',
  `date_de_production` date NOT NULL default '0000-00-00',
  `date_de_fin` date NOT NULL default '0000-00-00',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

-- 
-- Contenu de la table `medicament`
-- 

INSERT INTO `medicament` VALUES (1, 'Doliprane', '300mg', 'Doleur et fievre', 18, '2015-11-01', '2015-11-30');
INSERT INTO `medicament` VALUES (2, 'Maalox', '300mg', 'maux d''estomac', 20, '2015-11-07', '2015-11-27');
