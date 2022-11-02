package data;

import java.time.LocalDate;

public class CuentaAhorros extends Cuenta{
    private long interesAcomulado;

    public long getInteresAcomulado() {
        return interesAcomulado;
    }

    public void setInteresAcomulado(long interesAcomulado) {
        this.interesAcomulado = interesAcomulado;
    }
}
