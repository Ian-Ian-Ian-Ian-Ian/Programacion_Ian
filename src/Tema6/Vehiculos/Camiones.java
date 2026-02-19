package Tema6.Vehiculos;

public class Camiones extends Vehiculo{

    private int mma;
    private boolean mer_peligrosa;

    public Camiones(String marca, String tipo_gasolina, int mma, boolean mer_peligrosa) {
        this.kilometros = 0;
        this.tipo_gasolina = tipo_gasolina;
        this.marca = marca;
        this.mma = mma;
        this.mer_peligrosa = mer_peligrosa;
    }
}
