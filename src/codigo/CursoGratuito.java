package codigo;

public class CursoGratuito extends Curso {
	// Como o curso é gratuito, o valor é 0
	protected double valor = 0;

    public CursoGratuito() {
    	// Chama o construtor da classe pai (nome, precoBase, cargaHoraria, duracao)
        super("Introdução básica a C", 0, 20, 7);
        
        // Esses são módulos do curso gratuito
        this.modulos.add("O que é C");
        this.modulos.add("Para que serve C");
        this.modulos.add("Como usamos C");
    }
    
    // Especificação das atividades para as do curso gratuito
    @Override
    protected void aplicarAtividades() {
        System.out.println("Liberando quiz de múltipla escolha simples");
    }
    
    // O curso gratuito não é avaliado e não emite certificado
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