import xyz.mac.entities.Auto;
import xyz.mac.entities.Moto;
import xyz.mac.entities.Vehiculo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Vehiculo> vehiculoList = new ArrayList<>();
        vehiculoList.add(new Auto("Peugeot", "206", 200000.00D, "4"));
        vehiculoList.add(new Moto("Honda", "Titan", 60000.00D, "125"));
        vehiculoList.add(new Auto("Peugeot", "208", 250000.00D, "5"));
        vehiculoList.add(new Moto("Yamaha", "YBR", 80500.50D, "160"));

        vehiculoList.forEach(System.out::println);

        
        System.out.println("=============================");


        Vehiculo vehiculoCaro = vehiculoList.stream()
                .max(Comparator.comparing(v -> v.getPrecio()))
                .get();
        System.out.println("Vehículo más caro: " + vehiculoCaro.getMarca() + " " + vehiculoCaro.getModelo());

        Vehiculo vehiculoBarato = vehiculoList.stream()
                .min(Comparator.comparing(v -> v.getPrecio()))
                .get();
        System.out.println("Vehículo más barato: " + vehiculoBarato.getMarca() + " " + vehiculoBarato.getModelo());

        String filter = "Y";
        vehiculoList.stream()
                .filter(v -> v.getModelo().contains(filter))
                .collect(Collectors.toList())
                .forEach(v -> System.out.println("Vehículo que contiene en el modelo la letra " + filter + " : " + v.getMarca() + " " + v.getModelo() + " " + v.getPrecio()));


        System.out.println("=============================");


        vehiculoList.stream()
                .sorted(Comparator.comparing(Vehiculo::getPrecio).reversed())
                .collect(Collectors.toList())
                .forEach(vs -> System.out.println(vs.getMarca() + " " + vs.getModelo()));
    }
}
