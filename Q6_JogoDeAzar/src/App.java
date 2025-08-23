public class App {
    public static void main(String[] args) {
        System.out.println("-- Dados Simples --");
        Dado d6 = new DadoSimples(6);
        Dado d20 = new DadoSimples(20);
        d6.rolar();
        d20.rolar();
        System.out.println("D6: " + d6.getValor());
        System.out.println("D20: " + d20.getValor());

        System.out.println("\n-- Dado com Vantagem --");
        Dado d20Vantagem = new DadoVantagem(new DadoSimples(20));
        d20Vantagem.rolar();
        System.out.println("D20 Vantagem: " + d20Vantagem.getValor());

        System.out.println("\n-- Dado com Desvantagem --");
        Dado d20Desvantagem = new DadoDesvantagem(new DadoSimples(20));
        d20Desvantagem.rolar();
        System.out.println("D20 Desvantagem: " + d20Desvantagem.getValor());

        System.out.println("\n-- Dado com Modificador -- ");
        Dado d6ComBonus = new DadoModificado(new DadoSimples(6), 2);
        d6ComBonus.rolar();
        System.out.println("D6 + 2: " + d6ComBonus.getValor());

        System.out.println("\n-- Dado com Minímo Garantido --");
        Dado d8Minimo = new DadoMinimo(new DadoSimples(8), 4);
        d8Minimo.rolar();
        System.out.println("D8 (Minímo 4): " + d8Minimo.getValor());

        System.out.println("\n-- Dado com Vantagem e Modificador --");    
        Dado d20VantagemComBonus = new DadoModificado(new DadoVantagem(new DadoSimples(20)), 3);
        d20VantagemComBonus.rolar();
        System.out.println("D20 Vantagem + 3: " + d20VantagemComBonus.getValor());  

        
    }
}
