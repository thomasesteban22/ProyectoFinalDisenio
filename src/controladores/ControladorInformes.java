package controladores;

import dao.CuentasDAO;
import data.Cuenta;
import data.Persona;
import vista.UIInformes;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

public class ControladorInformes implements ActionListener {

    private UIInformes vista;
    private CuentasDAO modelo;
    private DefaultTableModel modeloT;

    public ControladorInformes (UIInformes vista) throws IOException {
        this.vista = vista;
        this.modelo = new CuentasDAO();
        this.vista.imprimirInforme.addActionListener(this);
        this.modeloT = (DefaultTableModel) vista.tablaTodos.getModel();
        modelo.CuentasDAO();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vista.imprimirInforme)){
            List<Cuenta> listaCuentas = modelo.todos();

            int filas = modeloT.getRowCount();

            for (int i = 0; i < filas; i++) {
                modeloT.removeRow(0);
            }


            for (Cuenta cuenta : listaCuentas) {
                Object[] fila= {cuenta.getNumeroDeCuenta(),cuenta.getFechaDeApertura(),cuenta.getDatosPersona().getId(),cuenta.getDatosPersona().getNombre(),cuenta.getDatosPersona().getApellido(),cuenta.getDatosPersona().getCorreo()};
                modeloT.addRow(fila);
            }

        }
    }
}
