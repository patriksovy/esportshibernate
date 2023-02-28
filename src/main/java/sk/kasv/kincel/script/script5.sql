USE `esportshibernate` ;

DROP TABLE IF EXISTS `esportshibernate`.`team_esport` ;

CREATE TABLE IF NOT EXISTS `esportshibernate`.`team_esport` (
`id` INT NOT NULL AUTO_INCREMENT,
`teamId` INT,
`esportId` INT,
PRIMARY KEY (`id`),

FOREIGN KEY (`teamId`)
REFERENCES `esportshibernate`.`team` (`id`),

FOREIGN KEY (`esportId`)
REFERENCES `esportshibernate`.`esport` (`id`));



INSERT INTO `team_esport`(id, teamId, esportId)
VALUES (0, 1, 4);

INSERT INTO `team_esport`(id, teamId, esportId)
VALUES (0, 2, 1);

INSERT INTO `team_esport`(id, teamId, esportId)
VALUES (0, 2, 2);

INSERT INTO `team_esport`(id, teamId, esportId)
VALUES (0, 3, 1);

INSERT INTO `team_esport`(id, teamId, esportId)
VALUES (0, 3, 2);

INSERT INTO `team_esport`(id, teamId, esportId)
VALUES (0, 3, 3);
