import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aeropuerto> aeropuertos = new ArrayList<>();
        List<Vuelo> vuelos = new ArrayList<>();
        List<Compania> companias = new ArrayList<>();

        // Cargar datos directamente
        Aeropuerto aeropuerto1 = new Aeropuerto("BCN01", "Barcelona - El Prat", "Barcelona", "España", 1);
        Aeropuerto aeropuerto2 = new Aeropuerto("MAD01", "Madrid - Adolfo Suárez", "Madrid", "España", 1);
        Aeropuerto aeropuerto3 = new Aeropuerto("AGP01", "Málaga - Costa del Sol", "Málaga", "España", 1);
        aeropuertos.add(aeropuerto1);
        aeropuertos.add(aeropuerto2);
        aeropuertos.add(aeropuerto3);

        Vuelo vuelo1 = new VueloRegular("BCN01", "MAD01", 150, "01:00");
        Vuelo vuelo2 = new VueloCharter("BCN01", "MAD01", 150, "01:00");
        Vuelo vuelo3 = new VueloRegular("MAD01", "BCN01", 150, "01:00");
        Vuelo vuelo4 = new VueloRegular("BCN01", "AGP01", 120, "02:00");
        Vuelo vuelo5 = new VueloCharter("AGP01", "BCN01", 120, "02:00");
        vuelos.add(vuelo1);
        vuelos.add(vuelo2);
        vuelos.add(vuelo3);
        vuelos.add(vuelo4);
        vuelos.add(vuelo5);

        Compania compania1 = new Compania("Iberia");
        Compania compania2 = new Compania("Spanair");
        Compania compania3 = new Compania("Vueling");
        companias.add(compania1);
        companias.add(compania2);
        companias.add(compania3);

        // Mostrar vuelos de salida por aeropuerto
        System.out.println("Vuelos de salida por aeropuerto:");
        for (Aeropuerto aeropuerto : aeropuertos) {
            System.out.println("\nAeropuerto: " + aeropuerto.getNombre() + " (" + aeropuerto.getCodigo() + ")");
            for (Vuelo vuelo : vuelos) {
                if (vuelo.getOrigen().equals(aeropuerto.getCodigo())) {
                    System.out.println(vuelo);
                }
            }
        }

        // Mostrar vuelos de llegada por aeropuerto
        System.out.println("\nVuelos de llegada por aeropuerto:");
        for (Aeropuerto aeropuerto : aeropuertos) {
            System.out.println("\nAeropuerto: " + aeropuerto.getNombre() + " (" + aeropuerto.getCodigo() + ")");
            for (Vuelo vuelo : vuelos) {
                if (vuelo.getDestino().equals(aeropuerto.getCodigo())) {
                    System.out.println(vuelo);
                }
            }
        }
    }
}