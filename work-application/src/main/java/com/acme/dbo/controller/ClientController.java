package java.com.acme.dbo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.com.acme.dbo.domain.Client;
import java.com.acme.dbo.service.ClientService;
import java.util.Collection;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    public void create(@RequestBody String name) {
        clientService.create(name);
    }

    public Client getById(@RequestBody int id) {
        return clientService.findById(id);
    }

    public Collection<Client> findAll() {
        return clientService.findAll();
    }
}
