public class Validador {
    public enum Tipo { EMAIL, INTEIRO, MATRICULA }
    
    private Valida strategy;
    
    public void setStrategy(Tipo tipo) {
        switch(tipo) {
            case EMAIL:
                strategy = new ValidadorEmail();
                break;
            case INTEIRO:
                strategy = new ValidadorInteiro();
                break;
            case MATRICULA:
                strategy = new ValidadorMatricula();
                break;
        }
    }
    public boolean valida(Tipo tipo, String valor) {
        setStrategy(tipo);
        return strategy.valida(valor);
    }
}