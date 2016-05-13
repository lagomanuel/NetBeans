/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeeval.easy;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
//import javax.swing.JOptionPane;

/**
 *
 * @author mfrancisco
 */
public class TimeToEat {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public TimeToEat(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        
        String line;
        ArrayList<Date> alDate;
        ArrayList<String> alHoras;
        SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm:ss");
        Comparator<Date> comparador = Collections.reverseOrder();
        Calendar calendar = Calendar.getInstance();
        Integer iHora;
        Integer iMinutos;
        Integer iSegundos;
        String sHora;
        String sMinutos;
        String sSegundos;
        String sResult;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alHoras = new ArrayList<>(Arrays.asList(line.split(" ")));
            alDate = new ArrayList<>();
            
            for(Integer i = 0;i < alHoras.size();i++) {
                try {
                    alDate.add(sdfHora.parse(alHoras.get(i)));
                } catch (ParseException ex) {
                }               
            }
            
            alDate.sort(comparador);
            
            sResult = "";
            for(Integer i = 0;i < alDate.size();i++) {
                calendar.setTime(alDate.get(i));
                iHora = calendar.get(Calendar.HOUR_OF_DAY);
                iMinutos = calendar.get(Calendar.MINUTE);
                iSegundos = calendar.get(Calendar.SECOND);
                
                sHora = iHora.toString();
                sMinutos = iMinutos.toString();
                sSegundos = iSegundos.toString();
                
                if(sHora.length() != 2){
                    sHora = "0" + sHora;
                }
                
                if(sMinutos.length() != 2){
                    sMinutos = "0" + sMinutos;
                }
                
                if(sSegundos.length() != 2){
                    sSegundos = "0" + sSegundos;
                }
                
                if(!"".equals(sResult)){
                    sResult = sResult + " ";
                }
                
                sResult = sResult + sHora + ":" + sMinutos + ":" + sSegundos;
            }

            System.out.println(sResult);
        }
    }
}
