package data;

import java.time.LocalDate;

public class CuentaAhorros extends Cuenta{
    private long interesAcomulado;

    public CuentaAhorros(int numeroDeCuenta, LocalDate fechaDeApertura, Persona datosPersona, long dato, long interesAcomulado) {
        super(numeroDeCuenta, fechaDeApertura, datosPersona, dato);
        this.interesAcomulado = interesAcomulado;
    }
}
