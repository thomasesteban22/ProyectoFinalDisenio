package vista;

import javax.swing.*;

public class UIMovimientos extends JFrame{
    public JTextField numeroDeCuenta;
    public JButton buscar;
    public JTextField id;
    public JTextField cantidad;
    public JButton depositar;
    public JButton retirar;
    public JTextField saldo;
    public JPanel vistaMovimientos;

    public UIMovimientos(){
        setContentPane(vistaMovimientos);
        setTitle("Vista Movimientos");
        setSize(450, 450);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
