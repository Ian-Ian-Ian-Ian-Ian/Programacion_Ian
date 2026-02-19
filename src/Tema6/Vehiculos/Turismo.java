package Tema6.Vehiculos;

public class Turismo extends Vehiculo {

    private int num_plazas;
    boolean uso_profesional;

    public Turismo(String marca, String tipo_gasolina, int num_plazas, boolean uso_profesional) {
        this.kilometros = 0;
        this.tipo_gasolina = tipo_gasolina;
        this.marca = marca;
        this.num_plazas = num_plazas;
        this.uso_profesional = uso_profesional;
    }
}
