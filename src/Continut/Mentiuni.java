package Continut;

import java.util.ArrayList;
import java.util.List;

public class Mentiuni {
    private String nume;
    private List<String> comentarii = new ArrayList<>();

    public Mentiuni(String nume, List<String> comentarii) {
        this.nume = nume;
        this.comentarii = comentarii;
    }
    public Mentiuni(Mentiuni mentiuni){
        this.nume = mentiuni.nume;
        this.comentarii = mentiuni.comentarii;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<String> getComentarii() {
        return comentarii;
    }

    public void setComentarii(List<String> comentarii) {
        this.comentarii = comentarii;
    }

    @Override
    public String toString() {
        return "Mentiuni{" +
                "nume='" + nume + '\'' +
                ", comentarii=" + comentarii +
                '}';
    }
}
