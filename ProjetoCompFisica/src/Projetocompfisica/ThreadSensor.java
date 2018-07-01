/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projetocompfisica;

import Arduino.AcessaArduino;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wesle
 */
public class ThreadSensor extends Thread {
        AcessaArduino arduino;
    public ThreadSensor(AcessaArduino arduino) {
       this.arduino = arduino;
   }
   
    @Override
    public void run(){
        
         try {
            
            System.out.println("porta detectada: sensor" + arduino.getPortaSelecionada());
            
        } catch (Exception e) {
            System.out.println("Erro ao acionar o arduino");
        }
         
         while(true){
            try {
                String sensor;
                sensor = arduino.getDadosArduino();
                String[] splitado;
                splitado=sensor.split(" =");

               
                    System.out.println("split:"+splitado[1]);
<<<<<<< HEAD
                


=======
>>>>>>> 65b334c589c3ca116d89a501fa2e81db1cb00c3a

                //System.out.println("sensor:" +sensor);
                ThreadSensor.sleep(2000);

<<<<<<< HEAD
          
               for(int i = 0;i<splitado.length; i++){
                    //System.out.println("split:"+ splitado[i]);
=======
                for(int i = 0;i<splitado.length; i++){
                    System.out.println("split:"+ splitado[i]);
>>>>>>> 65b334c589c3ca116d89a501fa2e81db1cb00c3a
                }

                //System.out.println("senso:" +sensor);
                ThreadSensor.sleep(2000);

                System.out.println("senso:" +sensor);
                ThreadSensor.sleep(1000);
<<<<<<< HEAD
=======

>>>>>>> 65b334c589c3ca116d89a501fa2e81db1cb00c3a
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadSensor.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }
    
}
