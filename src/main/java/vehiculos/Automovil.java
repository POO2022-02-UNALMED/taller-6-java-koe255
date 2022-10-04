package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;

    public static int CantidadAutomoviles;

    public Automovil(String placa, String nombre, double precio, double peso, Fabricante fabricante, int puertas) {
        super(placa, puertas, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = 4;

        CantidadAutomoviles++;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}
