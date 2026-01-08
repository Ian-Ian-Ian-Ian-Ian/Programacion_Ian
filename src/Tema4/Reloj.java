package Tema4;

public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;
    private boolean RELOJ_24_HORAS;

    // Constructores
    public Reloj() {
        hora = 23;
        minutos = 59;
        segundos = 59;
        RELOJ_24_HORAS = true;
    }

    public Reloj(int hora, int minutos, int segundos, boolean RELOJ_24_HORAS) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        this.RELOJ_24_HORAS = RELOJ_24_HORAS;
    }

    // Getters
    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    //Setters
    public void setHora(int hora) {
        if (hora > 0 && hora < 24) {
            this.hora = hora;
        }
    }

    public void setMinutos(int minutos) {
        if (minutos > 0 && minutos < 59) {
            this.minutos = minutos;
        }
    }

    public void setSegundos(int segundos) {
        if (segundos > 0 && segundos < 59) {
            this.segundos = segundos;
        }
    }

    public void setRELOJ_24_HORAS(boolean RELOJ_24_HORAS) {
        this.RELOJ_24_HORAS = RELOJ_24_HORAS;
    }

    // Modificación de toString
    public String toString() {
        Boolean ANTES_MEDIODIA = true;
        if (hora == 24) {
            hora = 0;
        } else if (!RELOJ_24_HORAS && hora > 12) {
            hora = hora - 12;
            ANTES_MEDIODIA = false;
        }
        // Para hacer que aparezcan 2 digitos si o si
        String HORA_STRING = String.format("%02d", hora);
        String MINUTO_STRING = String.format("%02d", minutos);
        String SEGUNDOS_STRING = String.format("%02d", segundos);
        if (RELOJ_24_HORAS) {
            return "Son las " + HORA_STRING + ":" + MINUTO_STRING + ":" +  SEGUNDOS_STRING;
        } else {
            if (!ANTES_MEDIODIA) {
                return "Son las " + HORA_STRING + ":" + MINUTO_STRING + ":" + SEGUNDOS_STRING + " pm";
            } else {
                return "Son las " + HORA_STRING + ":" + MINUTO_STRING + ":" + SEGUNDOS_STRING + " am";
            }
        }
    }

    // Mostrar el tiempo
    public void showTime() {
        Boolean ANTES_MEDIODIA = true;
        if (hora == 24) {
            hora = 0;
        } else if (!RELOJ_24_HORAS && hora > 12) {
            hora = hora - 12;
            ANTES_MEDIODIA = false;
        }
        // Para hacer que aparezcan 2 digitos si o si
        String HORA_STRING = String.format("%02d", hora);
        String MINUTO_STRING = String.format("%02d", minutos);
        String SEGUNDOS_STRING = String.format("%02d", segundos);

        if (RELOJ_24_HORAS) {
            System.out.println("Son las " + HORA_STRING + ":" + MINUTO_STRING + ":" +  SEGUNDOS_STRING);
        } else {
            if (!ANTES_MEDIODIA) {
                System.out.println("Son las " + HORA_STRING + ":" + MINUTO_STRING + ":" + SEGUNDOS_STRING + " pm");
            } else {
                System.out.println("Son las " + HORA_STRING + ":" + MINUTO_STRING + ":" + SEGUNDOS_STRING + " am");
            }
        }
    }
}
