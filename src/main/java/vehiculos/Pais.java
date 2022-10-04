package vehiculos;

public class Pais {
    private String nombre;
    public int ventas;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor() {
        return Vehiculo.PaisMasVendedor;
    }
}
