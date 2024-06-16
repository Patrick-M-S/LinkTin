package com.br.LinkTin.LinkTin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(scanBasePackages = "com.br.LinkTin.LinkTin")
@EnableJpaRepositories(basePackages = "com.br.LinkTin.LinkTin.model.repository")
public class LinkTinApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkTinApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("http://localhost:3000") // Permitir requisições apenas do frontend em localhost:3000
						.allowedMethods("GET", "POST", "PUT", "DELETE")
						.allowedHeaders("*");
			}
		};
	}
}
