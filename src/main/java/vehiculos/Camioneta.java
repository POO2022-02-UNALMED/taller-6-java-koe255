package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;
    public static int CantidadCamionetas;

    public Camioneta(String placa, int puertas, String nombre, double precio, double peso, Fabricante fabricante,
            boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;

        CantidadCamionetas++;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
}
