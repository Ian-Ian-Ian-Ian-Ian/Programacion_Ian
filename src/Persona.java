import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class Persona {
    String nombre;
    int edad;
    static final int edad_por_defecto = 18;



    public Persona() {
        nombre = "Ian";
        edad = edad_por_defecto;
    }
    public Persona(String name) {
        nombre = name;
        edad = edad_por_defecto;
    }
    public Persona(String name, int edad) {
        nombre = name;
        this.edad = edad;
    }

    public int getEdad () {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public static void showInfo(String nombre, int edad){
        System.out.println("El nombre es: " + nombre + "\nY la edad es: " + edad );
    }


    public void saludar() {
        System.out.println("¡Hola!");
    }
    public void presentarme() {
        System.out.println("Soy " + nombre + " y tengo " + edad_por_defecto + " años.");
    }
    public void saludarA (String nombre) {
        System.out.println("¡Hola " + nombre + "!");
    }
}
