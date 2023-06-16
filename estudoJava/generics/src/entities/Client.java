package entities;

public class Client {
    private String name;
    private String email;

    public Client() {
    }

    public Client(String name, String email) {
        setName(name);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String value) {
        name = value;
    }

    public void setEmail(String value) {
        email = value;
    }

    @Override
    public int hashCode() {

        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Client other = (Client) obj;
        return email.equals(other.email);
    }

}
