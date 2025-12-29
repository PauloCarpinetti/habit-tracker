CREATE TABLE IF NOT EXISTS `habits` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `user_id` bigint(20) NOT NULL,
    `name` VARCHAR(100) NOT NULL,
    `description` VARCHAR(100),
    `frequency` VARCHAR(20) NOT NULL,
    `active` BOOLEAN NOT NULL DEFAULT TRUE,
    `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
    CONSTRAINT fk_habit_user FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);