package Client;

import Transport.Persoana;

public class Client extends Persoana {
    private Integer userClient;
    private String adresa;

    public Client() {
    }

    public Client(String nume, String prenume, String nrTelefon, Integer userClient, String adresa) {
        super(nume, prenume, nrTelefon);
        this.userClient = userClient;
        this.adresa = adresa;
    }

    public Client(Client client) {
        super(client);
        this.userClient = client.userClient;
        this.adresa = client.adresa;
    }
}
