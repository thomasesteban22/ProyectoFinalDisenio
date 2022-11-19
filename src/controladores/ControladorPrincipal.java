package controladores;

import dao.PersonasDAO;
import vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ControladorPrincipal implements ActionListener {
    private UIPrincipal vista;

    public ControladorPrincipal(UIPrincipal vista) throws IOException {
        this.vista = vista;
        this.vista.crearCuenta.addActionListener(this);
        this.vista.depositosYRetiros.addActionListener(this);
        this.vista.crearUsuario.addActionListener(this);
        this.vista.informe.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vista.crearCuenta)){
            try {
                ControladorCuentas controladorCuentas = new ControladorCuentas(new UICuentas());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }if(e.getSource().equals(vista.crearUsuario)){
            try {
                ControladorPersona controladorPersona = new ControladorPersona(new UIPersona());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }if(e.getSource().equals(vista.depositosYRetiros)){
            try {
                ControladorMovimientos controladorMovimientos = new ControladorMovimientos(new UIMovimientos());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }if(e.getSource().equals(vista.informe)){
            try {
                ControladorInformes controladorInformes = new ControladorInformes(new UIInformes());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
