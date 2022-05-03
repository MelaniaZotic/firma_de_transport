package Transport;

import Transport.Masina;
import Transport.Persoana;

public class Sofer extends Persoana {
    private Integer idSofer = 0;
    private Masina masina;

    public Sofer() {
    }

    public Sofer(String nume, String prenume, String nrTelefon, Integer idSofer, Masina masina) {
        super(nume, prenume, nrTelefon);
        this.idSofer = idSofer;
        this.masina = masina;
    }

    public Sofer(Sofer sofer){
        super(sofer);
        this.idSofer = sofer.idSofer;;
        this.masina = sofer.masina;
    }

    public Integer getIdSofer() {
        return idSofer;
    }

    public void setIdSofer(Integer idSofer) {
        this.idSofer = idSofer;
    }

    public Masina getMasina() {
        return masina;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

}
