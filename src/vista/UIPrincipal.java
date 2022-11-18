package vista;

import javax.swing.*;

public class UIPrincipal extends JFrame{
    public JButton crearUsuario;
    public JButton informe;
    public JButton crearCuenta;
    public JButton depositosYRetiros;
    private JPanel vistaPrincipal;

    public UIPrincipal(){
        setContentPane(vistaPrincipal);
        setTitle("Vista persona");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
