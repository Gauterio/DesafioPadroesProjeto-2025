public class DadoDecorator implements Dado{
    protected Dado dadoDecorator;

    public DadoDecorator(Dado dado) {
        this.dadoDecorator = dado;
    }
    @Override
    public void rolar() {
        dadoDecorator.rolar();
    }

    @Override
    public int getValor() {
        return dadoDecorator.getValor();
    }

    @Override
    public int getLados() {
        return dadoDecorator.getLados();
    }
}
