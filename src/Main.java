public class Main {
    public static void main(String[] args) {
        String name;
        int age;

        Persona persona = new Persona();
        age = persona.getEdad();
        name = persona.getNombre();
        Persona.showInfo(name, age);

        Persona persona1 = new Persona("Manuel");
        age = persona1.getEdad();
        Persona.showInfo(name, age);

        Persona persona2 = new Persona("Eduardo", 20);
        Persona.showInfo(name, age);
    }
}