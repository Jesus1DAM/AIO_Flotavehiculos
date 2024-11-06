/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_aio_flotavehiculos;

/**
 *
 * @author Jesus
 */
public class Proyecto_AIO_FlotaVehiculos {


    /**
     * Es el metodo principal del proyecto
     * @param args El array de String que captura el programa
     */
    public static void main(String[] args) {
        //Iniciamos el programa
        System.out.println("Iniciando el Programa...");
        
       //Creamos los objetos de cada clase  
        MimodelitoJesus modelazo = new MimodelitoJesus();
        MiVistaJesus vistazo = new MiVistaJesus();
        MicontroladorJesus controlazo = new MicontroladorJesus(modelazo, vistazo);
        //Iniciamos Control que a su vez inica la Vista
        controlazo.IniciarControl();

        
        
        
        // TODO code application logic here
    }
    
}
