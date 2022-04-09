package br.com.dio.desafio.application;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitle("Java");
        curso1.setDescription("Curso de programação JAVA");
        curso1.setCargaHoraria(8);

        curso2.setTitle("CSS");
        curso2.setDescription("Curso de estilos com CSS");
        curso2.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitle("Mentoria JAVA");
        mentoria1.setDescription("Passando os bizus de java");
        mentoria1.setDate(LocalDate.now());

        System.out.println(mentoria1);
    }
}
