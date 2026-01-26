package Tema4;

public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private final static int ADULT_AGE = 18;
    private final static int RETIRED_AGE = 65;

    //Constructores
    public Persona() {
        dni = "11111111A";
        nombre = "Nombre";
        apellido = "Apellido";
        edad = 20;
    }

    public Persona(String dni, String nombre, String apellido, int edad) {
        this.dni = dni.toUpperCase();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Getters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad){
        if (edad > 0 && edad < 150) {
            this.edad = edad;
        }
    }

    public String toString() {
        return "Aqui tienes la información de la persona: \n" +
                "Nombre:     " + nombre +
                "\nApellido:   " + apellido +
                "\nEdad:       " + edad +
                "\nDNI:        " + dni;
    }

    public void print() {
        System.out.println("Aqui tienes la información de la persona: ");
        System.out.println("Nombre:     " + nombre);
        System.out.println("Apellido:   " + apellido);
        System.out.println("Edad:       " + edad);
        System.out.println("DNI:        " + dni);
    }

    public boolean isAdult() {
        if (edad >= ADULT_AGE) {
            System.out.println(nombre + " es mayor de edad");
            return true;
        } else {
            System.out.println(nombre + " NO es mayor de edad");
            return false;
        }

    }

    public boolean isRetired() {
        if (edad > RETIRED_AGE) {
            System.out.println(nombre + " esta retirado/a");
            return true;
        } else {
            System.out.println(nombre + " NO esta retirado/a");
            return false;
        }
    }

    public void ageDifference(Persona comparativa){
        int difference = 0;
        if (this.edad > comparativa.edad) {
            difference = edad - comparativa.edad;
            System.out.println("La diferencia de edad es de " + difference + " años");
        } else if (comparativa.edad > edad) {
            difference = comparativa.edad - edad;
            System.out.println("La diferencia de edad es de " + difference + " años");
        } else {
            System.out.println("Tienen la misma edad");
        }
    }

    public static boolean checkDNI(String dni) {
        char[] DNI_NUMBER = dni.substring(0,8).toCharArray();
        char[] DNI_LETTER = dni.substring(8).toCharArray();
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char[] LETTER_TABLE = letras.toCharArray();
        int total = 0;
        int num = 0;
        //Este for es para que cambie de ASCII (creo) a números normales, y que me de el número del DNI
        for (int i = 0; i < DNI_NUMBER.length; i++) {
            for (int n = 48; n <= 57; n++) {
                if (DNI_NUMBER[i] == n) {
                    num = n - 48;
                }
            }
            total = total + num;
            if (i < DNI_NUMBER.length - 1) {
                total = total * 10;
            }
        }
        int resto = total % 23;

        if (DNI_LETTER[0] == LETTER_TABLE[resto]) {
            System.out.println("El DNI es correcto");
            return true;
        } else {
            System.out.println("El DNI NO es correcto");
            return false;
        }
    }
}
