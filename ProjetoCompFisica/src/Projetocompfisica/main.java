/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projetocompfisica;

import Banco.Iluminaçao;
import Banco.IluminaçaoDao;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author wesle
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interface i = new Interface();
<<<<<<< HEAD
=======
        //COMENTAR ESTA PARTE 
        IluminaçaoDao ilu = new IluminaçaoDao();
        Iluminaçao reg = new Iluminaçao();
        reg.setNumLampada(5);
        reg.setTempoAceso(6);
        ilu.persist(reg);
        //COMENTAR ESTA PARTE
        
>>>>>>> 9ffed0c5bb21225e88161a163e34cf47e8206a62
        i.setVisible(true);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date hora = Calendar.getInstance().getTime(); // Ou qualquer outra forma que tem
        String dataFormatada = sdf.format(hora);
        System.out.println("Data:"+ dataFormatada);
        Date data = new Date();
        System.out.println("Data Agora: "+data);
        System.out.println("teste banco");
        IluminaçaoDao  manager = new IluminaçaoDao();
        BigDecimal soma = manager.soma(1);

<<<<<<< HEAD
=======
        //List<Iluminaçao> lista;


        //linao vei

        //lista = manager.lista();
        
>>>>>>> 9644f3f7e1d87e071549de75e4c543bb85d731dd
>>>>>>> 8b7c6d2e33c9c9af7efab1ac547d310506764e85
        System.out.println("Teste select sum: "+ soma);
        System.out.println("fim teste banco");
<<<<<<< HEAD
        
        //ThreadSensor sensor = new ThreadSensor();
        //sensor.start();
=======
        ThreadSensor sensor = new ThreadSensor();
        sensor.start();
>>>>>>> 9ffed0c5bb21225e88161a163e34cf47e8206a62
    }
    
}
