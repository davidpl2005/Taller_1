package Taller1;

public class CuentaBancaria {
    protected int NumeroCuenta;
    protected float saldo;
    protected String tipoDeCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int NumeroCuenta, String tipoDeCuenta) {
        this.NumeroCuenta = NumeroCuenta;
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public CuentaBancaria(int NumeroCuenta, float saldo, String tipoDeCuenta) {
        this.NumeroCuenta = NumeroCuenta;
        this.saldo = saldo;
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta Bancaria [Numero = " + NumeroCuenta + ", Saldo = " + saldo + ", Tipo de cuenta = " + NumeroCuenta
                + " ]";
    }

}
