package com.acme.dbo.controller;

//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import com.acme.dbo.domain.Client;
import com.acme.dbo.service.ClientService;
import java.util.Collection;

//@RestController
//@RequestMapping("/api/client")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    public void create(String name) {
        clientService.create(name);
    }

    public Client getById(int id) {
        return clientService.findById(id);
    }

    public Collection<Client> findAll() {
        return clientService.findAll();
    }
}
