CREATE SCHEMA `best_motor_cycle_4u` DEFAULT CHARACTER SET utf8 COLLATE utf8_hungarian_ci ;

use `best_motor_cycle_4u`;

CREATE TABLE `best_motor_cycle_4u`.`motor_cycle_category` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC));

INSERT INTO `best_motor_cycle_4u`.`motor_cycle_category` (`name`) VALUES ('Bagger');
INSERT INTO `best_motor_cycle_4u`.`motor_cycle_category` (`name`) VALUES ('Bobber');
INSERT INTO `best_motor_cycle_4u`.`motor_cycle_category` (`name`) VALUES ('Cruiser');
INSERT INTO `best_motor_cycle_4u`.`motor_cycle_category` (`name`) VALUES ('Moped');
INSERT INTO `best_motor_cycle_4u`.`motor_cycle_category` (`name`) VALUES ('Sport');
INSERT INTO `best_motor_cycle_4u`.`motor_cycle_category` (`name`) VALUES ('Sport Touring');
INSERT INTO `best_motor_cycle_4u`.`motor_cycle_category` (`name`) VALUES ('Standard');
INSERT INTO `best_motor_cycle_4u`.`motor_cycle_category` (`name`) VALUES ('Touring');


CREATE TABLE `best_motor_cycle_4u`.`motor_cycle` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `manufacturer` VARCHAR(45) NULL,
  `model` VARCHAR(45) NULL,
  `category_id` INT NULL,
  `status` TINYINT NULL,
  PRIMARY KEY (`id`));
  
INSERT INTO `best_motor_cycle_4u`.`motor_cycle` (`manufacturer`, `model`, `category_id`, `status`) VALUES ('Ducati', 'R-4442', '1', '1');
INSERT INTO `best_motor_cycle_4u`.`motor_cycle` (`manufacturer`, `model`, `category_id`, `status`) VALUES ('KTM', 'TMF-234', '2', '0');
INSERT INTO `best_motor_cycle_4u`.`motor_cycle` (`manufacturer`, `model`, `category_id`, `status`) VALUES ('Honda', 'TZ345', '4', '1');
INSERT INTO `best_motor_cycle_4u`.`motor_cycle` (`manufacturer`, `model`, `category_id`, `status`) VALUES ('BMW', 'RIT-345', '3', '1');
