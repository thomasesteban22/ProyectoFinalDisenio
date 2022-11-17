package main;
import controladores.ControladorCuentas;
import controladores.ControladorMovimientos;
import controladores.ControladorPersona;
import dao.PersonasDAO;
import vista.UICuentas;
import vista.UIMovimientos;
import vista.UIPersona;

import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {
        //ControladorPersona controladorPersona = new ControladorPersona(new UIPersona());
        //ControladorCuentas controladorCuentas = new ControladorCuentas(new UICuentas());
        ControladorMovimientos controladorMovimientos = new ControladorMovimientos(new UIMovimientos());

    }
}
