package data;

import java.io.Serializable;
import java.time.LocalDate;

public class Cuenta implements Serializable {
    protected String numeroDeCuenta;

    protected LocalDate fechaDeApertura;
    protected Persona datosPersona;
    protected long saldo;

    public String getNumeroDeCuenta() {
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

    public void setNumeroDeCuenta(String numeroDeCuenta) {
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
