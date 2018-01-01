package br.com.hrom.observer.services;

import br.com.hrom.observer.domain.Venda;
import br.com.hrom.observer.observer.Observer;

public class EstoqueService implements Observer<Venda>{

    public void notify(Venda venda) {
        separaMercadoria(venda);
    }

    private void separaMercadoria(Venda venda){
        System.out.println("Separar no estoque o produto " + venda.getProduto());
    }

}
