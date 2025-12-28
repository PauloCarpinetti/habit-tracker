CREATE TABLE IF NOT EXISTS habit_completions (
    `id` VARCHAR(36) PRIMARY KEY,
    `habit_id` VARCHAR(36) NOT NULL,
    `date` DATE NOT NULL,
    `completed_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_completion_habit
        FOREIGN KEY (habit_id)
        REFERENCES habits (id)
        ON DELETE CASCADE,

    CONSTRAINT uk_habit_completion_per_day
        UNIQUE (habit_id, date)
);