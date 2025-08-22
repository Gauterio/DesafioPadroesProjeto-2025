public class App {
    public static void main(String[] args) throws Exception {
        Codificadorr cod = new Codificadorr();

        String aux = "Desafio Padrões de Projeto";

        System.out.println(aux);
        aux = cod.codifica(Codificadorr.Tipo.SIMPLES, aux);
        System.out.println(aux);
        aux = cod.deCodifica(Codificadorr.Tipo.SIMPLES, aux);
        System.out.println(aux);
        aux = cod.codifica(Codificadorr.Tipo.DESLOCA, aux);
        System.out.println(aux);
        aux = cod.deCodifica(Codificadorr.Tipo.DESLOCA, aux);
        System.out.println(aux);
    }
}
