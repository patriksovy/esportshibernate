USE `esportshibernate` ;

CREATE TABLE IF NOT EXISTS `esportshibernate`.`team` (
`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(255),
`founderId` INT,
PRIMARY KEY (`id`),
FOREIGN KEY (`founderId`)
REFERENCES `esportshibernate`.`founder` (`id`)
);

INSERT INTO `team`(id, name, founderId)
VALUES (0,'Team Liquid', 1);

INSERT INTO `team`(id, name, founderId)
VALUES (0,'Cloud9', 2);

INSERT INTO `team`(id, name, founderId)
VALUES (0,'FaZe Clan', 3);

INSERT INTO `team`(id, name, founderId)
VALUES (0,'TSM', null);