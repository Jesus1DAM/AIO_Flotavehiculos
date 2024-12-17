/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_aio_flotavehiculos;

import proyecto_aio_flotavehiculos.Vistas.PantallaPrincipal;
import proyecto_aio_flotavehiculos.Vistas.PantallaCarga;
import proyecto_aio_flotavehiculos.Datos.MimodelitoJesus;
import proyecto_aio_flotavehiculos.Controles.MicontroladorJesus;
import proyecto_aio_flotavehiculos.Vistas.DialogoConfiguracion;

/**
 *
 * @author Jesus
 */
public class Proyecto_AIO_FlotaVehiculos {


    /**
     * Es el metodo principal del proyecto
     * @param args El array de String que captura el programa
     */
    public static void main(String[] args) throws InterruptedException {
        //Iniciamos el programa
        System.out.println("Iniciando el Programa...");
        
       //Creamos los objetos de cada clase  
        MimodelitoJesus modelazo = new MimodelitoJesus();
        PantallaCarga cargando = new PantallaCarga();
        PantallaPrincipal vistazo = new PantallaPrincipal();
        DialogoConfiguracion dialogo = new DialogoConfiguracion(cargando, true);
        MicontroladorJesus controlazo = new MicontroladorJesus(modelazo, vistazo, cargando,dialogo);
        //Iniciamos Control que a su vez inica la Vista
        controlazo.IniciarVistas();

        
        
        
        // TODO code application logic here
    }
    
}
