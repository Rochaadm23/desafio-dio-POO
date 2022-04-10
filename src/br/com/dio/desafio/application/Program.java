package br.com.dio.desafio.application;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Curso curso3 = new Curso();

        curso1.setTitle("Java");
        curso1.setDescription("Curso de programação JAVA");
        curso1.setCargaHoraria(8);

        curso2.setTitle("CSS");
        curso2.setDescription("Curso de estilos com CSS");
        curso2.setCargaHoraria(4);

        curso3.setTitle("Curso Pentesting");
        curso3.setDescription("Aprenda técnicas de Hacking");
        curso3.setCargaHoraria(40);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitle("Mentoria JAVA");
        mentoria1.setDescription("Passando os bizus de java");
        mentoria1.setDate(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setName("Bootcamp JAVA Developer");
        bootcamp1.setDescription("Desenvolva suas habilidades de programado java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(curso3);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devRocha = new Dev();
        devRocha.setName("Rocha");
        devRocha.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos DEV: " + devRocha.getName() + devRocha.getConteudosInscritos());
        devRocha.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos DEV: " + devRocha.getName() + devRocha.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos DEV: " + devRocha.getName() + devRocha.getConteudosConcluidos());

        System.out.println("---------------------------------------------------------------------------------");

        Dev devBart = new Dev();
        devBart.setName("Bart");
        devBart.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos DEV: " + devBart.getName() + devBart.getConteudosInscritos());
        devBart.progredir();
        devBart.progredir();
        devBart.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos DEV: " + devBart.getName() + devBart.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos DEV: " + devBart.getName() + devBart.getConteudosConcluidos());
        System.out.println("XP: " + devBart.calcularTotalXp());


    }
}
