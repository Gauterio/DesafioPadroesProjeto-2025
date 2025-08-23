public class DadoDesvantagem extends DadoDecorator {
    private int valorAlternativo;

    public DadoDesvantagem(Dado dado) {
        super(dado);
    }

    @Override
    public void rolar() {
        dadoDecorator.rolar();
        int primValor = dadoDecorator.getValor();

        dadoDecorator.rolar();
        int segValor = dadoDecorator.getValor();

        valorAlternativo = Math.min(primValor, segValor);
    }

    @Override
    public int getValor() {
        return valorAlternativo;    
    }

    public int getPrimeiroValor() {
        return super.getValor();
    }
}
