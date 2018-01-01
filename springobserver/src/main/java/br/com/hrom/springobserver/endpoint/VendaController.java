package br.com.hrom.springobserver.endpoint;

import br.com.hrom.springobserver.domain.Venda;
import br.com.hrom.springobserver.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

@RestController("/venda")
public class VendaController {

    @Autowired
    private VendaService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> recebeVenda(@Valid @RequestBody Venda venda) throws URISyntaxException {
        service.efetuaVenda(venda);

        //Fake uri de acesso
        return ResponseEntity.created(new URI("/venda/1")).build();
    }

}
