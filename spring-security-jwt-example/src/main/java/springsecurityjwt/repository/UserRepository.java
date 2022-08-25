package springsecurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springsecurityjwt.entity.*;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);

}
