package vehiculos;

public class Taxi extends Vehiculo {
    private int valorPasaje;

    // Constructor
    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    // Getter y Setter
    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    // Método para pagar el pasaje
    public int pagarPasaje(int monto) {
        if (monto >= valorPasaje) {
            return monto - valorPasaje; // Vuelto
        } else {
            return valorPasaje; // Pasaje original
        }
    }
}
