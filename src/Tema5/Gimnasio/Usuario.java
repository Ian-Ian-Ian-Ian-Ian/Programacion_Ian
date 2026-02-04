package Tema5.Gimnasio;

public class Usuario {
    private String nombre;
    private int edad;

    //Constructores
    public Usuario() {
        nombre = "nom";
        edad = 18;
    }

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    //Setters
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //toString Modificado
    public String toString() {
        return  "\nDatos del usuario\n" +
                "-----------------\n" +
                "Nombre: " + nombre +
                "\nEdad:   " + edad + "\n";
    }
}
