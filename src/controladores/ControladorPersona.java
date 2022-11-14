package controladores;
import dao.PersonasDAO;
import vista.*;

public class ControladorPersona {
    private UIPersona vista;
    private PersonasDAO modelo;


    public ControladorPersona(UIPersona vista){
        this.vista = vista;
        this.modelo = new PersonasDAO();

    }

}

