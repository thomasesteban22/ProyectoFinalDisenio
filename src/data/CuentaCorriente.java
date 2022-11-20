package data;

import javax.swing.*;
import java.time.LocalDate;

public class CuentaCorriente extends Cuenta implements IDepositar, IRetirar{
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

    @Override
    public int depositar(long valorDeposito) {
        saldo = saldo + valorDeposito;
        System.out.println(saldo);
        return (int) saldo;
    }

    @Override
    public int retirar(int valorRetiro) {
        if (saldo > valorRetiro) {
            saldo = saldo - valorRetiro;
            return (int) saldo;
        }else if(saldo <= valorRetiro){
            JOptionPane.showInternalMessageDialog(null,"NO SE PUEDE PROCESAR EL RETIRO, SALDO INSUFICIENTE");
            return (int) saldo;
        }
        return 0;
    }
}
