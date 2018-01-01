package br.com.hrom.springobserver.service;


import br.com.hrom.springobserver.domain.Venda;
import br.com.hrom.springobserver.event.VendaEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NFService implements ApplicationListener<VendaEvent> {

    private void emiteNF(Venda venda){
        int nroNF = new Random().nextInt(1000);
        System.out.println("Emitindo NF " + nroNF + " para o comprador: " + venda.getComprador());
    }

    @Override
    public void onApplicationEvent(VendaEvent event) {
        System.out.println("Evento de venda de " + event.getSource().getClass().getName());
        emiteNF(event.getVenda());
    }
}
