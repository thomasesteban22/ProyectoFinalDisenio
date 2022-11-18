package vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class UIInformes extends JFrame {


    public JTable table1;
    private JPanel vistaInforme;

    public UIInformes(){
        setContentPane(vistaInforme);
        setTitle("Vista persona");
        setSize(450, 450);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        createTable();

    }

    public JPanel getVistaInforme() {
        return vistaInforme;
    }

    public void createTable(){
        table1.setModel(new DefaultTableModel(new Object [][] {
                {null, null,null,null,null,null},
                {null, null,null,null,null,null},
                {null, null,null,null,null,null},
                {null, null,null,null,null,null},
                {null, null,null,null,null,null},
                {null, null,null,null,null,null},
                {null, null,null,null,null,null},
                {null, null,null,null,null,null}
        },
                new String [] {
                        "Numero de cuenta", "fecha","id","nombre","apellido","correo"
                }
        ));
    }
}
