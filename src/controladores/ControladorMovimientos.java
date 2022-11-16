package controladores;

import dao.CuentasDAO;

import dao.PersonasDAO;
import data.CuentaCorriente;
import data.CuentaVivienda;
import vista.UICuentas;
import vista.UIMovimientos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ControladorMovimientos implements ActionListener {
    private UIMovimientos vista;
    private CuentasDAO modelo;

    public ControladorMovimientos(UIMovimientos vista) throws IOException {
        this.vista = vista;
        this.modelo = new CuentasDAO();
        this.vista.buscar.addActionListener(this);
        this.vista.depositar.addActionListener(this);
        this.vista.retirar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vista.buscar)){
            int numeroDeCuenta = Integer.valueOf(vista.numeroDeCuenta.getText());
            vista.id.setText(String.valueOf(modelo.buscar(numeroDeCuenta).getDatosPersona().getId()));
            vista.saldo.setText(String.valueOf(modelo.buscar(numeroDeCuenta).getSaldo()));
        }
        if(e.getSource().equals(vista.depositar)){
            
        }
        if(e.getSource().equals(vista.retirar)) {
        }

    }
}
