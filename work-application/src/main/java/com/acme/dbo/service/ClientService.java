package com.acme.dbo.service;

import org.springframework.stereotype.Service;

import com.acme.dbo.dao.ClientRepository;
import com.acme.dbo.domain.Client;
import java.util.Collection;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client create(String name) {
        return clientRepository.createClient(new Client(name));
    }

    public Client findById(int id) {
        return clientRepository.findById(id);
    }

    public Collection<Client> findAll() {
        return clientRepository.findAll();
    }
}
