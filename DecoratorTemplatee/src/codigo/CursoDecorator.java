package codigo;

// DECORATOR ABSTRATO

public abstract class CursoDecorator extends Curso {
	
	// O componente servirá para ser utilizado pelos métodos abaixo
	
	Curso componente;

	// Construtor padrão, normal
	public CursoDecorator(Curso c) {
		
		super(c.nome, c.precoBase, c.cargaHoraria, c.duracao);
		componente = c;

	}

	// Método para calcular o valor final do curso, calculando o novo valor do preço do curso e recebendo esse novo preço por meio das classes que herdam de CursoDecorator
	public double calcularValor(double v) {
    	
    	return this.componente.calcularValor(v);
    	
    }

}
