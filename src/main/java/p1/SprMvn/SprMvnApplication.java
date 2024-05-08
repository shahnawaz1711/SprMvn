package p1.SprMvn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SprMvnApplication {

	static Logger logger = LoggerFactory.getLogger(SprMvnApplication.class);

	@PostConstruct
	public void init() {
		logger.info("SprMvnApplication STARTED..... Second Time");
	}
	
	public static void main(String[] args) {
		logger.info("SprMvnApplication main method STARTED.....");
		SpringApplication.run(SprMvnApplication.class, args);
	}

}
