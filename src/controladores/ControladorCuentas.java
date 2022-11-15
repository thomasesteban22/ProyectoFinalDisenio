package controladores;
import dao.CuentasDAO;
import dao.PersonasDAO;
import data.CuentaAhorros;
import data.CuentaCorriente;
import data.CuentaVivienda;
import vista.UICuentas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class ControladorCuentas implements ActionListener{
    private UICuentas vista;
    private CuentasDAO modelo;
    private PersonasDAO modelo2;

    public ControladorCuentas(UICuentas vista){
        this.vista = vista;
        this.modelo = new CuentasDAO();
        this.modelo2 =new PersonasDAO();
        this.vista.adicionarCuentaAhorros.addActionListener(this);
        this.vista.adicionarCuentaCorriente.addActionListener(this);
        this.vista.adicionarCuentaVivienda.addActionListener(this);
        this.vista.buscarUsuario.addActionListener(this);
        modelo.CuentasDAO();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vista.adicionarCuentaAhorros)){
            CuentaAhorros cuentaAhorros = new CuentaAhorros();
            String numeroDeCuenta = vista.numeroDeCuenta.getText();
            LocalDate fechaDeApertura = LocalDate.parse(vista.fechaDeApertura.getText());
            int id = Integer.valueOf(vista.id.getText());
            String nombre = vista.nombre.getText();
            String apellido = vista.apellido.getText();
            String correo = vista.correo.getText();
            cuentaAhorros.setNumeroDeCuenta(numeroDeCuenta);
            cuentaAhorros.setFechaDeApertura(fechaDeApertura);

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
            vista.fechaDeApertura.setText(String.valueOf(modelo.buscar(numeroDeCuenta).getFechaDeApertura()));
            vista.id.setText(String.valueOf(modelo.buscar(numeroDeCuenta).getDatosPersona().getId()));
            vista.nombre.setText(modelo.buscar(numeroDeCuenta).getDatosPersona().getNombre());
            vista.apellido.setText(modelo.buscar(numeroDeCuenta).getDatosPersona().getApellido());
            vista.correo.setText(modelo.buscar(numeroDeCuenta).getDatosPersona().getApellido());
        }
        if(e.getSource().equals(vista.buscarUsuario)){
            int id = Integer.valueOf(vista.id.getText());
            vista.nombre.setText(modelo2.buscar(id).getNombre());
            vista.apellido.setText(modelo2.buscar(id).getApellido());
            vista.correo.setText(modelo2.buscar(id).getCorreo());
        }
    }
}
