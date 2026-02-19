package Tema6.Vehiculos;

public class Vehiculo {
    protected String marca;
    protected String tipo_gasolina;
    protected int kilometros;

    public Vehiculo(String marca, String tipo_gasolina) {
        this.marca = marca;
        this.tipo_gasolina = tipo_gasolina;
        this.kilometros = 0;
    }

    public Vehiculo() {
        this.marca = "Mercedes";
        this.tipo_gasolina = "Diesel";
        this.kilometros = 0;
    }
}
