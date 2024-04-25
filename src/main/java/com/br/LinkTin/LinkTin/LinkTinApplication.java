package com.br.LinkTin.LinkTin;

import com.br.LinkTin.LinkTin.model.domain.Candidato;
import com.br.LinkTin.LinkTin.model.domain.Recrutador;
import com.br.LinkTin.LinkTin.model.repository.CandidatoRepositorio;
import com.br.LinkTin.LinkTin.model.repository.RecrutadorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LinkTinApplication implements CommandLineRunner {

	@Autowired
	private CandidatoRepositorio candidatoRepositorio;

	private RecrutadorRepositorio recrutadorRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(LinkTinApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Candidato candidato = new Candidato();
		candidato.setNome("Patrick Mendes");
		candidato.setEmail("algumacoisa@gmail.com");

		System.out.println(candidato);

		Recrutador recrutador = new Recrutador();

		recrutador.setNome("Mariana Dias");
		recrutador.setEmpresa("Google");
		recrutador.setEmail("algumacoisa@gmail.com");

		System.out.println(recrutador);

	}
}
