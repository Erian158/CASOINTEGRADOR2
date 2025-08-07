/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integracion2;

/**
 *
 * @author Eryan
 */
public class Habitacion {
    private int numeroHabitacion;
    private String tipoHabitacion;
    private double precioHabitacion; 
    private String estadoHabitacion;

    public Habitacion(int numeroHabitacion, String tipoHabitacion, double precioHabitacion, String estadoHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioHabitacion = precioHabitacion;
        this.estadoHabitacion = estadoHabitacion;
    }

    
    
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public String getEstadoHabitacion() {
        return estadoHabitacion;
    }

    public void setEstadoHabitacion(String estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }

    @Override
    public String toString() {
        return "|| Habitación " + numeroHabitacion + " || Tipo: " + tipoHabitacion + " || Precio: $" + precioHabitacion + " || Estado: " + estadoHabitacion;
    }

    String getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       
   
}


