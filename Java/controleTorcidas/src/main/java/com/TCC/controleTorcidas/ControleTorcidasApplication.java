package com.TCC.controleTorcidas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.TCC.controleTorcidas.model") // Especifique o pacote base onde estão os repositórios JPA

public class ControleTorcidasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleTorcidasApplication.class, args);
	}
}
