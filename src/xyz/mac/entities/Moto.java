package xyz.mac.entities;

public class Moto extends Vehiculo {

    private String cilindrada;

    public Moto(String marca, String modelo, Double precio, String cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Cilindrada: " + getCilindrada() + "c // Precio: $" + getPrecio();
    }
}

