import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendasEmMemoria implements VendasFachada{
	private List<ComponenteVendas> componentes;
	
	public VendasEmMemoria() {
		componentes = new ArrayList<>();

		Produto caneta = new Produto(1, "Caneta", 1.55);
		Produto borracha = new Produto(2, "Borracha", 1.15);
		Produto caderno = new Produto(3, "Caderno", 23.99);
		Produto lapis = new Produto(4, "Lápis", 0.99);
		Produto estojo = new Produto(5, "Estojo", 15.90);

		componentes.add(caneta);
		componentes.add(borracha);
		componentes.add(caderno);
		componentes.add(lapis);
		componentes.add(estojo);

		KitProduto kit1 = new KitProduto(101, "Kit 1", 10.0);
		kit1.addComponente(caneta);
		kit1.addComponente(borracha);
		kit1.addComponente(lapis);

		KitProduto kit2 = new KitProduto(102, "Kit 2", 20.0);
		kit2.addComponente(caneta);
		kit2.addComponente(borracha);
		kit2.addComponente(lapis);
		kit2.addComponente(estojo);
		kit2.addComponente(caderno);

		componentes.add(kit1);
		componentes.add(kit2);
	}
	
	@Override
	public Venda iniciarVenda() {
		return new Venda(LocalDateTime.now());
	}

	@Override
	public void registrarVenda(Venda umaVenda, int codigoProduto, int quantidade) {
		ComponenteVendas comp = componentes.stream()
			.filter(c -> c.getId() == codigoProduto)
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("Componente com código " + codigoProduto + " não encontrado."));
		umaVenda.registrarVenda(comp, quantidade);
	}

	@Override
	public String emitirComprovante(Venda umaVenda) {
		return umaVenda.emitirComprovante();
	}

	@Override
	public List<ComponenteVendas> buscarComponentes() {
		return Collections.unmodifiableList(componentes);
	}

	@Override
	public List<Produto> buscarProdutos() {
		List<Produto> produtos = new ArrayList<>();
		for (ComponenteVendas comp : componentes) {
			if (comp instanceof Produto) {
				produtos.add((Produto) comp);
			}
		}
		return Collections.unmodifiableList(produtos);
	}

	@Override
	public List<KitProduto> buscarKits() {
		List<KitProduto> kits = new ArrayList<>();
		for (ComponenteVendas comp : componentes) {
			if (comp instanceof KitProduto) {
				kits.add((KitProduto) comp);
			}
		}
		return Collections.unmodifiableList(kits);
	}

}
