public class curso {
    private int id;
    private String nombre;
    private int creditos;
    private int horasSemanales;

    // Constructor vacío
    public curso() {
    }

    // Constructor con parámetros
    public curso(int id, String nombre, int creditos, int horasSemanales) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
        this.horasSemanales = horasSemanales;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    // Método para imprimir datos
    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", creditos=" + creditos +
                ", horasSemanales=" + horasSemanales +
                '}';
    }
}