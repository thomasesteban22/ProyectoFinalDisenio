package main;
import controladores.ControladorPersona;
import dao.PersonasDAO;
import vista.UIPersona;

import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {
        ControladorPersona controladorPersona = new ControladorPersona(new UIPersona());
    }
}
