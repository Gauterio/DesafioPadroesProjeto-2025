// dado com modificador

public class DadoModificado extends DadoDecorator{
    private int modificador;

    public DadoModificado(Dado dado, int modificador) {
        super(dado);
        this.modificador = modificador;
    }

    @Override
    public int getValor() {
        return Math.max(1, dadoDecorator.getValor() + modificador);
    }

    public int getModificador() {
        return modificador;
    }

    public int getValorOriginal() {
        return dadoDecorator.getValor();
    }
}
