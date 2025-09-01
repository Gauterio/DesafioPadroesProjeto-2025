public class LogSimples extends CodDecorator{
    public LogSimples(Codificador cod){
        super(cod);
    }

    @Override
    public String codifica(String str){
        System.out.println("[LOG] Codificando: " + str);
        String resultado = super.codifica(str);
        System.out.println("[LOG] Codificado: " + resultado);
        return resultado;
    }

    @Override
    public String decodifica(String str){
        System.out.println("[LOG] Decodificando: " + str);
        String resultado = super.decodifica(str);
        System.out.println("[LOG] Decodificado: " + resultado);
        return resultado;
    }    
}