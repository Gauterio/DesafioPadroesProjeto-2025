public abstract class CodDecorator implements Codificador{
    protected Codificador codDecorator;

    public CodDecorator(Codificador cod){
        this.codDecorator = cod;
    }

    @Override
    public String codifica(String str){
        return codDecorator.codifica(str);
    }

    @Override
    public String decodifica(String str){
        return codDecorator.decodifica(str);
    }
}