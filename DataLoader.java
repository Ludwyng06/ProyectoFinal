import java.util.ArrayList;
import java.util.List;

public class DataLoader {
    public static List<Aeropuerto> cargarAeropuertos() {
        List<Aeropuerto> aeropuertos = new ArrayList<>();
        aeropuertos.add(new Aeropuerto("BCN01", "Barcelona - El Prat", "Barcelona", "España", 1));
        aeropuertos.add(new Aeropuerto("MAD01", "Madrid - Adolfo Suárez", "Madrid", "España", 1));
        aeropuertos.add(new Aeropuerto("AGP01", "Málaga - Costa del Sol", "Málaga", "España", 1));
        return aeropuertos;
    }

    public static List<Vuelo> cargarVuelos() {
        List<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new VueloRegular("BCN01", "MAD01", 150, "01:00"));
        vuelos.add(new VueloCharter("BCN01", "MAD01", 150, "01:00"));
        vuelos.add(new VueloRegular("MAD01", "BCN01", 150, "01:00"));
        vuelos.add(new VueloRegular("BCN01", "AGP01", 120, "02:00"));
        vuelos.add(new VueloCharter("AGP01", "BCN01", 120, "02:00"));
        return vuelos;
    }

    public static List<Compania> cargarCompanias() {
        List<Compania> companias = new ArrayList<>();
        companias.add(new Compania("Iberia"));
        companias.add(new Compania("Spanair"));
        companias.add(new Compania("Vueling"));
        return companias;
    }
}
