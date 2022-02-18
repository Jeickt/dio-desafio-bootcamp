package app;

import java.time.LocalDate;

import domain.Bootcamp;
import domain.Curso;
import domain.Dev;
import domain.Mentoria;

public class aplicacao {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição do Curso JavaScript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição da Mentoria de Java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setTitulo("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devJeison = new Dev();
		devJeison.setNome("Jeison");
		devJeison.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteúdos inscritos de " + devJeison.getNome() + ": " + devJeison.getConteudosInscritos());
		devJeison.progredirBootcamp();
		System.out.println("Conteúdos concluídos de " + devJeison.getNome() + ": " + devJeison.getConteudosConcluidos());
		System.out.println("XP de " + devJeison.getNome() + ": " + devJeison.calcularXpTotal());
	}
}
