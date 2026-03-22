package codigo;

public class CursoGratuito extends Curso {

    public CursoGratuito() {
        super("Introdução básica a C", 0.0, 20);
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

    @Override
    protected int getDuracao() {
        return 7;
    }
}