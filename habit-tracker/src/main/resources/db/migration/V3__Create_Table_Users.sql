CREATE TABLE IF NOT EXISTS `users` (
     `id` VARCHAR(36) PRIMARY KEY,
           `name` VARCHAR(100) NOT NULL,
           `email` VARCHAR(150) NOT NULL UNIQUE,
           `password` VARCHAR(255) NOT NULL,
           `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
     ) ENGINE=InnoDB;