CREATE TABLE IF NOT EXISTS `users` (
     `id` bigint(20) NOT NULL AUTO_INCREMENT,
           `user_name` VARCHAR(100) NOT NULL,
           `email` VARCHAR(150) NOT NULL UNIQUE,
           `password` VARCHAR(255) NOT NULL,
           `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
           `account_non_expired` bit(1) DEFAULT NULL,
           `account_non_locked` bit(1) DEFAULT NULL,
           `credentials_non_expired` bit(1) DEFAULT NULL,
           `enabled` bit(1) DEFAULT NULL,
           PRIMARY KEY (`id`),
           UNIQUE KEY `uk_name` (`user_name`)
) ENGINE=InnoDB;