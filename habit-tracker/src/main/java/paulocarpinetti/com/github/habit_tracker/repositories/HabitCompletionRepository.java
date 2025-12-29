package paulocarpinetti.com.github.habit_tracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import paulocarpinetti.com.github.habit_tracker.model.HabitCompletion;

@Repository
public interface HabitCompletionRepository extends JpaRepository<HabitCompletion, Long> {
}
