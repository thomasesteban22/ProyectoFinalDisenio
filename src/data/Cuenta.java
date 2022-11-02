package data;

import java.time.LocalDate;

public class Cuenta {
    protected int numeroDeCuenta;
    protected LocalDate fechaDeApertura;
    protected Persona datosPersona;
    protected long saldo;

    public Cuenta(int numeroDeCuenta, LocalDate fechaDeApertura, Persona datosPersona, long saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.fechaDeApertura = fechaDeApertura;
        this.datosPersona = datosPersona;
        this.saldo = saldo;
    }
}
