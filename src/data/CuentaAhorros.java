package data;

public class CuentaAhorros extends Cuenta{
    private long interesAcomulado;


    public long getInteresAcomulado() {
        return interesAcomulado;
    }

    public CuentaAhorros setInteresAcomulado(long interesAcomulado) {
        this.interesAcomulado = interesAcomulado;
        return this;
    }

    @Override
    public String toString() {
        return "CuentaAhorros{" +
                "interesAcomulado=" + interesAcomulado +
                ", tipo=" + tipo +
                ", numeroDeCuenta=" + numeroDeCuenta +
                ", fechaDeApertura=" + fechaDeApertura +
                ", datosPersona=" + datosPersona +
                ", saldo=" + saldo +
                '}';
    }
}
