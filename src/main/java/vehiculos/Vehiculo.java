package vehiculos;

public class Vehiculo {
    private String placa;
    private int puertas;
    private double velocidadMaxima;
    private String nombre;
    private double precio;
    private double peso;
    private String traccion;
    private Fabricante fabricante;
    public static int CantidadVehiculos;

    public static int PaisMasVendedorCantidad = 0;
    public static Pais PaisMasVendedor = null;

    public static int FabricaMayorVentasCantidad = 0;
    public static Fabricante FabricaMayorVentas = null;

    public Vehiculo(String placa, int puertas, double velocidadMaxima, String nombre, double precio, double peso,
            String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        CantidadVehiculos++;

        fabricante.ventas++;

        if (fabricante.ventas > FabricaMayorVentasCantidad) {
            FabricaMayorVentasCantidad = fabricante.ventas;
            FabricaMayorVentas = fabricante;
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        CantidadVehiculos = cantidadVehiculos;
    }

    public static String vehiculosPorTipo() {
        return "Automoviles: " + Automovil.CantidadAutomoviles + "\n" + "Camionetas: " + Camioneta.CantidadCamionetas
                + "\n" + "Camiones: " + Camion.CantidadCamiones;
    }
}
