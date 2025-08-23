public class ItemDeVenda {
    private ComponenteVendas componente;
    private int quantidade;

    public ItemDeVenda(ComponenteVendas componente, int quantidade) {
        this.componente = componente;
        this.quantidade = quantidade;
    }

    public ComponenteVendas getComponente() {
        return componente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getSubTotal() {
        return componente.calcularTotal(quantidade);
    }

    @Override
    public String toString() {
        return componente.toString(quantidade);
    }
}
