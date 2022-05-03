package Continut;
import java.util.*;


public class Transport {
    private static int nrTransport = 0;
    private Integer idTransport;
    private String tipTransport;
    private Integer idFirmaLivarare;
    private String userClient;
    private Float cantitate = 0.0F;
    private List<Mentiuni> mentiuni = new ArrayList<>();
    private List<Colete> colete = new ArrayList<>();


    public Transport(Integer idTransport, String tipTransport, String userClient, Integer idFirmaLivarare, Float cantitate) {
        nrTransport++;
        this.idTransport = nrTransport;
        this.tipTransport = tipTransport;
        this.idFirmaLivarare = idFirmaLivarare;
        this.userClient  = userClient;
        this.cantitate = cantitate;
    }

    public Transport() {
        nrTransport++;
        this.idTransport = nrTransport;
    }

    public static int getNrTransport() {
        return nrTransport;
    }

    public static void setNrTransport(int nrTransport) {
        Transport.nrTransport = nrTransport;
    }

    public Integer getIdTransport() {
        return idTransport;
    }

    public void setIdTransport(Integer idTransport) {
        this.idTransport = idTransport;
    }

    public String getTipTransport() {
        return tipTransport;
    }

    public void setTipTransport(String tipTransport) {
        this.tipTransport = tipTransport;
    }

    public Integer getIdFirmaLivarare() {
        return idFirmaLivarare;
    }

    public void setIdFirmaLivarare(Integer idFirmaLivarare) {
        this.idFirmaLivarare = idFirmaLivarare;
    }

    public String getUserClient() {
        return userClient;
    }

    public void setUserClient(String userClient) {
        this.userClient = userClient;
    }

    public Float getCantitate() {
        return cantitate;
    }

    public void setCantitate(Float cantitate) {
        this.cantitate = cantitate;
    }

    public List<Mentiuni> getMentiuni() {
        return mentiuni;
    }

    public void setMentiuni(List<Mentiuni> mentiuni) {
        this.mentiuni = mentiuni;
    }

    public List<Colete> getColete() {
        return colete;
    }

    public void setColete(List<Colete> colete) {
        this.colete = colete;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "idTransport=" + idTransport +
                ", tipTransport='" + tipTransport + '\'' +
                ", idFirmaLivarare=" + idFirmaLivarare +
                ", userClient='" + userClient + '\'' +
                ", cantitate=" + cantitate +
                ", mentiuni=" + mentiuni +
                ", colete=" + colete +
                '}';
    }
}
