package data;

import java.time.LocalDate;

public class Cuenta {
    protected int numeroDeCuenta;
    protected LocalDate fechaDeApertura;
    protected Persona datosPersona;
    protected long dato;

    public Cuenta(int numeroDeCuenta, LocalDate fechaDeApertura, Persona datosPersona, long dato) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.fechaDeApertura = fechaDeApertura;
        this.datosPersona = datosPersona;
        this.dato = dato;
    }
}
