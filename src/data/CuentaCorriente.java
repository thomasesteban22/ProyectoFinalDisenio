package data;

import java.time.LocalDate;

public class CuentaCorriente extends Cuenta{
    private LocalDate fechaDelUltimoMovimento;
    private long valorUltimoMovimiento;
    private long valorTopeSobreGiro;

    public LocalDate getFechaDelUltimoMovimento() {
        return fechaDelUltimoMovimento;
    }

    public void setFechaDelUltimoMovimento(LocalDate fechaDelUltimoMovimento) {
        this.fechaDelUltimoMovimento = fechaDelUltimoMovimento;
    }

    public long getValorUltimoMovimiento() {
        return valorUltimoMovimiento;
    }

    public void setValorUltimoMovimiento(long valorUltimoMovimiento) {
        this.valorUltimoMovimiento = valorUltimoMovimiento;
    }

    public long getValorTopeSobreGiro() {
        return valorTopeSobreGiro;
    }

    public void setValorTopeSobreGiro(long valorTopeSobreGiro) {
        this.valorTopeSobreGiro = valorTopeSobreGiro;
    }
}
