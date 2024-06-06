public class VueloCharter extends Vuelo {
    private String tipo = "C";

    public VueloCharter(String origen, String destino, int plazas, String duracion) {
        super(origen, destino, plazas, duracion);
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", " + super.toString();
    }
}
