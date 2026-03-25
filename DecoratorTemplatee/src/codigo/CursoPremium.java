package codigo;

public class CursoPremium extends Curso {
	
	protected double valor = 30;
	// Classe CursoPremium herda da classe Curso (provavelmente abstrata)
    public CursoPremium() {
        super("Bootcamp Programação em C Zero Ao Avançado Master", 30, 120, 15);
        this.modulos.add("Aprendendo C");
        this.modulos.add("Estrutura de Dados em C");
        this.modulos.add("Grafos em C");
        this.modulos.add("Como arrumar emprego em C");
    }
    
    // Especificação das atividades para o curso premium.
    @Override
    protected void aplicarAtividades() {
        System.out.println("Liberando notebooks Jupyter para exercícios práticos.");
    }
    
    // A avaliação é feita por um projeto final no Github
    @Override
    protected void aplicarAvaliacoes() {
        System.out.println("Iniciando avaliação por projeto final no GitHub.");
    }
    
    // Esse curso emite certificado
    @Override
    protected void emitirCertificado() {
    	try {
            System.out.println("Emitindo certificado...");
            for (int i = 0; i <= 100; i += 20) {
                System.out.println("   > Progresso: " + i + "%...");
                Thread.sleep(500); 
            }
        } catch (InterruptedException e) {
            System.out.println("Erro na geração do certificado.");
        }
    }
    
    public double calcularValor(double v) {
    	
    	return valor + v;
    	
    }
}