package Client_Details.deo;

import java.util.HashMap;

public class ClientDeoImpL {

    HashMap<String, Client> clientMap=new HashMap<>();

    public void addClientDetails(String passport,Client client)
    {
        clientMap.put(passport,client);

    }
    public HashMap<String, Client> getAllClientDetails()
    {
        return clientMap;
    }


}
