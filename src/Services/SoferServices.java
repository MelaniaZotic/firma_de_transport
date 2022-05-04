package Services;

import Repository.SoferRepository;
import Transport.Masina;
import Transport.Sofer;
import exceptions.InvalidDataException;

import java.util.Vector;

public class SoferServices {
    private SoferRepository soferRepository = new SoferRepository();

    public Vector<Sofer> getAllSoferi(){
        Vector<Sofer> soferi = new Vector<>();
        for(int i = 0; i < soferRepository.getSize(); i++)
            soferi.add(soferRepository.get(i));
        return soferi;
    }

    public void addNewSoferi(Sofer sofer) throws InvalidDataException{
        if(sofer == null)
            throw new InvalidDataException("Soferul nu exista");

        Sofer newSofer = new Sofer(sofer);
        soferRepository.add(newSofer);

    }

    public void addNewSoferi(String nume, String prenume, String nrTelefon, Integer idSofer, Masina masina)throws InvalidDataException{
        if(idSofer == null) throw new InvalidDataException("id invalid");
        Sofer newSofer = new Sofer(nume,prenume,nrTelefon,idSofer,masina);
        soferRepository.add(newSofer);
    }
}
