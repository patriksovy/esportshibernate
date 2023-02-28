USE `esportshibernate` ;

DROP TABLE IF EXISTS `esportshibernate`.`esport` ;

CREATE TABLE IF NOT EXISTS `esportshibernate`.`esport` (
`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(255) NOT NULL,
PRIMARY KEY (`id`));


INSERT INTO `esport`(id, name)
VALUES (0,'Dota 2');

INSERT INTO `esport`(id, name)
VALUES (0,'Counter-Strike: Global Offensive');

INSERT INTO `esport`(id, name)
VALUES (0,'League of Legends');

INSERT INTO `esport`(id, name)
VALUES (0,'Team Fortress 2');

INSERT INTO `esport`(id, name)
VALUES (0,'Rocket League');

INSERT INTO `esport`(id, name)
VALUES (0,'StarCraft II');

