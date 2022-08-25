package springsecurityjwt;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import springsecurityjwt.entity.User;
import springsecurityjwt.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initUser() {
		List<User> users = Stream.of(new User(1, "rahul", "dummy", "iamrkgolu@gmail.com"),
				new User(2, "babli", "notdummy", "babli@gmail.com")

		).collect(Collectors.toList());
		userRepository.saveAll(users);

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
	}

}
