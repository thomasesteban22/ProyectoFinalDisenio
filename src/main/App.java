package main;
import controladores.ControladorCuentas;
import controladores.ControladorMovimientos;
import controladores.ControladorPersona;
import controladores.ControladorPrincipal;
import dao.PersonasDAO;
import vista.UICuentas;
import vista.UIMovimientos;
import vista.UIPersona;
import vista.UIPrincipal;

import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal(new UIPrincipal());
    }
}
