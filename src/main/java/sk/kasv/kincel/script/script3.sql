USE `esportshibernate` ;

DROP TABLE IF EXISTS `esportshibernate`.`player` ;

CREATE TABLE IF NOT EXISTS `esportshibernate`.`player` (
`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(255),
`teamId` INT,
PRIMARY KEY (`id`),
FOREIGN KEY (`teamId`)
REFERENCES `esportshibernate`.`team` (`id`)
);


INSERT INTO `player`(id, name, teamId)
VALUES (1,'EliGE', 1);

INSERT INTO `player`(id, name, teamId)
VALUES (2,'NAF', 1);

INSERT INTO `player`(id, name, teamId)
VALUES (3,'oSee', 1);