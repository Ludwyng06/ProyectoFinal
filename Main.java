import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aeropuerto> aeropuertos = DataLoader.cargarAeropuertos();
        List<Vuelo> vuelos = DataLoader.cargarVuelos();
        List<Compania> companias = DataLoader.cargarCompanias();

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
