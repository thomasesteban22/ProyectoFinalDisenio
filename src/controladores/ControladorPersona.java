package controladores;
import dao.PersonasDAO;
import data.Persona;
import vista.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ControladorPersona implements ActionListener {
    private UIPersona vista;
    private PersonasDAO modelo;




    public ControladorPersona(UIPersona vista) throws IOException {
        this.vista = vista;
        this.modelo = new PersonasDAO();
        this.vista.adicionar.addActionListener(this);
        this.vista.buscar.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vista.adicionar)){
            Persona persona = new Persona();
            int id = Integer.valueOf(vista.id.getText());
            String nombre = vista.nombre.getText();
            String apellido = vista.apellido.getText();
            String correo = vista.correo.getText();
            persona.setId(id);
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setCorreo(correo);
            modelo.adicionar(persona);
            JOptionPane.showInternalMessageDialog(null,"El Usuario a sido creado");
            vista.id.setText("");
            vista.nombre.setText("");
            vista.apellido.setText("");
            vista.correo.setText("");

        }
        if (e.getSource().equals(vista.buscar)){
            int id = Integer.valueOf(vista.id.getText());
            vista.nombre.setText(modelo.buscar(id).getNombre());
            vista.apellido.setText(modelo.buscar(id).getApellido());
            vista.correo.setText(modelo.buscar(id).getCorreo());
        }
    }
}

