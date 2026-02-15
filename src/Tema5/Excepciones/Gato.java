package Tema5.Excepciones;

public class Gato {
    private String nombre;
    private int edad;

    public Gato(){
        nombre = "Gato";
        edad = 1;
    }

    public Gato(String nombre, int edad){
        if (nameVerifier(nombre) && ageVerifier(edad)) {
            this.nombre = nombre;
            this.edad = edad;
        } else {
            System.err.println("Datos introducidos no válidos");

        }
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //Setters
    public void setNombre(String nombre) {
        if (nameVerifier(nombre)) {
            this.nombre = nombre;
        } else {
            System.err.println("Nombre no válido");
        }
    }

    public void setEdad(int edad) {
        if (ageVerifier(edad)) {
            this.edad = edad;
        } else {
            System.err.println("Edad no válido");
        }
    }

    /*
    Métodos - No he puesto el toString cambiado ya que cono pide
    un metodo para imprimir llamado "imprimir" lo hago ahí
     */
    private boolean nameVerifier(String nombre) {
        return nombre.length() >= 3;
    }

    private boolean ageVerifier(int edad) {
        return edad >= 0;
    }

    public void imprimir() {
        System.out.println("Nombre del gato: " + nombre);
        System.out.println("Edad del gato:   " + edad);
    }
}
