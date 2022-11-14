package dao;
import data.*;

import java.util.ArrayList;
import java.util.List;

public class cuentasDAO {
    private List<Cuenta> listaCuentas;
    public void CuentasDAO(){
        listaCuentas = new ArrayList<>();
    }

    public boolean adicionar (Cuenta cuenta) {
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
