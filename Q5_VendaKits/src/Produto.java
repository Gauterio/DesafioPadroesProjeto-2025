public class Produto implements ComponenteVendas {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public double calcularTotal(int quantidade) {
        return preco * quantidade;
    }

    @Override
    public String toString(int quantidade) {
        return String.format("%d %s %d x %.2f = %.2f%n", id, nome, quantidade, preco, calcularTotal(quantidade));
    }   
}
