package br.edu.infnet.appreservaconteudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppreservaconteudoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppreservaconteudoApplication.class, args);
	}

}
