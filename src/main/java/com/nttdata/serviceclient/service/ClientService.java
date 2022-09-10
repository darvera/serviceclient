package com.nttdata.serviceclient.service;

import com.nttdata.serviceclient.model.Client;

import java.util.List;

public interface ClientService {
    List<Client> findAll();

    Client findByClientNumber(String idclient);

    Client saveClient(Client client);

    Client updateClient(Client client);

    void deleteClientById(String id);
}
