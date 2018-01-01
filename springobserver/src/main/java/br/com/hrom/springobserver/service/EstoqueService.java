package br.com.hrom.springobserver.service;

import br.com.hrom.springobserver.domain.Venda;
import br.com.hrom.springobserver.event.VendaEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class EstoqueService implements ApplicationListener<VendaEvent>{


    private void separaMercadoria(Venda venda){
        System.out.println("Separar no estoque o produto " + venda.getProduto());
    }

    @Override
    public void onApplicationEvent(VendaEvent event) {
        System.out.println("Evento de venda de " + event.getSource().getClass().getName());
        separaMercadoria(event.getVenda());
    }
}
