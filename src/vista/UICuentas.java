package vista;

import javax.swing.*;

public class UICuentas extends JFrame{
    private JPanel vistaCuenta;
    public JButton adicionarCuentaAhorros;
    public JButton adicionarCuentaCorriente;
    public JButton adicionarCuentaVivienda;
    public JTextField numeroDeCuenta;
    public JTextField fechaDeApertura;
    public JTextField id;
    public JTextField nombre;
    public JTextField apellido;
    public JTextField correo;
    public JButton buscarUsuario;
    public JButton buscarCuenta;

    public UICuentas(){
        setContentPane(vistaCuenta);
        setTitle("Vista persona");
        setSize(450, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
