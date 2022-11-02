package data;

import java.time.LocalDate;

public class CuentaVivienda extends Cuenta {
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
}
