import java.util.ArrayList;
import java.util.List;

public class KitProduto implements ComponenteVendas {
    private int id;
    private String nome;
    private List<ComponenteVendas> componentes;
    private double desconto;

    public KitProduto(int id, String nome, double desconto) {
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
        this.componentes = new ArrayList<>();
    }

    public void addComponente(ComponenteVendas componente) {
        componentes.add(componente);
    }

    public void remComponente(ComponenteVendas componente) {
        componentes.remove(componente);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        double precoTotal = 0;
        for (ComponenteVendas comp : componentes) {
            precoTotal += comp.getPreco();
        }
        return precoTotal * (1 - desconto / 100);
    }

    @Override
    public double calcularTotal(int quantidade) {
        return getPreco() * quantidade;
    }

    @Override
    public String toString(int quantidade) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%d %s %d x %.2f = %.2f%n", id, nome, quantidade, getPreco(), calcularTotal(quantidade)));
        for (ComponenteVendas componente : componentes) {
            sb.append("  - ").append(componente.getNome())
            .append(": ").append(String.format("%.2f%n", componente.getPreco()))
            .append("\n");
        }
        sb.append(String.format("Desconto do kit: %.1f%%%n", desconto));
        return sb.toString();
    }

    public List<ComponenteVendas> getComponentes() {
        return new ArrayList<>(componentes);
    }

    public double getDesconto() {
        return desconto;
    }
}
