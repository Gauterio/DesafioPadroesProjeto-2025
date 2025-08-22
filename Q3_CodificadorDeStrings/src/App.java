public class App {
    public static void main(String[] args) throws Exception {
        String aux = "Desafio Padrões de Projeto";

        Codificador codBase = new CodificadorBase();
        Codificador codLogSimples = new LogSimples(new CodificadorBase());
        Codificador codLogDetalhado = new LogDetalhado(new CodificadorBase());
        Codificador codLogDesloca = new LogSimples(new CodificadorDesloca(new CodificadorBase()));

    }
}
