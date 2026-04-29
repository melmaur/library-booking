package library_booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"library_booking", "controller", "service", "repository", "model"})
@EntityScan(basePackages = "model")
@EnableJpaRepositories(basePackages = "repository")
public class LibraryBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryBookingApplication.class, args);
	}
}