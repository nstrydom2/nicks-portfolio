package org.bitnick.nicksportfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class NicksportfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(NicksportfolioApplication.class, args);
	}
}
