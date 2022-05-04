package view;

import Continut.Colete;
import Repository.ColeteRepository;
import Services.ColeteServices;
import Services.FirmaServices;
import Services.MasinaServices;
import Services.SoferServices;
import Transport.Masina;
import Transport.Sofer;
import exceptions.InvalidDataException;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Vector;

public class App {
    private Scanner s = new Scanner(System.in);
    private FirmaServices firmaServices = new FirmaServices();
    private ColeteServices coleteServices = new ColeteServices();
    private SoferServices soferServices  = new SoferServices();
    private MasinaServices masinaServices = new MasinaServices();
    public static void main(String args[]) {

        App app = new App();


        while (true) {
            app.showMenu();
            int option = app.readOption();
            app.execute(option);
        }
    }
    private void showMenu() {
        System.out.println("---------------------");
        System.out.println("What do you want to do?");
        System.out.println("1. Adauga colet");
        System.out.println("2. Adauga sofer");
        System.out.println("3. Adauga masina");
        System.out.println("4. Listare masini");
        System.out.println("11. exit");
        System.out.print("Option:");
    }

    private int readOption() {
        try {
            int option = readInt();
            if (option >= 1 && option <= 12) {
                return option;
            }
        } catch (InvalidDataException invalid) {
            // nothing to do, as it's handled below
        }
        System.out.println("Invalid option. Try again");
        return readOption();
    }

    private int readInt() throws InvalidDataException {
        String line = s.nextLine();
        if (line.matches("^\\d+$")) {
            return Integer.parseInt(line);
        } else {
            throw new InvalidDataException("Invalid number");
        }
    }

    private void execute(int option) {
        switch (option) {
            case 1:
                readColet();
                break;
            case 2:
                readSoferi();
                break;
            case 3:
                readMasina();
                break;
            case 4:
                printAllCars();
                break;
            case 5:
                printAllColete();
                break;
            case 6:
                printAllSoferi();
                break;
            case 7:
                System.exit(0);
        }
    }
    void printAllSoferi(){
        Vector<Sofer> soferi  = soferServices.getAllSoferi();
        if(soferi.size() == 0){
            System.out.println("Nu sunt soferi");
        }
        for(Sofer sofer: soferi){
            System.out.println(sofer);
        }
    }

    void printAllColete(){
        Vector<Colete> colete = coleteServices.getAllColete();
        if(colete.size() == 0){
            System.out.println("Nu sunt colete");
        }
        for(Colete colet:colete){
            System.out.println(colet);
        }
    }

    void printAllCars(){
        Vector<Masina> masini = masinaServices.getAllMasini();
        if(masini.size() == 0) {
            System.out.println("Nu sunt masini");
        }
        for(Masina masina: masini){
            System.out.println(masina);
        }
    }
/*
    void readFirma() {
        try {
            System.out.print("Denumire: ");
            String denumire = s.nextLine();
            System.out.print("Tip transport: ");
            String tipTransport = s.nextLine();

            int cntr;
            cntr = s.nextInt();
            System.out.println("Sofer: ");
            System.out.print("Nume: ");
            String nume = s.nextLine();
            System.out.print("Prenume: ");
            String prenume = s.nextLine();
            System.out.print("nrTelefon: ");
            String nrTelefon = s.nextLine();
            System.out.print("idSofer: ");
            int idSofer = Integer.parseInt(s.nextLine());
            System.out.println("Masina: ");
            System.out.print("Nr inmatriculare: ");
            String nrInmatriculare = s.nextLine();
            System.out.print("Marca: ");
            String marca = s.nextLine();
            System.out.print("Culoare: ");
            String culoare = s.nextLine();

            Masina masina = new Masina(nrInmatriculare, marca, culoare);
            Sofer sofer = new Sofer(nume, prenume, nrTelefon, idSofer, masina);

            FirmaServices.addNewFirma(denumire, tipTransport, sofer);

        } catch (NumberFormatException numberFormatException) {
            System.out.println("Invalid date!");
        }
    }

*/
    void readMasina() {
        try {
            System.out.print("Nr inmatriculare: ");
            String nrInmatriculare = s.nextLine();
            System.out.print("Marca: ");
            String marca = s.nextLine();
            System.out.print("Culoare: ");
            String culoare = s.nextLine();

            masinaServices.addNewMasina(nrInmatriculare, marca, culoare);
        } catch (InvalidDataException invalidData) {
            System.out.println(invalidData.getMessage());

        }
    }
    void readColet(){
        try{
            System.out.print("Tip colet: ");
            String tipColet = s.nextLine();
            System.out.print("cantitateColet: ");
            float cantitateColet = Float.parseFloat(s.nextLine());

            coleteServices.addNewColete(tipColet,cantitateColet);
        } catch (InvalidDataException invalidData) {
            System.out.println(invalidData.getMessage());
        } catch (NumberFormatException numberFormat) {
            System.out.println("Invalid type or quantity!");
        }
    }
    void readSoferi(){
        try{
            System.out.print("Nume: ");
            String nume = s.nextLine();
            System.out.print("Prenume: ");
            String prenume = s.nextLine();
            System.out.print("Nr de telefon: ");
            String nrTelefon = s.nextLine();
            System.out.print("Sofer id: ");
            int idSofer = Integer.parseInt(s.nextLine());
            System.out.println("Masina: ");
            System.out.print("Nr inmatriculare: ");
            String nrInmatriculare = s.nextLine();
            System.out.print("Marca: ");
            String marca = s.nextLine();
            System.out.print("Culoare: ");
            String culoare = s.nextLine();

            Masina masina = new Masina(nrInmatriculare,marca,culoare);

            soferServices.addNewSoferi(nume,prenume,nrTelefon,idSofer, masina);
        } catch (InvalidDataException invalidData) {
        System.out.println(invalidData.getMessage());
        } catch (NumberFormatException numberFormat) {
        System.out.println("Invalid!");
    }
    }
}


