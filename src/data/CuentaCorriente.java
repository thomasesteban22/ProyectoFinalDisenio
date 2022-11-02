package data;

import java.time.LocalDate;

public class CuentaCorriente extends Cuenta{
    private LocalDate fechaDelUltimoMovimento;
    private long valorUltimoMovimiento;
    private long valorTopeSobreGiro;

    public CuentaCorriente(int numeroDeCuenta, LocalDate fechaDeApertura, Persona datosPersona, long dato, LocalDate fechaDelUltimoMovimento, long valorUltimoMovimiento, long valorTopeSobreGiro) {
        super(numeroDeCuenta, fechaDeApertura, datosPersona, dato);
        this.fechaDelUltimoMovimento = fechaDelUltimoMovimento;
        this.valorUltimoMovimiento = valorUltimoMovimiento;
        this.valorTopeSobreGiro = valorTopeSobreGiro;
    }
}
