package Client_Details.deo;

public class Client {

    String clientName;
    String email;
    String passportNo;

    public Client(String clientName, String email, String passportNo) {
        this.clientName = clientName;
        this.email = email;
        this.passportNo = passportNo;
    }

    public Client() {

    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }
}
