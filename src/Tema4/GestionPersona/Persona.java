package Tema4.GestionPersona;

public class Persona {
    private String DNI;
    private Cuenta[] CUENTAS_BANCARIAS = new Cuenta[3];

    //Constructores
    public Persona() {
        DNI = "";
    }

    public Persona(String DNI) {
        this.DNI = DNI;
    }

    //Getters
    public String getDNI() {
        return DNI;
    }

    public Cuenta[] getCUENTAS_BANCARIAS() {
        return CUENTAS_BANCARIAS;
    }

    //Setters
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setCUENTAS_BANCARIAS(Cuenta[] CUENTAS_BANCARIAS) {
        this.CUENTAS_BANCARIAS = CUENTAS_BANCARIAS;
    }

    //Métodos
    public void addCuenta(Cuenta cuenta) {
        if (CUENTAS_BANCARIAS[CUENTAS_BANCARIAS.length - 1] == null) {
            for (int i = 0; i < CUENTAS_BANCARIAS.length; i++) {
                if (CUENTAS_BANCARIAS[i] == null) {
                    CUENTAS_BANCARIAS[i] = cuenta;
                    i = CUENTAS_BANCARIAS.length;
                }
            }
        } else {
            System.out.println("Ya tiene el máximo de cuentas posibles");
        }
    }

    public boolean isMoroso(double saldo) {
        boolean ES_MOROSO = false;
            if ( saldo < 0 ){
                ES_MOROSO = true;
            }
        return ES_MOROSO;
    }
}
