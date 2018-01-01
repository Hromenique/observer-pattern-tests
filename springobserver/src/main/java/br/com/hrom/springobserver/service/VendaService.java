package br.com.hrom.springobserver.service;


import br.com.hrom.springobserver.domain.Venda;
import br.com.hrom.springobserver.event.VendaEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class VendaService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher eventPublisher;

    public void efetuaVenda(Venda venda){
        System.out.println("Venda do produto " + venda.getProduto() + " para o cliente " + venda.getComprador()
                + " em " + venda.getDataCompra());

        eventPublisher.publishEvent(new VendaEvent(this, venda));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
}
