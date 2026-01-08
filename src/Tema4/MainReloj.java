package Tema4;

public class MainReloj {
    public static void main(String[] args) {

        Reloj reloj = new Reloj(2, 8, 0, false);
        reloj.showTime();

        Reloj reloj1 = new Reloj();
        reloj1.showTime();

        Reloj reloj2 = new Reloj();
        reloj2.setHora(20);
        int hora = reloj2.getHora();
        reloj2.showTime();

        System.out.println(reloj);
    }
}
