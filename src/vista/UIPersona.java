package vista;

import javax.swing.*;

public class UIPersona extends JFrame {
    public JButton adicionar;
    public JButton buscar;
    public JTextField id;
    public JTextField nombre;
    public JTextField apellido;
    public JTextField correo;
    private JPanel vistaPersona;

    public UIPersona(){
        setContentPane(vistaPersona);
        setTitle("Vista persona");
        setSize(450, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
