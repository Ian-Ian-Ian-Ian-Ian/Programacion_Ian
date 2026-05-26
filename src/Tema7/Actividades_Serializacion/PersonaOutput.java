package Tema7.Actividades_Serializacion;
import java.io.*;

public class PersonaOutput {
    private FileOutputStream file;
    private ObjectOutputStream output;

    public void abrir() throws IOException {
        file = new FileOutputStream("persona.dat");
        output = new ObjectOutputStream(file);
    }

    public void cerrar() throws IOException {
        if (output!=null) {
            output.close();
        }
    }

    public void escribir(Persona persona) throws IOException{
        if (output!=null) {
            output.writeObject(persona);
            System.out.println("Sa escrito");
        }
    }
}
