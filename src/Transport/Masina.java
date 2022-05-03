package Transport;

public class Masina {
    private String nrInmatriculare;
    private String marca;
    private String culoare;

    //To construct an object with default values.
    public Masina() {
    }

    public Masina(Masina masina) {
        this.nrInmatriculare = masina.nrInmatriculare;
        this.marca = masina.marca;
        this.culoare = masina.culoare;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public String getMarca() {
        return marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public Masina(String nrInmatriculare, String marca, String culoare) {
        this.nrInmatriculare = nrInmatriculare;
        this.marca = marca;
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "nrInmatriculare='" + nrInmatriculare + '\'' +
                ", marca='" + marca + '\'' +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
