package Tema4.GestionPersona;

public class Cuenta {
    private int NUMERO_CUENTA;
    private double SALDO;
    private int DEFAULT_NUMERO_CUENTA = 1;

    //Constructores
    public Cuenta() {
        NUMERO_CUENTA = DEFAULT_NUMERO_CUENTA;
        SALDO = 0.00;
        DEFAULT_NUMERO_CUENTA++;
    }

    //Getters
    public int getNUMERO_CUENTA() {
        return NUMERO_CUENTA;
    }

    public double getSaldo() {
        return SALDO;
    }

    //Setters
    public void setNUMERO_CUENTA(int NUMERO_CUENTA) {
        this.NUMERO_CUENTA = NUMERO_CUENTA;
    }

    public void setSALDO(double SALDO) {
        this.SALDO = SALDO;
    }

    //toString modificado
    public String toString() {
        return  "\nNúmero de cuenta: " + NUMERO_CUENTA +
                "\nSaldo disponible: " + SALDO + "\n";
    }

    //Funciones
    public void checkSaldo() {
        System.out.println(SALDO);
    }

    public void recibeAbono(double abono) {
        SALDO = SALDO + abono;
    }

    public void pagarRecibos(double gastos) {
        SALDO = SALDO - gastos;
    }
}
