public interface ComponenteVendas {
    int getId();
    String getNome();
    double getPreco();
    double calcularTotal(int quantidade);
    String toString(int quantidade);
}
