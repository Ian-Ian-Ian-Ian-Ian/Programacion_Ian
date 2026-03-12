package Tema7.Ejemplos;


import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OperacionesPath {

    public static void main(String[] args) throws IOException {

        // Para obtener un objeto Path utilizamos el método Path.of() o Paths.get()
        Path unPath = Path.of("/home/ianbortom/Escriptori");
        Path otroPath = Paths.get("/home/ianbortom/Escriptori/Fichero_para_operaciones1.txt");

        // Obtener el nombre de un fichero y unirlo a la ruta de otro directorio
        Path unFile = Path.of("/home/ianbortom/Escriptori/Fichero_para_operaciones2.txt");
        Path unDir = Path.of("/home/ianbortom/Inici");
        // /home/user/file.txt
        System.out.println(unDir.resolve(unFile.getFileName()));

        // Relativizar una ruta respecto a otra
        Path otroFile = Path.of("/home/ianbortom/Escriptori/Fichero_para_operaciones3.txt \n");
        Path otroDir = Path.of("/home/ianbortom/Inici");
        // obtener c/d.txt
        System.out.println(otroDir.relativize(otroFile));
        System.out.println("--------------------------");
        // La clase Files contiene métodos estáticos para realizar operaciones
        // sobre ficheros y directorios

        // Crear un directorio y sus ascendentes
        Files.createDirectories(Path.of("/home/ianbortom/Hola/esto/es/una/prueba"));

        // Imprimir el contenido de un directorio
        Files.list(Path.of("/home/ianbortom/Escriptori")).forEach(System.out::println);
        System.out.println("--------------------------");
        // Obtener la lista de los contenidos anidados de un directorio
        List<Path> list = Files.walk(Paths.get("/home/ianbortom/Baixades")).collect(Collectors.toList());

        // Imprimir los ficheros regulares de un directorio ordenados por tamaño
        Files.list(Path.of("/home/ianbortom/Baixades"))
                .filter(Files::isRegularFile)
                .sorted(Comparator.comparingLong(path -> {
                    try {
                        return Files.size(path);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }))
                .forEach(System.out::println);
        System.out.println("--------------------------");

        //imprimir los ficheros regulares de un directorio ordenados por tamaño sin programación funcional
        Path directorio = Path.of("/home/ianbortom/Escriptori/Directorio_prueba");
        // Lista para almacenar los archivos regulares
        List<Path> archivos = new ArrayList<>();

        // Recorrer el directorio y filtrar archivos regulares
        DirectoryStream<Path> stream = Files.newDirectoryStream(directorio);
        for (Path path : stream) {
            if (Files.isRegularFile(path)) {
                archivos.add(path);
            }
        }

        // Ordenar por tamaño
        Collections.sort(archivos, new Comparator<Path>() {
            @Override
            public int compare(Path p1, Path p2) {
                try {
                    return Long.compare(Files.size(p1), Files.size(p2));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // Imprimir los archivos ordenados
        for (Path archivo : archivos) {
            System.out.println(archivo);
        }

        // Obtener el año, mes y día de la fecha de la última modificación
        Path file = Path.of("/home/ianbortom/Escriptori/Fichero_para_operaciones4.txt");
        LocalDate time = LocalDate.parse(Files.getLastModifiedTime(file).toString(), DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(time.getYear());
        System.out.println(time.getMonthValue());
        System.out.println(time.getDayOfMonth());
        System.out.println("--------------------------");
        // Navegación entre rutas
        Path relative = Path.of(".");
        Path absolute = relative.toAbsolutePath().normalize();
        System.out.printf("Relative: %s%n", relative);
        System.out.printf("Absolute: %s%n", absolute);
        System.out.printf("Name count: %d%n", absolute.getNameCount());
        System.out.printf("Parent: %s%n", absolute.getParent());
        System.out.printf("Subpath(0, 2): %s%n", absolute.subpath(0, 2));
        System.out.println("--------------------------");
        // Operaciones con ficheros
        Path original = Path.of("/home/ianbortom/Escriptori/Prueba_backup1.iml");
        Path backup = Path.of("/home/ianbortom/Escriptori/Prueba_backup2.iml");
        Path rename = Path.of("prueba.iml.backup.1");
        //copia el archivo de la ruta original a la ruta backup
        Files.copy(original, backup, StandardCopyOption.REPLACE_EXISTING);
        //mueve el archivo de la ruta backup a la ruta rename
        Files.move(backup, rename, StandardCopyOption.REPLACE_EXISTING);
        //borra el archivo de la ruta rename
        Files.delete(rename);
    }

}

