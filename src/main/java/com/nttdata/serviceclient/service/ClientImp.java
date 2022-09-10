package com.nttdata.serviceclient.service;

import com.nttdata.serviceclient.model.Client;
import com.nttdata.serviceclient.repository.ClientRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.management.Query;
import javax.management.QueryEval;
import java.util.List;

@Service
public class ClientImp implements ClientService {
    @Autowired
    private ClientRespository clientRespository;
    @Override
    public List<Client> findAll() {
        return clientRespository.findAll();
    }

    @Override
    public Client findByClientNumber(String id) {
        return null;
    }

    @Override
    public Client saveClient(Client client) {
        return clientRespository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRespository.save(client);
    }

    @Override
    public void deleteClientById(String id) {
        clientRespository.deleteById(id);
    }
}
