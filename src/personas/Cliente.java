package personas;

public class Cliente extends Persona {
    // Constructor
    public Cliente(String rut, String nombre, int edad) {
        super(rut, nombre, edad);
    }

    // Getter y Setter para edad
    // Este ya está heredado de Persona, por lo que no se necesita definirlo de nuevo
}
