package dao;
import data.*;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CuentasDAO {
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private String filePath = "persona.dat";
    private List<Cuenta> listaCuentas;

    public ObjectInputStream getEntrada() {
        return entrada;
    }

    public CuentasDAO setEntrada(ObjectInputStream entrada) {
        this.entrada = entrada;
        return this;
    }

    public ObjectOutputStream getSalida() {
        return salida;
    }

    public CuentasDAO setSalida(ObjectOutputStream salida) {
        this.salida = salida;
        return this;
    }

    public String getFilePath() {
        return filePath;
    }

    public CuentasDAO setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    public List<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public CuentasDAO setListaCuentas(List<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
        return this;
    }

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
        int idRand = (int) (Math.random() * (999 - 99) + 99);
        return idRand;
    }


    public void adicionar(Cuenta cuenta) {
        listaCuentas.add(cuenta);
        guardar();
    }

    public Cuenta buscar(int numeroDeCuenta) {
        for (Cuenta cuenta : listaCuentas) {
            if (cuenta.getNumeroDeCuenta() == numeroDeCuenta) {
                return cuenta;
            }
        }
        return null;
    }
    public List<Cuenta> todos(){
        return listaCuentas;
    }
}
