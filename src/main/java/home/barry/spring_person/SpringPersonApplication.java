package home.barry.spring_person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringPersonApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(SpringPersonApplication.class);

	@Autowired
	private Environment env;

	@Override
	public void run(String... args){
		logger.info("{}", env.getProperty("JAVA_HOME"));
		logger.info("Application Name = {}|| env = {}", env.getProperty("app.name"), env.getProperty("app.env"));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringPersonApplication.class, args);
	}
}
