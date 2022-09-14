package com.nttdata.serviceclient.controller;

import com.nttdata.serviceclient.controller.DTO.ClientDTO;
import com.nttdata.serviceclient.model.Client;
import com.nttdata.serviceclient.model.ClientType;
import com.nttdata.serviceclient.model.clienttype.EnterpriseAccount;
import com.nttdata.serviceclient.model.clienttype.LegalRepreAccount;
import com.nttdata.serviceclient.model.clienttype.PersonalAccount;
import com.nttdata.serviceclient.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "save",method = RequestMethod.POST)     // or user @GetMapping
    public Client save(@RequestBody ClientDTO clientDTO){ // postman --> body(json)
        log.info("Save person in db",clientDTO);

        if(clientDTO.getClienttype()== ClientType.EnterpriseAccount){
            EnterpriseAccount enterpriseAccount= new EnterpriseAccount(
                    clientDTO.getDni(),
                    clientDTO.getFirstname(),
                    clientDTO.getLastname(),
                    clientDTO.getRuc(),
                    clientDTO.getDescription()                    );

            return clientService.saveClient(enterpriseAccount);
        } else if (clientDTO.getClienttype()== ClientType.PersonalAccount) {
            PersonalAccount personalAccount= new PersonalAccount(
                    clientDTO.getDni(),
                    clientDTO.getFirstname(),
                    clientDTO.getLastname());

            return clientService.saveClient(personalAccount);
        } else if (clientDTO.getClienttype()== ClientType.LegalRepreAccount) {
            LegalRepreAccount legalRepreAccount= new LegalRepreAccount(
                    clientDTO.getDni(),
                    clientDTO.getFirstname(),
                    clientDTO.getLastname(),
                    clientDTO.getRuc(),
                    clientDTO.getDescription(),
                    clientDTO.getFirma());

            return clientService.saveClient(legalRepreAccount);
        }
        //return clientService.saveClient(clientDTO);
        return null;
    }
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public java.util.List<Client> listclient(){
        log.info("list for all client");
        return clientService.findAll();
    }

    @DeleteMapping(value = "/delete/{id}")
    @ResponseStatus(code = HttpStatus.OK, reason = "Delete")
    public void deleteClient(@PathVariable String id){
        log.info("delete client");
        clientService.deleteClientById(id);
    }
    @PutMapping(value = "/update/{id}")
    public void updaClientById(@PathVariable String id, @RequestBody Client client){
        log.info("update client sussefull");
        clientService.updateClient(client);
    }
}

