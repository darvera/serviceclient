package com.nttdata.serviceclient.model.clienttype;

import com.nttdata.serviceclient.model.Client;
import com.nttdata.serviceclient.model.ClientType;
import com.nttdata.serviceclient.model.EstrategyForClientType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
//@ToString(exclude = {"atCreate"})
//@Document(collection = "enterprise_account") // <<--- el padre lle
public class EnterpriseAccount extends Client implements EstrategyForClientType {
//    public class EnterpriseAccount extends Client{ error for relationship

    String ruc;
    String description;
    public EnterpriseAccount(){}
    public EnterpriseAccount(String dni,
                             String firstname,
                             String lastname,
                             String ruc,
                             String description){
        this.dni=dni;
        this.firstName=firstname;
        this.lastName=lastname;
        this.ruc=ruc;
        this.description=description;
        this.setClientType(getType());
    }

    @Override
    public ClientType getType() {
        return ClientType.EnterpriseAccount;
    }

}
