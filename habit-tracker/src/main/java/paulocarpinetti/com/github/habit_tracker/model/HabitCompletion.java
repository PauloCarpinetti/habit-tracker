package paulocarpinetti.com.github.habit_tracker.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(
        name = "tb_habit_completions",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"habit_id", "date"})
        }
)
public class HabitCompletion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "habit_id", nullable = false)
    private Habit habit;

    @Column(nullable = false)
    private LocalDate date;

    @Column(name = "completed_at", nullable = false)
    private LocalDateTime completedAt;

    public HabitCompletion() {}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Habit getHabit() {
        return habit;
    }

    public void setHabit(Habit habit) {
        this.habit = habit;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof HabitCompletion that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getHabit(), that.getHabit()) && Objects.equals(getDate(), that.getDate()) && Objects.equals(getCompletedAt(), that.getCompletedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getHabit(), getDate(), getCompletedAt());
    }
}
