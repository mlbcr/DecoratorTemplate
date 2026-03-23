package codigo;

public class CursoGratuito extends Curso {
	
	protected double valor = 0;

    public CursoGratuito() {
        super("Introdução básica a C", 0, 20, 7);
        this.modulos.add("O que é C");
        this.modulos.add("Para que serve C");
        this.modulos.add("Como usamos C");
    }

    @Override
    protected void aplicarAtividades() {
        System.out.println("Liberando quiz de múltipla escolha simples");
    }

    @Override
    protected void aplicarAvaliacoes() {
        System.out.println("Este curso não possui avaliações");
    }

    @Override
    protected void emitirCertificado() {
        System.out.println("Esse curso não gera certificado!");
    }

    
    public double calcularValor(double v) {
    	
    	return valor + v;
    	
    }

}