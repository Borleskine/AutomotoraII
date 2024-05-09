package vehiculos;

public class Bus extends Vehiculo {
    private int cantidadDeAsientos;

    // Constructor
    public Bus(String color, String patente, int cantidadDeAsientos) {
        super(color, patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    // Getter y Setter
    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    // Método para retornar la cantidad de asientos disponibles
    public int asientosDisponibles() {
        return cantidadDeAsientos; // En este caso, simplemente retornamos la cantidad total de asientos.
    }
}
