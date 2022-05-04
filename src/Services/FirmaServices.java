package Services;

import Repository.FirmaRepository;
import Repository.SoferRepository;
import Transport.FirmaTransport;
import Transport.Sofer;
import exceptions.InvalidDataException;

import java.util.Vector;

public class FirmaServices {
    private FirmaRepository firmaRepository = new FirmaRepository();
    private SoferRepository soferRepository = new SoferRepository();

    public static void addNewFirma(String denumire, String tipTransport, Sofer sofer) {
    }

    public Vector<FirmaTransport> getAllF(){
        Vector<FirmaTransport> firme = new Vector<>();
        for(int i = 0; i < firmaRepository.getSize(); i++)
            firme.add(firmaRepository.get(i));
        return firme;
    }
    public void addNewFirma(FirmaTransport firmaTransport) throws InvalidDataException{
        if(firmaTransport == null)
            throw new InvalidDataException("Firma nu exista");

        FirmaTransport newFirma = new FirmaTransport(firmaTransport);
        firmaRepository.add(newFirma);

    }

    public void addNewFirma(String denumire, String tipTransport, Integer idSofer, Sofer soferi) throws InvalidDataException{
        if(denumire == null || denumire.equals(""))
            throw new InvalidDataException("Invalid");
    }

}
