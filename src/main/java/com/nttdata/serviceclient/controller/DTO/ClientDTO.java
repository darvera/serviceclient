package com.nttdata.serviceclient.controller.DTO;

import com.nttdata.serviceclient.model.ClientType;
import com.nttdata.serviceclient.model.clienttype.EnterpriseAccount;
import com.nttdata.serviceclient.model.clienttype.LegalRepreAccount;
import com.nttdata.serviceclient.model.clienttype.PersonalAccount;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO {
    ClientType clienttype;
    /* attibust client*/
    String dni;
    String firstname;
    String lastname;

    String ruc; //EnterpriseAccount
    String description; //EnterpriseAccount

    String firma;//LegalRepreAccount
   /*
    public void saveLegalRepreAccount(String dni,
                                      String firstname,
                                      String lastname,
                                      String ruc,
                                      String description){
        this.dni=dni;
        this.firstname=firstname;
        this.lastname=lastname;
        this.ruc=ruc;
        this.description=description;

    }
    public void savePersonalAccount(String dni,
                                    String firstname,
                                    String lastname){
        this.dni=dni;
        this.firstname=firstname;
        this.lastname=lastname;

    }
*/
}