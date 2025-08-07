/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integracion2;

import javax.swing.JOptionPane;

/**
 *
 * @author Eryan
 */
public class Hotel {

    private Habitacion[][] habitaciones;
    private int pisos = 4;
    private int cantidadHabitaciones = 4;

    public Hotel() {
        habitaciones = new Habitacion[4][4]; // como son  3 pisos, entonces 3 habitaciones por piso
        precargarHabitaciones();
    }

    private void precargarHabitaciones() {
        int numero; //para el numero de la habitacion
        String tipo; //para el tipo de habiracion
        String estado; //para el estado de la habitacion
        double precio; //precio de las habitaciones

        for (int i = 0; i < pisos; i++) {
            for (int j = 0; j < cantidadHabitaciones; j++) {
                numero = ((i + 1) * 100 + (j + 1)); //Aqui se va a poner de primer numero el piso y luego al ser por 100, se pondra el numero de la ahabitacion

                if (j % 2 != 0) {
                    tipo = "Doble";
                } else {
                    tipo = "Simple";
                }

                if (i < 1) { //si se esta en el primer piso el precio es 30 dolares
                    precio = 30;
                } else {
                    if (tipo.compareTo("Simple") == 0) { //mas arriba del primer piso se eleva el valor
                        precio = 40;
                    } else {
                        precio = 60;
                    }
                }

                estado = "Libre";

                habitaciones[i][j] = new Habitacion(numero, tipo, precio, estado);
            }
        }

    }

    public void mostrarEstadoDelHotel() {
        String info = "*-*-*-Estado de las habitaciones*-*-*- \n";
        //print de la matriz
        for (int i = pisos - 1; i >= 0; i--) {
            info += "Piso " + (i + 1) + ":\n";
            for (int j = 0; j < cantidadHabitaciones; j++) {
                info += habitaciones[i][j].getInfo() + "\n";
            }
            info += "\n";
        }

        JOptionPane.showMessageDialog(null, info, "Estado del Hotel", JOptionPane.INFORMATION_MESSAGE);
    }

    public void modificarHabitacion() {

        int numeroHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de habitación a modificar:"));
        Habitacion cuarto = buscarHabitacion(numeroHabitacion);
        if (cuarto == null) {
            
                    

           
        }
        else {
            JOptionPane.showMessageDialog(null, "Habitación no encontrada.");

        }

    }

    public Habitacion buscarHabitacion(int numero) {   //aqui se va a ingresar el numero que cuando se pregunte
        for (int i = 0; i < pisos; i++) {
            for (int j = 0; j < cantidadHabitaciones; j++) {
                if (habitaciones[i][j].getNumeroHabitacion() == numero) { //si el numero de habitracion coincide con el que hay en la matriz
                    return habitaciones[i][j];  //entonces se retorna la posición en la que coincidio con el numero ingresado
                }
            }
        }
        return null;
    }

}

