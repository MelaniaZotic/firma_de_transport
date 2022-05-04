package Services;

import Continut.Colete;
import Repository.ColeteRepository;
import exceptions.InvalidDataException;

import java.util.Vector;

public class ColeteServices {
    private ColeteRepository coleteRepository = new ColeteRepository();

    public Vector<Colete>getAllColete(){
        Vector<Colete> colete = new Vector<>();
        for(int i = 0; i < coleteRepository.getSize(); i++)
            colete.add(coleteRepository.get(i));
        return colete;
    }
    public void addNewColete(Colete colete) throws InvalidDataException{
        if(colete == null)
            throw new InvalidDataException("Coletul nu exista");

        Colete newColet = new Colete(colete);
        coleteRepository.add(newColet);
    }

    public void addNewColete(String tipColet, Float cantitateColet) throws InvalidDataException{
        if(tipColet == null || tipColet.equals(""))
            throw  new InvalidDataException("tipColet invalid");

        if(cantitateColet <0 ) throw new InvalidDataException("Cantitate invalida!");
        Colete newColet = new Colete(tipColet,cantitateColet);
        coleteRepository.add(newColet);
    }
}
