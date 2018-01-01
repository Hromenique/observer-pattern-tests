package br.com.hrom.observer.services;

import br.com.hrom.observer.domain.Venda;
import br.com.hrom.observer.observer.Observer;

import java.util.Random;

public class NFService implements Observer<Venda>{

    public void notify(Venda venda) {
        emiteNF(venda);
    }

    private void emiteNF(Venda venda){
        int nroNF = new Random().nextInt(1000);
        System.out.println("Emitindo NF " + nroNF + " para o comprador: " + venda.getComprador());
    }

}
