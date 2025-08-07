/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integracion2;

/**
 *
 * @author Eryan
 */
public class Integracion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hotel hotel = new Hotel();
        int op = 0;
        while (op != 3) {
            switch (op) {
                case 0:
                    hotel.visualizarHabitaciones();
                    break;
                case 1:
                    hotel.modificarHabitacion();
                    break;
                case 2:
                    hotel.mostrarEstadoDelHotel();
                    break;

            }
        }

    }
