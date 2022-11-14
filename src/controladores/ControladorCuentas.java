package controladores;
import dao.CuentasDAO;
import data.CuentaAhorros;
import data.CuentaCorriente;
import data.CuentaVivienda;
import vista.UICuentas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCuentas implements ActionListener{
    private UICuentas vista;
    private CuentasDAO modelo;

    public ControladorCuentas(UICuentas vista){
        this.vista = vista;
        this.modelo = new CuentasDAO();
        this.vista.adicionarCuentaAhorros.addActionListener(this);
        this.vista.adicionarCuentaCorriente.addActionListener(this);
        this.vista.adicionarCuentaVivienda.addActionListener(this);
        this.vista.buscarUsuario.addActionListener(this);
        modelo.CuentasDAO();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vista.adicionarCuentaAhorros)){
            CuentaAhorros cuentaAhorros =new CuentaAhorros();
        }
        if(e.getSource().equals(vista.adicionarCuentaCorriente)){
            CuentaCorriente cuentaCorriente =new CuentaCorriente();
        }
        if(e.getSource().equals(vista.adicionarCuentaVivienda)){
            CuentaVivienda cuentaVivienda =new CuentaVivienda();
        }
        if(e.getSource().equals(vista.buscarCuenta)){
            String numeroDeCuenta = vista.numeroDeCuenta.getText();
            vista.numeroDeCuenta.setText(modelo.buscar(numeroDeCuenta).getNumeroDeCuenta());
        }
    }
}
