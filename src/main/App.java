package main;
import controladores.ControladorCuentas;
import controladores.ControladorMovimientos;
import controladores.ControladorPersona;
import controladores.ControladorPrincipal;

import vista.UIPrincipal;

import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal(new UIPrincipal());
    }
}
