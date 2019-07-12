package xyz.mac.entities;

public class Auto extends Vehiculo {

    private String puertas;

    public Auto(String marca, String modelo, Double precio, String puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Puertas: " + getPuertas() + " // Precio: $" + getPrecio();
    }
}
