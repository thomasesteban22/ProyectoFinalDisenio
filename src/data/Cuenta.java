package data;

import java.time.LocalDate;

public class Cuenta {
    protected int numeroDeCuenta;
    protected LocalDate fechaDeApertura;
    protected Persona datosPersona;
    protected long saldo;

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public LocalDate getFechaDeApertura() {
        return fechaDeApertura;
    }

    public Persona getDatosPersona() {
        return datosPersona;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void setFechaDeApertura(LocalDate fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
    }

    public void setDatosPersona(Persona datosPersona) {
        this.datosPersona = datosPersona;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
}
