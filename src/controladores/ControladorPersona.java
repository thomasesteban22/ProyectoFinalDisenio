package controladores;
import dao.PersonasDAO;
import data.Persona;
import vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPersona implements ActionListener {
    private UIPersona vista;
    private PersonasDAO modelo;


    public ControladorPersona(UIPersona vista){
        this.vista = vista;
        this.modelo = new PersonasDAO();
        this.vista.adicionar.addActionListener(this);
        this.vista.buscar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vista.adicionar)){
            Persona persona = new Persona();
            int id = Integer.valueOf(vista.id);
        }
    }
}

