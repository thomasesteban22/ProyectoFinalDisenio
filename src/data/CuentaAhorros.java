package data;

public class CuentaAhorros extends Cuenta implements IRetirar, IDepositar{
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

    @Override
    public int depositar(long valorDeposito) {
        saldo = saldo + valorDeposito;
        return (int) saldo;
    }

    @Override
    public int retirar(int valorRetiro) {
        if (saldo > valorRetiro) {
            saldo = saldo - valorRetiro;
            return (int) saldo;
        }else if(saldo < valorRetiro){
            System.out.println("Saldo insuficiente");
        }
    return 0;
    }
}
