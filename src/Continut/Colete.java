package Continut;

public class Colete {
    private String tipColet;
    private Float cantitateColet;

    public Colete() {
    }

    public Colete(String tipColet, Float cantitateColet) {
        this.tipColet = tipColet;
        this.cantitateColet = cantitateColet;
    }
    public Colete(Colete c){
        this.tipColet = c.tipColet;
        this.cantitateColet = c.cantitateColet;
    }

    public String getTipColet() {
        return tipColet;
    }

    public void setTipColet(String tipColet) {
        this.tipColet = tipColet;
    }

    public Float getCantitateColet() {
        return cantitateColet;
    }

    public void setCantitateColet(Float cantitateColet) {
        this.cantitateColet = cantitateColet;
    }

    @Override
    public String toString() {
        return "Colete{" +
                "tipColet='" + tipColet + '\'' +
                ", cantitateColet=" + cantitateColet +
                '}';
    }
}
