package Client_Details.deo;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class clientmain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ClientDeoImpL clientDeo=new ClientDeoImpL();
        do{
            System.out.println("Press 1. Add Client 2. List of Clients 3. Search Client 4. Exist");
            System.out.println("Enter your choice");

            int choice= Integer.parseInt(reader.readLine());

            switch(choice)
            {
                case 1:
                    System.out.println("Enter the client details");
                    Client client=new Client();
                    System.out.println("Enter the name");
                    client.setClientName(reader.readLine());

                    System.out.println("Enter the email");
                    client.setEmail(reader.readLine());

                    System.out.println("Enter the passportNo");
                    client.setPassportNo(reader.readLine());

                    clientDeo.addClientDetails(client.getPassportNo(),client);

                    System.out.println("Data is successfully Insert");
                    break;

                case 2:
                    System.out.println("Display all details");
                    Map<String, Client> clientDetails=clientDeo.getAllClientDetails();
                    for(Map.Entry<String,Client> map:  clientDetails.entrySet())
                {
                    System.out.println("Key Passport" +map.getKey());
                    Client cli=map.getValue();
                    System.out.println(cli.getClientName()+"..."+cli.getEmail()+"..."+cli.getPassportNo());

                }
                    break;

                case 3:
                    System.out.println("Enter the passport No of the client to be searched");
                    String searchKey=reader.readLine();
                    Map<String, Client> clientmap=clientDeo.getAllClientDetails();
                    for(Map.Entry<String,Client> map:  clientmap.entrySet())
                    {
                        if(searchKey.equals(map.getKey())) {
                            Client cli = map.getValue();
                            System.out.println(cli.getClientName() + "..." + cli.getEmail() + "..." + cli.getPassportNo());
                        }
                    }

                    if(!clientmap.containsKey(searchKey))
                    {
                        System.out.println("No value found");
                    }
                    break;

                default:
                    System.exit(0);
                    break;


            }

        }while(true);
    }
}
