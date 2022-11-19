package vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;

public class UIInformes extends JFrame {


    public JTable tablaTodos;
    public JPanel vistaInforme;
    public JButton imprimirInforme;

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
        tablaTodos.setModel(new DefaultTableModel(new Object [][] {
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
        ){
            boolean[] canEdit = new boolean [] {
                    false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }
}
