package Tema4;

public class MainPersona {
    public static void main(String[] args) {
        Persona ian = new Persona("54517979K", "Ian", "Lero Lero", 23);
        String IAN_DNI = ian.getDni();

        ian.isAdult();
        ian.isRetired();
        Persona.checkDNI(IAN_DNI);


        Persona carlos = new Persona("54944856P", "Carlos", "Porrista", 67);
        String CARLOS_DNI = carlos.getDni();

        carlos.isAdult();
        carlos.isRetired();
        Persona.checkDNI(CARLOS_DNI);

        System.out.println(carlos);
        System.out.println(ian);
    }
}
