public class App {
    public static void main(String[] args) throws Exception {
        String aux = "Desafio Padrões de Projeto";

        Codificador codBase = new CodificadorBase();
        Codificador codLogSimples = new LogSimples(new CodificadorBase());
        Codificador codLogDetalhado = new LogDetalhado(new CodificadorBase());
        Codificador codLogDesloca = new LogSimples(new CodificadorDesloca(new CodificadorBase()));

        System.out.println("--- Codificador Base ---");
        System.out.println("Original: " + aux);
        String cod = codBase.codifica(aux);
        System.out.println("Codificado: " + cod);
        System.out.println("Decodificado: " +codBase.decodifica(cod));

        System.out.println("\n--- Codificador com Log Simples ---");
        codLogSimples.codifica(aux);

        System.out.println("\n--- Codificador com Log Detalhado ---");
        codLogDetalhado.codifica(aux);  

        System.out.println("\n--- Codificador com Log Simples e Desloca ---");
        String cod1 = codLogDesloca.codifica(aux);
        System.out.println("Codificado: " + cod1);
        codLogDesloca.decodifica(cod1);
    }
}
