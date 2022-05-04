package Transport;

import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class FirmaTransport {
    private static Integer countFirmaTransport = 0;
    private String denumire;
    private String tipTransport;
    private Integer idSofer;
    private SortedSet<Sofer> soferi = new TreeSet<>();
    public FirmaTransport(){
        countFirmaTransport++;
        idSofer =countFirmaTransport;
    }

    public FirmaTransport(String denumire, String tipTransport) {
        this.denumire = denumire;
        this.tipTransport = tipTransport;
        countFirmaTransport++;
        idSofer =countFirmaTransport;
    }

    public FirmaTransport(FirmaTransport firmaTransport) {
        if(firmaTransport!=null){
            this.denumire = firmaTransport.denumire;
            this.tipTransport = firmaTransport.tipTransport;
            this.idSofer = firmaTransport.idSofer;
            this.soferi = firmaTransport.soferi;
        }
    }

    public String getDenumire() {
        return denumire;
    }

    public String getTipTransport() {
        return tipTransport;
    }

    public Integer getIdSofer() {
        return idSofer;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setTipTransport(String tipTransport) {
        this.tipTransport = tipTransport;
    }

    public void addSofer(Sofer s) {

    }

    public SortedSet<Sofer> getSoferi() {
        return soferi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FirmaTransport that = (FirmaTransport) o;
        return Objects.equals(denumire, that.denumire) &&
                Objects.equals(tipTransport, that.tipTransport) &&
                Objects.equals(idSofer, that.idSofer) && Objects.equals(soferi, that.soferi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denumire, tipTransport, idSofer, soferi);
    }
}
