package main;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, SQLException, FileNotFoundException {
        Serviciu myService = new Serviciu();
        myService.executeServices();
    }
}
