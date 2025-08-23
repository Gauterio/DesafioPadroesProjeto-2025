public class DadoVantagem extends DadoDecorator {
    private int valorAlternativo;

    public DadoVantagem(Dado dado) {
        super(dado);
    }

    @Override
    public void rolar() {
        dadoDecorator.rolar();
        int primValor = dadoDecorator.getValor();

        dadoDecorator.rolar();
        int segValor = dadoDecorator.getValor();

        valorAlternativo = Math.max(primValor, segValor);
    }

    @Override
    public int getValor() {
        return valorAlternativo;    
    }

    public int getPrimeiroValor() {
        return super.getValor();
    }
}
