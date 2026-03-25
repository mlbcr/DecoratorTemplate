package cliente;

import codigo.*;

public class Cliente {
    public static void main(String[] args) {

    	// Testes
        System.out.println("\n=== TESTE: CURSO BÁSICO GRATUITO ===");
        Curso curso1 = new CursoGratuito();
        curso1.executarCurso();

        System.out.println("\n=== TESTE: CURSO BÁSICO PREMIUM ===");
        Curso curso2 = new CursoPremium();
        curso2.executarCurso();

        System.out.println("\n=== TESTE: CURSO BÁSICO INTENSIVO ===");
        Curso curso3 = new CursoIntensivo();
        curso3.executarCurso();

        System.out.println("\n=== RECURSOS ADICIONAIS ===");
        
        // O enunciado pediu para que aplicasse diferentes combinações de recursos adicionais

        curso1 = new Monitoria(curso1);
        curso1 = new Forum(curso1);
        
        curso2 = new Monitoria(curso2);
        curso2 = new MaterialComplementar(curso2);
        curso2 = new LivesSalvas(curso2);
        
        curso3 = new MaterialComplementar(curso3);
        curso3 = new Forum(curso3);
        curso3 = new LivesSalvas(curso3);
        
        System.out.println("\n=== TESTE: CURSO GRATUITO COM SERVIÇOS ===");
        curso1.executarCurso();
        
        System.out.println("\n=== TESTE: CURSO PREMIUM COM SERVIÇOS ===");
        curso2.executarCurso();
        
        System.out.println("\n=== TESTE: CURSO INTENSIVO COM SERVIÇOS ===");
        curso3.executarCurso();
    }
}