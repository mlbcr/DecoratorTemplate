package codigo;

public class CursoIntensivo extends Curso {
	// Valor base do curso intensivo é 60 reais
	protected double valor = 60;
	
    public CursoIntensivo() {
    	// Chama o construtor da classe pai (nome, precoBase, cargaHoraria, duracao)
        super("Imersão C Super Intensivo Rápido Vire Programador C Urgente", 60, 80, 30);
        
        // Esses são módulos do curso intensivo

        this.modulos.add("Programação em C");
        this.modulos.add("Exercícios C");
        this.modulos.add("Projeto Super Prático em C");
    }
    
    // Especificação das atividades para o curso intensivo.
    @Override
    protected void aplicarAtividades(){
        System.out.println("Liberando maratona de exercícios");
    }
    
    // A avaliação é feita com cronômetro
    @Override
    protected void aplicarAvaliacoes() {
        System.out.println("Avaliação em tempo real com cronômetro ativado!");
    }
    
    // Emite o certificado mais rápido
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