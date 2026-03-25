package codigo;

// DECORATOR CONCRETO

public class Monitoria extends CursoDecorator {
	
	// O valor base do serviço
	private double valor = 20;
	
	// O construtor padrão, normal
	public Monitoria(Curso c) {
		
		super(c);
		componente = c;
		
	}
	
	// Os 3 métodos abaixo são abstratos, então precisam ser implementadas, mesmo que não mudem muito de acordo com o serviço

	@Override
	protected void aplicarAtividades() {
		
		componente.aplicarAtividades();
		
	}


	@Override
	protected void aplicarAvaliacoes() {
		
		componente.aplicarAvaliacoes();
		
	}

	@Override
	protected void emitirCertificado() {
		
		componente.emitirCertificado();
		
	}
	
	// O método para calcular, pegando o valor base do curso e somando com o valor do curso e/ou outros serviços

	@Override
	public double calcularValor(double v) {
		
		addMonitoria();
		
		return this.valor + componente.calcularValor(v);
	}
	
	// Uma mensagem para dizer que o serviço foi implementado/incrementou o valor
	
	public void addMonitoria() {
		
		System.out.println("Sistema de Monitoria adicionado!\n");
		
	}

}
