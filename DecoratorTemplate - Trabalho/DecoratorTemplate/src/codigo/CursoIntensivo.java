package codigo;

public class CursoIntensivo extends Curso {
	
	protected double valor = 60;

    public CursoIntensivo() {
        super("Imersão C Super Intensivo Rápido Vire Programador C Urgente", 60, 80, 30);
        this.modulos.add("Programação em C");
        this.modulos.add("Exercícios C");
        this.modulos.add("Projeto Super Prático em C");
    }

    @Override
    protected void aplicarAtividades() {
        System.out.println("Liberando maratona de exercícios");
    }

    @Override
    protected void aplicarAvaliacoes() {
        System.out.println("Avaliação em tempo real com cronômetro ativado!");
    }

    @Override
    protected void emitirCertificado() {
        try {
            System.out.println("Gerando certificado...");
            for (int i = 0; i <= 100; i += 25) { 
                System.out.println("   > Turbo: " + i + "%...");
                Thread.sleep(150);
            }
            System.out.println("Certificado Intensivo gerado com sucesso!");
        } catch (InterruptedException e) {
            System.out.println("Erro na emissão do certificado.");
        }
    }
    
    public double calcularValor(double v) {
    	
    	return valor + v;
    	
    }
}