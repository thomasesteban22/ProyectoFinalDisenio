package controladores;

import dao.CuentasDAO;

import dao.PersonasDAO;
import data.*;
import vista.UICuentas;
import vista.UIMovimientos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ControladorMovimientos implements ActionListener{
    private CuentaAhorros modeloCuentaAhorros;
    private CuentaCorriente modeloCuentaCorriente;
    private CuentaVivienda modeloCuentaVivienda;
    private UIMovimientos vista;
    private CuentasDAO modelo;

    public ControladorMovimientos(UIMovimientos vista) throws IOException {
        this.vista = vista;
        this.modelo = new CuentasDAO();
        this.vista.buscar.addActionListener(this);
        this.vista.depositar.addActionListener(this);
        this.vista.retirar.addActionListener(this);
        this.modeloCuentaAhorros = new CuentaAhorros();
        this.modeloCuentaCorriente = new CuentaCorriente();
        this.modeloCuentaVivienda = new CuentaVivienda();
        modelo.CuentasDAO();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vista.buscar)){
            int numeroDeCuenta = Integer.valueOf(vista.numeroDeCuenta.getText());
            vista.id.setText(String.valueOf(modelo.buscar(numeroDeCuenta).getDatosPersona().getId()));
            vista.saldo.setText(String.valueOf(modelo.buscar(numeroDeCuenta).getSaldo()));
        }
        if(e.getSource().equals(vista.depositar)){
            int cantidad = Integer.valueOf(vista.cantidad.getText());
            int numeroDeCuenta = Integer.valueOf(vista.numeroDeCuenta.getText());
            char tipo = modelo.buscar(numeroDeCuenta).getTipo();
            for (Cuenta cuenta: modelo.getListaCuentas()) {
                switch (tipo){
                    case 'A':
                        if (cuenta.getNumeroDeCuenta() == numeroDeCuenta){
                            modelo.buscar(numeroDeCuenta).setSaldo(modeloCuentaAhorros.depositar(cantidad));
                            vista.saldo.setText(String.valueOf(modeloCuentaAhorros.getSaldo()));
                            JOptionPane.showInternalMessageDialog(null,"SU DEPOSITO FUE EXITOSO");
                            modelo.guardar();
                        }
                        break;
                    case 'C':
                        if (cuenta.getNumeroDeCuenta() == numeroDeCuenta){
                            modelo.buscar(numeroDeCuenta).setSaldo(modeloCuentaCorriente.depositar(cantidad));
                            vista.saldo.setText(String.valueOf(modeloCuentaCorriente.getSaldo()));
                            JOptionPane.showInternalMessageDialog(null,"SU DEPOSITO FUE EXITOSO");
                            modelo.guardar();
                        }
                        break;
                    case 'V':
                        if (cuenta.getNumeroDeCuenta() == numeroDeCuenta){
                            modelo.buscar(numeroDeCuenta).setSaldo(modeloCuentaVivienda.depositar(cantidad));
                            vista.saldo.setText(String.valueOf(modeloCuentaVivienda.getSaldo()));
                            JOptionPane.showInternalMessageDialog(null,"SU DEPOSITO FUE EXITOSO");
                            modelo.guardar();
                        }
                        break;
                    default:
                        System.out.println("No se econtró cuenta");
                        break;
                }
            }
        }
        if(e.getSource().equals(vista.retirar)) {
            int cantidad = Integer.valueOf(vista.cantidad.getText());
            int numeroDeCuenta = Integer.valueOf(vista.numeroDeCuenta.getText());
            char tipo = modelo.buscar(numeroDeCuenta).getTipo();
            for (Cuenta cuenta: modelo.getListaCuentas()) {
                switch (tipo){
                    case 'A':
                        if (cuenta.getNumeroDeCuenta() == numeroDeCuenta){
                            modelo.buscar(numeroDeCuenta).setSaldo(modeloCuentaAhorros.retirar(cantidad));
                            vista.saldo.setText(String.valueOf(modeloCuentaAhorros.getSaldo()));
                            modelo.guardar();
                        }
                        break;
                    case 'C':
                        if (cuenta.getNumeroDeCuenta() == numeroDeCuenta){
                            modelo.buscar(numeroDeCuenta).setSaldo(modeloCuentaCorriente.retirar(cantidad));
                            vista.saldo.setText(String.valueOf(modeloCuentaCorriente.getSaldo()));
                            modelo.guardar();
                        }
                        break;
                    default:
                        JOptionPane.showInternalMessageDialog(null,"ESTA CUENTA NO EXISTE");
                        break;
                }
            }
        }

    }
}
