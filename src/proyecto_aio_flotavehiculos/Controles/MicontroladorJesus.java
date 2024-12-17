/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_aio_flotavehiculos.Controles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyecto_aio_flotavehiculos.Vistas.PantallaPrincipal;
import proyecto_aio_flotavehiculos.Datos.MimodelitoJesus;
import proyecto_aio_flotavehiculos.Vistas.DialogoConfiguracion;
import proyecto_aio_flotavehiculos.Vistas.PantallaCarga;

/**
 *
 * @author Jesus
 */
public class MicontroladorJesus implements ActionListener{
 //aqui creo mi clase controlador 
    
        private MimodelitoJesus modelAIO;
        private PantallaPrincipal vistaAIO;
        private PantallaCarga cargaAIO;
        private DialogoConfiguracion dialogoAIO;
        
        
  //constructor Vacio de MiControladorJesus
    public MicontroladorJesus() {
    }
//constructor  de MiControladorJesis con MimodelitoJesus y con PantallaPrincipal

    public MicontroladorJesus(MimodelitoJesus modelAIO, PantallaPrincipal vistaAIO, PantallaCarga cargaAIO,DialogoConfiguracion dialogoAIO) {
        this.modelAIO = modelAIO;
        this.vistaAIO = vistaAIO;
        this.cargaAIO = cargaAIO;
        this.dialogoAIO = dialogoAIO;
        
        Escuchadores();
    }
    
     
      public void  IniciarVistas() throws InterruptedException{
         System.out.println("Iniciando Pantalla de Carga");
        cargaAIO.setVisible(true);
        Thread.sleep(3000);
        cargaAIO.setVisible(false);
         System.out.println("Iniciando Pantalla Principal");
        vistaAIO.setVisible(true);
     
        }
      
 
    /**
    * Agrupamos los escuchadores
    */     
private void Escuchadores(){
        vistaAIO.addActionListenerAñadir(this);
        vistaAIO.addActionListenerModificar (this);
        vistaAIO.addActionListenerBorrar(this);
        vistaAIO.addActionListenerAjustes(this);
        dialogoAIO.addActionListenerbtnGuardar(this);
        dialogoAIO.addActionListenerbtnSalir(this);
    
}
 /**
    *Switch para escuchar cada Evento.
    */
public void actionPerformed(ActionEvent e){
    
    switch (e.getActionCommand()){
        case "Añadir Vehiculo":
            System.out.println("Vas a añadir un nuevo Vehiculo");
            
            break;
        case "Borrar Vehiculo":
            System.out.println("Vas a Borrar un Vehiculo existente");
            break;
        case "Modificar Vehiculo":
            System.out.println("Vas a Modificar un vehiculo existente");
            break;
        case "Ir a Ajustes":
            System.out.println("Has seleccionado Ajustes");
            lanzaconfiguracion();
            break;
        case "Guardar":
            System.out.println("Has seleccionado Guardar Configuracion");
            PonerNombreUsuario();
            PonerDNIUsuario();
            break;
        case "Salir":
            System.out.println("Has seleccionado Salir de Configuracion");
            Salirdeconfig();
            break;  
       
        default:
            System.out.println("Se ha pulsado algo ???");
    }
}

/**
    *Metodo para recoger el nombre de usuario del Jdialog.
    */

private void PonerNombreUsuario(){
    
    if ( !dialogoAIO.getNombrePropietario().isEmpty() ){
      
        System.out.println("Nombre del propietario: " + dialogoAIO.getNombrePropietario()+ ".");
    }
    dialogoAIO.dispose();
}
/**
    *Metodo para recoger el DNI de usuario del Jdialog.
    */

private void PonerDNIUsuario(){
    
    if ( !dialogoAIO.getDNIPropietario().isEmpty() ){
        
        System.out.println("Dni del propietario: " + dialogoAIO.getDNIPropietario()+ ".");
    }
    dialogoAIO.dispose();
}
/**
    *Metodo para Salir de la configuracion del Jdialog.
    */
private void Salirdeconfig(){
    System.out.println("Salir de configuracion");
    dialogoAIO.dispose();
}
/**
    *Metodo para entrar en la configuracion del Jdialog.
    */
     private void lanzaconfiguracion(){
    dialogoAIO.setVisible(true);
}
}
