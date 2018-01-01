package br.com.hrom.springobserver.event;

import br.com.hrom.springobserver.domain.Venda;
import org.springframework.context.ApplicationEvent;

public class VendaEvent extends ApplicationEvent{

    private Venda venda;

    public VendaEvent(Object source, Venda venda) {
        super(source);
        this.venda = venda;
    }

    public Venda getVenda(){
        return this.venda;
    }
}
