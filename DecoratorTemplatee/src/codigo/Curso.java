package codigo;

import java.util.ArrayList;
import java.util.List;

// Definição da classe template
public abstract class Curso {
	// Atributos básicos docurso
    protected String nome;
    protected double precoBase;
    protected int cargaHoraria;
    protected int duracao;
    
    // módulos do curso
    protected List<String> modulos = new ArrayList<>();

    public Curso(String nome, double precoBase, int cargaHoraria, int duracao) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.cargaHoraria = cargaHoraria;
        this.duracao = duracao;
    }
    
    // Método template que não pode ser alterado pelas subclasses
    public final void executarCurso() {
    	
    	System.out.println("\n--- Iniciando: " + getNome() + " ---");
        prepararConteudo();
        disponibilizarAulas();
        aplicarAtividades();
        aplicarAvaliacoes();
        emitirCertificado();
        
        System.out.println("\nDETALHES DO CURSO:");
        System.out.println("- Carga Horária: " + cargaHoraria + "h");
        System.out.println("- Duração: " + duracao + " dias");
        System.out.println("- Investimento: R$ " + String.format("%.2f", calcularValor(0)));
        System.out.println("========================================\n");
    }

    private void prepararConteudo() {
        System.out.println("Preparando " + modulos.size() + " módulos de conteúdo");
        for (String modulo : modulos) {
            System.out.println("   -> Configurando: " + modulo);
        }
    }

    private void disponibilizarAulas() {
        System.out.println("Disponibilizando " + cargaHoraria + " horas de vídeo.");
    }

    protected abstract void aplicarAtividades();
    protected abstract void aplicarAvaliacoes();
    protected abstract void emitirCertificado();

    public abstract double calcularValor(double v);
    
    public String getNome() { 
    	return this.nome; 
    }
}