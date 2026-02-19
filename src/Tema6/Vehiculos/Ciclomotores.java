package Tema6.Vehiculos;

public class Ciclomotores extends Vehiculo{

    private int cilindrada;

    public Ciclomotores(String marca, String tipo_gasolina, int cilindrada) {
        this.kilometros = 0;
        this.tipo_gasolina = tipo_gasolina;
        this.marca = marca;
        this.cilindrada = cilindrada;
    }

    public boolean necesitaCarnet(int cilindrada) {
        return cilindrada >= 125;
    }
}