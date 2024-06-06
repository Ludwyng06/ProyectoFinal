public abstract class Vuelo {
    private String origen;
    private String destino;
    private int plazas;
    private String duracion;

    public Vuelo(String origen, String destino, int plazas, String duracion) {
        this.origen = origen;
        this.destino = destino;
        this.plazas = plazas;
        this.duracion = duracion;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getDuracion() {
        return duracion;
    }

    public int getPlazas() {
        return plazas;
    }

    @Override
    public String toString() {
        return origen + " -> " + destino + ", Duración: " + duracion + ", Plazas: " + plazas;
    }
}
