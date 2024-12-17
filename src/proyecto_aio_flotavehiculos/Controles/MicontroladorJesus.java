/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_aio_flotavehiculos.Controles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
        private String usuarionombre;
        private String usuariodni;
         private final String archivoDatos = "src/datos_usuario.txt";
        
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
    
      /**
    * Método para Iniciar todas las Vistas
    * @throws IOException
    */   
      public void  IniciarVistas() throws InterruptedException{
         System.out.println("Iniciando Pantalla de Carga");
        cargaAIO.setVisible(true);
        Thread.sleep(3000);
        cargaAIO.setVisible(false);
         System.out.println("Iniciando Pantalla Principal");
        vistaAIO.setVisible(true);
        cargarDatosDesdeArchivo();
     
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
            guardarDatosEnArchivo(); // al pusar el boton guardar creamos el txt con los datos de usuario
            cargarDatosDesdeArchivo();
            PonerDatosUsuario();
            
            
            
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
    *Metodo para recoger el nombre  y DNI de usuario del Jdialog.
    */

private void PonerDatosUsuario(){
    
    if ( !dialogoAIO.getNombrePropietario().isEmpty() ){
        usuarionombre= dialogoAIO.getNombrePropietario();
        usuariodni = dialogoAIO.getDNIPropietario();
        vistaAIO.setNombreusuario("Bienvenid@: "+ usuarionombre +"   DNI: " +usuariodni);
        System.out.println("Nombre del propietario: " + usuarionombre + ".");
        System.out.println("DNI del propietario: " + usuariodni + ".");
        guardarDatosEnArchivo();
    }
    dialogoAIO.dispose();
}
/**

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
   /**
    *Metodo para guardar los Datos del Usuario en Un archivo de texto
    * @throws IOException
    */
  private void guardarDatosEnArchivo() {
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoDatos))) {
            writer.write(usuarionombre + "\n");
            writer.write(usuariodni + "\n");
            System.out.println("Datos guardados en " + archivoDatos);
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }
  /**
    *Metodo para cargar los Datos del Usuario desde Un archivo de texto
    * @throws IOException
    */

   public void cargarDatosDesdeArchivo() {
        
        File archivo = new File(archivoDatos);
        if (archivo.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                usuarionombre = reader.readLine();
                usuariodni = reader.readLine();
                if (usuarionombre != null && usuariodni != null) {
                    vistaAIO.setNombreusuario("Bienvenid@: " + usuarionombre + "   DNI: " + usuariodni);
                    System.out.println("Datos cargados: " + usuarionombre + ", " + usuariodni);
                }
            } catch (IOException e) {
                System.err.println("Error al cargar los datos: " + e.getMessage());
            }
        } else {
            System.out.println("No se encontró el archivo de datos.");
        }
    }
  
    
}
