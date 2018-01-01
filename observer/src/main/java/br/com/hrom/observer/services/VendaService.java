package br.com.hrom.observer.services;

import br.com.hrom.observer.domain.Venda;
import br.com.hrom.observer.observer.Observable;
import br.com.hrom.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class VendaService implements Observable<Venda>{

    private List<Observer<Venda>> services = new ArrayList<Observer<Venda>>();

    public void registerObserver(Observer<Venda> observer) {
        services.add(observer);
    }

    public void removeObserver(Observer<Venda> observer) {
        services.remove(observer);
    }

    public void notifyObservers(Venda venda) {
        services.forEach(service -> service.notify(venda));
    }

    public void efetuaVenda(Venda venda){
        System.out.println("Venda do produto " + venda.getProduto() + " para o cliente " + venda.getComprador()
                + " em " + venda.getDataCompra());
        notifyObservers(venda);
    }
}
