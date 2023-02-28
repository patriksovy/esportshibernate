DROP DATABASE IF EXISTS esportshibernate;
CREATE DATABASE IF NOT EXISTS esportshibernate;

USE `esportshibernate` ;

DROP TABLE IF EXISTS `esportshibernate`.`founder` ;

CREATE TABLE IF NOT EXISTS `esportshibernate`.`founder` (
`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(255),
PRIMARY KEY (`id`));



INSERT INTO `founder`(id, name)
VALUES (0,'Victor "Nazgul" Goossens');

INSERT INTO `founder`(id, name)
VALUES (0,'Jack Etienne');

INSERT INTO `founder`(id, name)
VALUES (0,'Thomas "Temperrr" Oliveira');
