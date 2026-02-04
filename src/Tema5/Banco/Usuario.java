package Tema5.Banco;

public class Usuario {
    private String dni;
    private String nombre;
    private int edad;

    //Constructores
    public Usuario() {
        dni = "00000000A";
        nombre = "nom";
        edad = 18;
    }

    public Usuario(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters
    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    //Setters

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //toString modificado
    public String toString() {
        return  "\nDatos del cliente\n" +
                "-----------------\n" +
                "DNI:    " + dni +
                "\nNombre: " + nombre +
                "\nEdad:   " + edad + "\n";
    }
}
