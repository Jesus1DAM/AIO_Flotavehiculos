/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_aio_flotavehiculos;

/**
 *
 * @author Jesus
 */
public class MicontroladorJesus {
 //aqui creo mi clase controlador 
    
        private MimodelitoJesus modelAIO;
        private MiVistaJesus vistaAIO;
  //constructor Vacio de MiControladorJesus
    public MicontroladorJesus() {
    }
//constructor  de MiControladorJesis con MimodelitoJesus y con MiVistaJesus
    public MicontroladorJesus(MimodelitoJesus modelAIO, MiVistaJesus vistaAIO) {
        this.modelAIO = modelAIO;
        this.vistaAIO = vistaAIO;
    }
     
      public void  IniciarControl(){
         System.out.println("Iniciando MiVistaJEsus");
        vistaAIO.setVisible(true);
     
}

    
}
