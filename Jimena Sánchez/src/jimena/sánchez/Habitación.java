package jimena.sánchez;

public class Habitación {

    //Atributos
    private int numeroHabitacion;
    private String tipo; //matrimonial,
    private double costo;
    private String nombreCliente;

    //ENUM
    public enum estadoDeHabitacion {
        libre, ocupada, sucia
    }
//getters y setters

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

}
