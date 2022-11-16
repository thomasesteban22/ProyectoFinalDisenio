package controladores;
import dao.CuentasDAO;
import dao.PersonasDAO;
import data.CuentaAhorros;
import data.CuentaCorriente;
import data.CuentaVivienda;
import vista.UICuentas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class ControladorCuentas implements ActionListener{
    private UICuentas vista;
    private CuentasDAO modelo;
    private PersonasDAO modelo2;


    public ControladorCuentas(UICuentas vista) throws IOException {
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

        /* ADICIONAR CUENTA DE AHORROS*/

        if(e.getSource().equals(vista.adicionarCuentaAhorros)){
            CuentaAhorros cuentaAhorros = new CuentaAhorros();
            int idRand = modelo.crearId();
            LocalDate fechaDeApertura = LocalDate.now();
            System.out.println(idRand);

            int id = Integer.valueOf(vista.id.getText());

            cuentaAhorros.setNumeroDeCuenta(idRand);
            cuentaAhorros.setFechaDeApertura(fechaDeApertura);
            cuentaAhorros.setTipo('A');
            cuentaAhorros.setDatosPersona(modelo2.buscar(id));
            cuentaAhorros.setSaldo(0);
            cuentaAhorros.setInteresAcomulado(30);
            modelo.adicionar(cuentaAhorros);

            vista.numeroDeCuenta.setText(String.valueOf(modelo.crearId()));
            vista.fechaDeApertura.setText(String.valueOf(fechaDeApertura));
            System.out.println(modelo.getListaCuentas());

        }

        /* ADICIONAR CUENTA CORRIENTE*/

        if(e.getSource().equals(vista.adicionarCuentaCorriente)){
            CuentaCorriente cuentaCorriente =new CuentaCorriente();
            int idRand = modelo.crearId();
            LocalDate fechaHoy = LocalDate.now();
            System.out.println(idRand);

            int id = Integer.valueOf(vista.id.getText());

            cuentaCorriente.setNumeroDeCuenta(idRand);
            cuentaCorriente.setFechaDeApertura(fechaHoy);
            cuentaCorriente.setTipo('C');
            cuentaCorriente.setDatosPersona(modelo2.buscar(id));
            cuentaCorriente.setSaldo(0);
            cuentaCorriente.setValorUltimoMovimiento(0);
            cuentaCorriente.setFechaDelUltimoMovimento(fechaHoy);
            cuentaCorriente.setValorTopeSobreGiro(50000000);
            modelo.adicionar(cuentaCorriente);

            vista.numeroDeCuenta.setText(String.valueOf(modelo.crearId()));
            vista.fechaDeApertura.setText(String.valueOf(fechaHoy));
        }

        /* ADICIONAR CUENTA VIVIENDA*/

        if(e.getSource().equals(vista.adicionarCuentaVivienda)){
            CuentaVivienda cuentaVivienda =new CuentaVivienda();
            int idRand = modelo.crearId();
            LocalDate fechaHoy = LocalDate.now();
            System.out.println(idRand);

            int id = Integer.valueOf(vista.id.getText());

            cuentaVivienda.setNumeroDeCuenta(idRand);
            cuentaVivienda.setFechaDeApertura(fechaHoy);
            cuentaVivienda.setTipo('V');
            cuentaVivienda.setDatosPersona(modelo2.buscar(id));
            cuentaVivienda.setSaldo(0);
            cuentaVivienda.setPrecioVivienda(500000000);
            cuentaVivienda.setVis(true);
            modelo.adicionar(cuentaVivienda);

            vista.numeroDeCuenta.setText(String.valueOf(modelo.crearId()));
            vista.fechaDeApertura.setText(String.valueOf(fechaHoy));

        }
        if(e.getSource().equals(vista.buscarCuenta)){
            int numeroDeCuenta = Integer.parseInt(vista.numeroDeCuenta.getText());
            vista.numeroDeCuenta.setText(String.valueOf(modelo.buscar(numeroDeCuenta).getNumeroDeCuenta()));
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
