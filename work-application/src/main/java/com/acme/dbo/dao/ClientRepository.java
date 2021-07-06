package com.acme.dbo.dao;

import com.acme.dbo.domain.Client;
import java.util.Collection;

public interface ClientRepository {
    Client createClient(Client client);
    Client findById(int id);
    Collection<Client> findAll();
}
