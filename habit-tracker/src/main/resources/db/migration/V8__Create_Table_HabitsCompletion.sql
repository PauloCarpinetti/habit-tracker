CREATE TABLE IF NOT EXISTS `habit_completions` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `habit_id` bigint(20) NOT NULL,
    `date` DATE NOT NULL,
    `completed_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    PRIMARY KEY (`id`),

    CONSTRAINT fk_completion_habit
        FOREIGN KEY (habit_id)
        REFERENCES habits (id)
        ON DELETE CASCADE,

    CONSTRAINT uk_habit_completion_per_day
        UNIQUE (habit_id, date)
);