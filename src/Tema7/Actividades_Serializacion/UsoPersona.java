package Tema7.Actividades_Serializacion;

public class UsoPersona {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Manolo", 38);
        Persona persona2 = new Persona("Alberto", 22);

        PersonaOutput salida;
        salida = new PersonaOutput();

        try {
            salida.abrir();
            salida.escribir(persona1);
            salida.escribir(persona2);
            salida.cerrar();
        } catch (Exception e) {
            //
        }


        Persona persona;
        PersonaInput entrada;

        entrada = new PersonaInput();

        try {
            entrada.abrir();
            do {
                persona = entrada.leer();
                System.out.println(persona.getNombre());
                System.out.println(persona.getEdad());
            } while (persona != null);
            entrada.cerrar();
        } catch (Exception e) {
            //
        }
    }
}
