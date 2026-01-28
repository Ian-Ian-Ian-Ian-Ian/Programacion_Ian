package Tema4.GestionPersona;

public class Persona {
    private String DNI;
    private String[] CUENTAS_BANCARIAS = new String[3];

    //Constructores
    public Persona(String DNI) {
        this.DNI = DNI;
    }

    //Getters
    public String getDNI() {
        return DNI;
    }

    public String[] getCUENTAS_BANCARIAS() {
        return CUENTAS_BANCARIAS;
    }

    //Setters
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setCUENTAS_BANCARIAS(String[] CUENTAS_BANCARIAS) {
        this.CUENTAS_BANCARIAS = CUENTAS_BANCARIAS;
    }

    //Métodos
    public void addCuenta(String cuenta) {
        if (CUENTAS_BANCARIAS[CUENTAS_BANCARIAS.length - 1].isEmpty()) {
            for (int i = 0; i < CUENTAS_BANCARIAS.length; i++) {
                if (CUENTAS_BANCARIAS[i].isEmpty()) {
                    CUENTAS_BANCARIAS[i] = cuenta;
                    i = CUENTAS_BANCARIAS.length;
                }
            }
        } else {
            System.out.println("Ya tiene el máximo de cuentas posibles");
        }
    }

    public boolean isMoroso(int saldo) {
        boolean ES_MOROSO = false;
        if (saldo < 0) {
            ES_MOROSO = true;
        }
        return ES_MOROSO;
    }
}
