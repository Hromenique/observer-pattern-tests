package br.com.hrom.observer.services;

import br.com.hrom.observer.domain.Venda;
import br.com.hrom.observer.observer.Observer;

public class FornecedorService implements Observer<Venda>{

    public void notify(Venda venda) {
        solicitaNovoProduto(venda);
    }

    private void solicitaNovoProduto(Venda venda){
        System.out.println("Solicitando um novo produto " + venda.getProduto());
    }

}
