package com.br.LinkTin.LinkTin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.br.LinkTin.LinkTin")
@EnableJpaRepositories(basePackages = "com.br.LinkTin.LinkTin.model.repository")
public class LinkTinApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkTinApplication.class, args);
	}
}
