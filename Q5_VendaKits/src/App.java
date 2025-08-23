import java.util.List;

public class App {
    public static void main(String[] args){
        VendasFachada proc = new VendasEmMemoria();
        List<ComponenteVendas> componentes = proc.buscarComponentes();
        Venda venda = proc.iniciarVenda();
        proc.registrarVenda(venda, 1, 1);
        proc.registrarVenda(venda, 2, 2);
        proc.registrarVenda(venda,101, 1);
        
        System.out.println(proc.emitirComprovante(venda));

        Venda vandaKits = proc.iniciarVenda();
        proc.registrarVenda(vandaKits, 102, 2);
        proc.registrarVenda(vandaKits, 101, 1);

        System.out.println(proc.emitirComprovante(vandaKits));
    }
}
