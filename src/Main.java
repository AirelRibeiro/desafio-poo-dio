import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Developer;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Developer developer1 = new Developer();
        developer1.setNome("Airel");
        developer1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Airel:" + developer1.getConteudosInscritos());
        developer1.progredir();
        developer1.progredir();

        Developer developer2 = new Developer();
        developer2.setNome("Ana");
        developer2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana:" + developer2.getConteudosInscritos());
        developer2.progredir();
        developer2.progredir();
        developer2.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Airel:" + developer1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Airel:" + developer1.getConteudosConcluidos());
        System.out.println("XP:" + developer1.calcularTotalXp());

        System.out.println("-------// --------------//----------");

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ana:" + developer2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Ana:" + developer2.getConteudosConcluidos());
        System.out.println("XP:" + developer2.calcularTotalXp());
    }
}
