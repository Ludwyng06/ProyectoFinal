public class VueloRegular extends Vuelo {
    private String tipo = "R";

    public VueloRegular(String origen, String destino, int plazas, String duracion) {
        super(origen, destino, plazas, duracion);
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", " + super.toString();
    }
}
