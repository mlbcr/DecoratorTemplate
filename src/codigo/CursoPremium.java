package codigo;

public class CursoPremium extends Curso {
	
	protected double valor = 30;

    public CursoPremium() {
        super("Bootcamp Programação em C Zero Ao Avançado Master", 30, 120, 15);
        this.modulos.add("Aprendendo C");
        this.modulos.add("Estrutura de Dados em C");
        this.modulos.add("Grafos em C");
        this.modulos.add("Como arrumar emprego em C");
    }

    @Override
    protected void aplicarAtividades() {
        System.out.println("Liberando notebooks Jupyter para exercícios práticos.");
        // Será que a gente cria atividades reais??
    }

    @Override
    protected void aplicarAvaliacoes() {
        System.out.println("Iniciando avaliação por pares e projeto final no GitHub.");
        // Será que a gente desenvolve mesmo uma avaliação?? 
    }

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