package cliente;

import codigo.*;

public class Cliente {
    public static void main(String[] args) {

   
        System.out.println("\n=== TESTE: CURSO GRATUITO ===");
        Curso curso1 = new CursoGratuito();
        curso1.executarCurso();

        System.out.println("\n=== TESTE: CURSO PREMIUM ===");
        Curso curso2 = new CursoPremium();
        curso2.executarCurso();

        System.out.println("\n=== TESTE: CURSO INTENSIVO ===");
        Curso curso3 = new CursoIntensivo();
        curso3.executarCurso();

        System.out.println("\n=== TESTE: CURSO COM RECURSOS ADICIONAIS ===");

        // Igor aqui
        Curso cursoComExtras = new CursoPremium();

        // Igor aqui
        // cursoComExtras = new MentoriaDecorator(cursoComExtras);
        // cursoComExtras = new MaterialDecorator(cursoComExtras);

        cursoComExtras.executarCurso();
    }
}