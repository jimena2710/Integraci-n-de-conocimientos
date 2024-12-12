
package jimena.sánchez;

import javax.swing.JOptionPane;

public class JimenaSánchez {

    public static void main(String[] args) {
        String opciones = JOptionPane.showInputDialog(null,
                "Bienvenido al sistema de reservas.\n"
                + "Seleccione una opción:\n"
                + "1. Visualizar habitaciones disponibles\n"
                + "2. Realizar reserva\n"
                + "3. Liberar habitación\n"
                + "4. Cambiar información de la habitación\n"
                + "5. Salir");
    }

}
