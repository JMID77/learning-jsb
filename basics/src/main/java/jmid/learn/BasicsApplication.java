package jmid.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BasicsApplication {
    public static void main(String[] args) {
		SpringApplication.run(BasicsApplication.class, args);

		RunnerEvaluation runner = new RunnerEvaluation();

		runner.run();
	}
}