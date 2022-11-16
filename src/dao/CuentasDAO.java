package dao;
import data.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CuentasDAO {
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private String filePath = "persona.dat";
    private List<Cuenta> listaCuentas;

    public void CuentasDAO() throws IOException {
        listaCuentas = new ArrayList<>();
        File file = new File(filePath);
        if (file.isFile()) {
            try {
                this.entrada = new ObjectInputStream(new FileInputStream("cuentas.dat"));
                this.listaCuentas = (List<Cuenta>) entrada.readObject();
                this.entrada.close();
            } catch (Exception e) {
                guardar();
            }
        }

    }
    public void guardar(){
        try {
            this.salida = new ObjectOutputStream(new FileOutputStream("cuentas.dat"));
            this.salida.writeObject(listaCuentas);
            this.salida.close();
        }catch(Exception e){
            System.out.printf("Error al guardar");
        }
    }
    public int crearId() {
        for (Cuenta cuenta : listaCuentas) {
            int idRand = (int) (Math.random() * (999 - 99) + 99);
            System.out.println("en el for");
            while (cuenta.getNumeroDeCuenta() != idRand) {
                System.out.println(idRand);
                return idRand;
            }
        }return 0;
    }


    public boolean adicionar(Cuenta cuenta) {
        return listaCuentas.add(cuenta);
    }

    public Cuenta buscar(int numeroDeCuenta) {
        for (Cuenta cuenta : listaCuentas) {
            if (cuenta.getNumeroDeCuenta() == numeroDeCuenta) {
                return cuenta;
            }
        }
        return null;
    }
}
