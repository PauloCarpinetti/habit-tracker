package paulocarpinetti.com.github.habit_tracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import paulocarpinetti.com.github.habit_tracker.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
