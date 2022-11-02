package data;

import java.time.LocalDate;

public class CuentaVivienda extends Cuenta {
    private long precioVivienda;
    private boolean vis;

    public CuentaVivienda(int numeroDeCuenta, LocalDate fechaDeApertura, Persona datosPersona, long dato, long precioVivienda, boolean vis) {
        super(numeroDeCuenta, fechaDeApertura, datosPersona, dato);
        this.precioVivienda = precioVivienda;
        this.vis = vis;
    }
}
