package com.nttdata.serviceclient.repository;

import com.nttdata.serviceclient.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRespository extends MongoRepository<Client,String> {

}
