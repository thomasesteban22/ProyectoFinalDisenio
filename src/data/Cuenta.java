package data;

import java.io.Serializable;
import java.time.LocalDate;

public class Cuenta implements Serializable {
    protected char tipo;
    protected int numeroDeCuenta;

    protected LocalDate fechaDeApertura;
    protected Persona datosPersona;
    protected long saldo;

    public char getTipo() {
        return tipo;
    }

    public Cuenta setTipo(char tipo) {
        this.tipo = tipo;
        return this;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public Cuenta setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
        return this;
    }

    public LocalDate getFechaDeApertura() {
        return fechaDeApertura;
    }

    public Cuenta setFechaDeApertura(LocalDate fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
        return this;
    }

    public Persona getDatosPersona() {
        return datosPersona;
    }

    public Cuenta setDatosPersona(Persona datosPersona) {
        this.datosPersona = datosPersona;
        return this;
    }

    public long getSaldo() {
        return saldo;
    }

    public Cuenta setSaldo(long saldo) {
        this.saldo = saldo;
        return this;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "tipo=" + tipo +
                ", numeroDeCuenta=" + numeroDeCuenta +
                ", fechaDeApertura=" + fechaDeApertura +
                ", datosPersona=" + datosPersona +
                ", saldo=" + saldo +
                '}';
    }
}
