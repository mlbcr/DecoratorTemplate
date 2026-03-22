package codigo;

import java.util.ArrayList;
import java.util.List;

public abstract class Curso {
    protected String nome;
    protected double precoBase;
    protected int cargaHoraria;
    protected List<String> modulos = new ArrayList<>();

    public Curso(String nome, double precoBase, int cargaHoraria) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.cargaHoraria = cargaHoraria;
    }

    public final void executarCurso() {
    	
    	System.out.println("\n--- Iniciando: " + getNome() + " ---");
        prepararConteudo();
        disponibilizarAulas();
        aplicarAtividades();
        aplicarAvaliacoes();
        emitirCertificado();
        
        System.out.println("\nDETALHES DO CURSO:");
        System.out.println("- Carga Horária: " + cargaHoraria + "h");
        System.out.println("- Duração: " + getDuracao() + " dias");
        System.out.println("- Investimento: R$ " + calcularValor());
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
    protected abstract int getDuracao();

    public double calcularValor() {
    	return this.precoBase;
    }
    public String getNome() { 
    	return this.nome; 
    }
}