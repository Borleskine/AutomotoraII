package vehiculos;

public class Minibus extends Bus {
    private String tipoViaje;

    // Constructor
    public Minibus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
        super(color, patente, cantidadDeAsientos);
        this.tipoViaje = tipoViaje;
    }

    // Getter y Setter
    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    // Método para imprimir todos los atributos de las clases
    public void imprimeBus() {
        System.out.println("Color: " + getColor());
        System.out.println("Patente: " + getPatente());
        System.out.println("Cantidad de asientos: " + getCantidadDeAsientos());
        System.out.println("Tipo de viaje: " + tipoViaje);
    }
}