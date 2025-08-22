public class LogSimples extends CodDecorator{
    public LogSimples(Codificador cod){
        super(cod);
    }

    @Override
    public String codifica(String str){
        System.out.println("Codificando: " + str);
        String resultado = super.codifica(str);
        System.out.println("Codificado: " + resultado);
        return resultado;
    }

    @Override
    public String decodifica(String str){
        System.out.println("Decodificando: " + str);
        String resultado = super.decodifica(str);
        System.out.println("Decodificado: " + resultado);
        return resultado;
    }    
}
