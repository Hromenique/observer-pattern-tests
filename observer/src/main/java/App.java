import br.com.hrom.observer.domain.Venda;
import br.com.hrom.observer.services.EstoqueService;
import br.com.hrom.observer.services.FornecedorService;
import br.com.hrom.observer.services.NFService;
import br.com.hrom.observer.services.VendaService;

import java.util.Date;

public class App {

    public static void main(String[] args){
        FornecedorService fornecedorService = new FornecedorService();
        NFService nfService = new NFService();
        EstoqueService estoqueService = new EstoqueService();

        VendaService vendaService = new VendaService();

        vendaService.registerObserver(fornecedorService);
        vendaService.registerObserver(nfService);
        vendaService.registerObserver(estoqueService);

        Venda venda1 = new Venda();
        venda1.setComprador("Son Goku");
        venda1.setProduto("Nuvem voadora");
        venda1.setDataCompra(new Date());

        vendaService.efetuaVenda(venda1);

        Venda venda2 = new Venda();
        venda2.setComprador("He man");
        venda2.setProduto("Espada de Greyskull");
        venda2.setDataCompra(new Date());

        vendaService.efetuaVenda(venda2);
    }
}
