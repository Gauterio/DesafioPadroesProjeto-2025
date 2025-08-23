// valor mínimo do dado garantido

public class DadoMinimo extends DadoDecorator{
    private int minimo;

    public DadoMinimo(Dado dado, int minimo) {
        super(dado);
        this.minimo = minimo;
    }

    @Override
    public int getValor() {
        return Math.max(minimo, dadoDecorator.getValor());
    }

    public int getValorOriginal() {
        return dadoDecorator.getValor();
    }

    public int getMinimo() {
        return minimo;
    }
}
