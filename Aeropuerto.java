public class Aeropuerto {
    private String codigo;
    private String nombre;
    private String poblacion;
    private String pais;
    private int gmt;

    public Aeropuerto(String codigo, String nombre, String poblacion, String pais, int gmt) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pais = pais;
        this.gmt = gmt;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getGmt() {
        return gmt;
    }

    public void setGmt(int gmt) {
        this.gmt = gmt;
    }

    @Override
    public String toString() {
        return nombre + " (" + codigo + "), " + poblacion + ", " + pais + ", GMT" + (gmt >= 0? "+" : "") + gmt;
    }
}