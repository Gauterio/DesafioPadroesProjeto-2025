public class LogDetalhado extends CodDecorator{
    public LogDetalhado(Codificador cod){
        super(cod);
    }
    
    @Override
    public String codifica(String str){
        String timestamp = java.time.LocalDateTime.now().toString();
        System.out.println("[LOG DETALHADO] [" + timestamp + "] Codificando: " + str);
        String resultado = super.codifica(str);
        System.out.println("[LOG DETALHADO] [" + timestamp + "] Codificado: " + resultado);
        return resultado;
    }

    @Override
    public String decodifica(String str){
        String timestamp = java.time.LocalDateTime.now().toString();
        System.out.println("[LOG DETALHADO] [" + timestamp + "] Decodificando: " + str);
        String resultado = super.decodifica(str);
        System.out.println("[LOG DETALHADO] [" + timestamp + "] Decodificado: " + resultado);
        return resultado;
    }
}
