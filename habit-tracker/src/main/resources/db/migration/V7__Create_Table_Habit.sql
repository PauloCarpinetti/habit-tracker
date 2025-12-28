CREATE TABLE IF NOT EXISTS habits (
    `id` VARCHAR(36) PRIMARY KEY, -- Corrigido nome e tipo
    `user_id` VARCHAR(36) NOT NULL,
    `name` VARCHAR(100) NOT NULL,
    `description` TEXT,
    `frequency` VARCHAR(20) NOT NULL,
    `active` BOOLEAN NOT NULL DEFAULT TRUE,
    `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_habit_user FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);