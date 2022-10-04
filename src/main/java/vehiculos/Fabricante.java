package vehiculos;

public class Fabricante {
    private String nombre;
    private Pais pais;
    public int ventas;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;

        pais.ventas++;

        if (pais.ventas > Vehiculo.PaisMasVendedorCantidad) {
            Vehiculo.PaisMasVendedorCantidad = pais.ventas;
            Vehiculo.PaisMasVendedor = pais;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas() {
        return Vehiculo.FabricaMayorVentas;
    }
}
