package data;

public class CuentaVivienda extends Cuenta implements IDepositar{
    private long precioVivienda;
    private boolean vis;

    public long getPrecioVivienda() {
        return precioVivienda;
    }

    public void setPrecioVivienda(long precioVivienda) {
        this.precioVivienda = precioVivienda;
    }

    public boolean isVis() {
        return vis;
    }

    public void setVis(boolean vis) {
        this.vis = vis;
    }

    @Override
    public int depositar(long valorDeposito) {
        saldo = saldo + valorDeposito;
        return (int) saldo;
    }
}
