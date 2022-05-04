package view;

import Services.FirmaServices;
import Transport.Masina;
import Transport.Sofer;
import exceptions.InvalidDataException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    private Scanner s = new Scanner(System.in);
    private FirmaServices firmaServices = new FirmaServices();

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
        System.out.println("1. add FIRMA");
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
                readFirma();
                //audit("added new firma");
                break;
            case 2:
                System.exit(0);
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

}

