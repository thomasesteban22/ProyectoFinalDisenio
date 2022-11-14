package main;
import controladores.ControladorPersona;
import vista.UIPersona;




public class App {
    public static void main(String[] args){
        ControladorPersona controladorPersona = new ControladorPersona(new UIPersona());
    }
}
