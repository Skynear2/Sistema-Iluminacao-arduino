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
public class ThreadSensor extends Thread{
    @Override
    public void run(){
        AcessaArduino arduino = new AcessaArduino();
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
                for(int i = 0;i<splitado.length; i++){
                    //System.out.println("split:"+ splitado[i]);
                }
<<<<<<< HEAD
                //System.out.println("senso:" +sensor);
                ThreadSensor.sleep(2000);
=======
                System.out.println("senso:" +sensor);
                ThreadSensor.sleep(1000);
>>>>>>> 9644f3f7e1d87e071549de75e4c543bb85d731dd
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadSensor.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }
    
}
