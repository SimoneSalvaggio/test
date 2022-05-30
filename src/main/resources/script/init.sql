CREATE SCHEMA `fabrick` ;

  CREATE TABLE `fabrick`.`transaction_request_historys` (
);


/*IF DDL-AUTO = FALSE NEED TO ADD ALL COLUMNS*/

CREATE TABLE `fabrick`.`transaction_request_history` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `account_id` BIGINT NULL,
  `date_from` VARCHAR(255) NULL,
  `date_to` VARCHAR(255) NULL,
  `request_date` DATETIME NULL,
  `result_size` INT NULL,
  PRIMARY KEY (`id`));