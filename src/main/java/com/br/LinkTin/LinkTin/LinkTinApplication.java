package com.br.LinkTin.LinkTin;

import com.br.LinkTin.LinkTin.model.domain.Candidato;
import com.br.LinkTin.LinkTin.model.domain.CandidatoDados;
import com.br.LinkTin.LinkTin.model.domain.Recrutador;
import com.br.LinkTin.LinkTin.model.repository.CandidatoRepositorio;
import com.br.LinkTin.LinkTin.model.repository.RecrutadorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.Date;

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
		candidato.setNome("João");
		candidato.setEmail("joao@example.com");
		candidato.setTelefone("123456789");
		candidato.setCpf("123.456.789-00");

		Calendar calendar = Calendar.getInstance();
		calendar.set(2001, Calendar.NOVEMBER, 29);
		Date dataNascimento = calendar.getTime();
		candidato.setDataNascimento(dataNascimento);

		candidato.setGenero('M');
		CandidatoDados candidatoDados = new CandidatoDados();
		candidatoDados.setHabilidades("Java, Spring Boot");
		candidatoDados.setTemEmprego(false);
		candidatoDados.setCurriculo(null);
		candidatoDados.setEspecificacoesTrabalho("Desenvolvedor Java Jr");

		candidato.setCandidatoDados(candidatoDados);
		candidatoDados.setCandidato(candidato);

		System.out.println(candidato);
		System.out.println(candidatoDados);
	}
}
