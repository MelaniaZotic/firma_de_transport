package Services;

import Repository.FirmaRepository;

import java.sql.SQLOutput;

public class Service {

    private FirmaRepository firmaRepository = new FirmaRepository();
    public Service(){

    }
    private void inMeniu(){
        System.out.println(".................ZOTIC MELANIA..................");
        System.out.println("................................................");
        System.out.println();
        System.out.println("1. Adaugare curier in cadrul companiei de livrari.");
    }

}
