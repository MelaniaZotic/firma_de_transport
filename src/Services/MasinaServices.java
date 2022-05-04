package Services;

import Repository.MasinaRepository;
import Transport.Masina;
import exceptions.InvalidDataException;

import java.util.Vector;

public class MasinaServices {
    MasinaRepository masinaRepository = new MasinaRepository();

    public Vector<Masina> getAllMasini(){
        Vector<Masina> masini = new Vector<>();
        for( int i = 0;i<masinaRepository.getSize();i++)
            masini.add(masinaRepository.get(i));
        return masini;
    }

    public void addNewMasina(Masina masina) throws InvalidDataException{
        if(masina == null)
            throw new InvalidDataException("Masina nu exista");

        Masina newMasina = new Masina(masina);
        masinaRepository.add(newMasina);
    }
    public void addNewMasina(String nrInmatriculare, String marca, String culoare ) throws InvalidDataException{
        if(nrInmatriculare == null || nrInmatriculare.equals(""))
            throw new InvalidDataException("nrInmatriculare invalid");
        if(marca == null || marca.equals("")) throw new InvalidDataException("marca invalida");

        if(culoare == null || marca.equals("")) throw new InvalidDataException("Culoare invalida");


        Masina newMasina = new Masina(nrInmatriculare,marca,culoare);
        masinaRepository.add(newMasina);
    }

}
