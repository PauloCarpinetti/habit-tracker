package paulocarpinetti.com.github.habit_tracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import paulocarpinetti.com.github.habit_tracker.model.Habit;

@Repository
public interface HabitRepository extends JpaRepository<Habit, Long> {
}
