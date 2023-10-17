package Dio.Bootcamp.Santander2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PradroesDeProjetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PradroesDeProjetosApplication.class, args);
	}

}
