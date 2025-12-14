package Tema3.Strings;

import java.util.Scanner;

public class MyString {

    public static void showMenu() {
        System.out.println("Seleccione la opción que quiere hacer");
        System.out.println("-------------------------------------");
        System.out.println("1. Cadena invertida y en mayúscula");
        System.out.println("2. Número de vocales");
        System.out.println("3. Palabra más grande de la cadena");
        System.out.println("4. Veces que se repite la segunda cadena en la primera");
        System.out.println("5. Totan de palabra de la cadena");
        System.out.println("6. Número de teléfono");
        System.out.println("7. Contador de vocales por separado");
    }

    public static String stringInverter(String cadena) {
        int lenght = cadena.length() - 1;
        String cadena2 = "";
        for (int i = 0; i < cadena.length() ;i++) {
            cadena2 = cadena2 + cadena.charAt(lenght);
            lenght--;
        }
        cadena2 = cadena2.toUpperCase();
        return cadena2;
    }

    public static int totalVocal(String cadena) {
        int total = 0;
        char[] car;
        car = cadena.toCharArray();
        for (int i = 0; i < cadena.length(); i++) {
            if (car[i] == 'a' || car[i] == 'e' || car[i] == 'i' || car[i] == 'o' || car[i] == 'u') {
                total++;
            }
        }
        return total;
    }

    public static String biggestWord(String cadena) {

        return cadena;
    }


    public static int wordCount(String cadena) {
        char[] cad = cadena.toCharArray();
        int num = 1;
        for (int i = 0; i < cadena.length() - 1; i++) {
            if (cad[i] == ' '){
                num++;
            }
            if (cad[i] == ' ' && cad[i + 1] == ' ') {
                num--;
            }
        }
        if (cadena.startsWith(" ")) {
            num--;
        }
        return num;
    }

    public static String telephoneNumber(String cadena) {
        char[] cad = cadena.toCharArray();
        String telefono = "(+00)-000-000000";
        char[] tel = telefono.toCharArray();
        int num = 0;
        for (int i = 0; i < tel.length; i++) {
            if (tel[i] == '0') {
                tel[i] = cad[num];
                num++;
            }
        }
        telefono = "";
        for (int i = 0; i < tel.length; i++) {
            telefono = telefono + tel[i];
        }
        return telefono;
    }

    public static void vowelCount(String cadena) {
        char[] cad = cadena.toCharArray();
        int a = 0;      int e = 0;      int i = 0;      int o = 0;      int u = 0;
        String asc = "";
        for (int j = 0; j < cad.length; j++) {
            if (cad[j] == 'a') {
                a++;
            }
            if (cad[j] == 'e') {
                e++;
            }
            if (cad[j] == 'i') {
                i++;
            }
            if (cad[j] == 'o') {
                o++;
            }
            if (cad[j] == 'u') {
                u++;
            }
        }
        for (int j = 0; j < a; j++) {
            asc = asc + "*";
        }
        System.out.println("a " + a + " " + asc);
        asc = "";
        for (int j = 0; j < e; j++) {
            asc = asc + "*";
        }
        System.out.println("e " + e + " " + asc);
        asc = "";
        for (int j = 0; j < i; j++) {
            asc = asc + "*";
        }
        System.out.println("i " + i + " " + asc);
        asc = "";
        for (int j = 0; j < o; j++) {
            asc = asc + "*";
        }
        System.out.println("o " + o + " " + asc);
        asc = "";
        for (int j = 0; j < u; j++) {
            asc = asc + "*";
        }
        System.out.println("u " + u + " " + asc);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        showMenu();

        int opcion = in.nextInt();

        while (opcion < 1 || opcion > 7) {
            System.out.println("Selecciona una opción correcta");
            opcion = in.nextInt();
        }

        String cadena = "";

        if (opcion == 6) {
            boolean ok = false;
            while (!ok) {
                while (cadena.length() != 11) {
                    System.out.println("Por favor, introduzca un número de teléfono de 11 Caractéres (No más, No menos que 11)");
                    cadena = in.next();
                }
                char[] numeros = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
                char[] telf = cadena.toCharArray();
                for (int i = 0; i < cadena.length(); i++) {
                    ok = false;
                    for (int j = 0; j < numeros.length; j++) {
                        if (telf[i] == numeros[j]) {
                            ok = true;
                        }
                    }
                    if (!ok) {
                        i = cadena.length();
                        System.out.println("Por favor, introduce un número de teléfono de 11 Números (NO LETRAS)");
                        cadena = in.next();
                    }
                }
            }
        } else {
            in.nextLine();
            cadena = in.nextLine();
        }

        switch (opcion) {
            case 1:
                String cadena2 = stringInverter(cadena);
                System.out.println(cadena2);
                break;
            case 2:
                int totalvocales = totalVocal(cadena);
                System.out.println("El total de vocales es: " + totalvocales);
                break;
            case 3:
                String palabralarga = biggestWord(cadena);
                System.out.println("La palabra más larga es: " + palabralarga);
                break;
            case 4:

                break;
            case 5:
                int totalpalabras = wordCount(cadena);
                System.out.println("La cadena contiene un total de " + totalpalabras + " palabras");
                break;
            case 6:
                String telefono = telephoneNumber(cadena);
                System.out.println("Tu número de teléfono es: " + telefono);
                break;
            case 7:
                vowelCount(cadena);
                break;
        }
    }
}
