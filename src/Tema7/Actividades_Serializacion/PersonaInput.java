package Tema7.Actividades_Serializacion;
import java.io.*;

public class PersonaInput {
    private FileInputStream file;
    private ObjectInputStream input;

    public void abrir() throws IOException {
        file = new FileInputStream("persona.dat");
        input = new ObjectInputStream(file);
    }

    public void cerrar() throws IOException {
        if (input!=null) {
            input.close();
        }
    }

    public Persona leer() throws IOException, ClassNotFoundException {
        Persona persona = null;
        try {
            if (input != null) {
                persona = (Persona) input.readObject();
                System.out.println("Sa leido");
            }
        } catch (EOFException eof) {
            //
        }
        return persona;
    }
}
