package dao;
import data.*;

import java.util.ArrayList;
import java.util.List;

public class cuentasDAO {
    private List<Cuenta> listaCuentas;
    public cuentasDAO(){ listaCuentas = new ArrayList<>();}

    public boolean adicionar (Cuenta cuenta) {
        return listaCuentas.add(cuenta);}
    public boolean borrar (Cuenta cuenta){
        return listaCuentas.remove(cuenta);}

    public Cuenta buscar(int numeroDeCuenta){

    };

}
