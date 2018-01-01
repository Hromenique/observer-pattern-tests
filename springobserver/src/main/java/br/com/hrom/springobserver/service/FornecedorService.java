package br.com.hrom.springobserver.service;

import br.com.hrom.springobserver.domain.Venda;
import br.com.hrom.springobserver.event.VendaEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService implements ApplicationListener<VendaEvent> {


    private void solicitaNovoProduto(Venda venda) throws InterruptedException {
        //to do tratar o processamento assincrono
        System.out.println("dormindo");
        Thread.sleep(5*1000);
        System.out.println("Solicitando um novo produto " + venda.getProduto());
    }

    @Override
    public void onApplicationEvent(VendaEvent event) {
        System.out.println("Evento de venda de " + event.getSource().getClass().getName());
        try {
            solicitaNovoProduto(event.getVenda());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
