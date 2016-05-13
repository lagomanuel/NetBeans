/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author mfrancisco
 */
public class DeltaTime {

    public DeltaTime(String[] args)throws IOException, ParseException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        Date dtFechaIni;
        Date dtFechaFin;
        long lDiferencia;
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        long lHoras;
        long lMinutos;
        long lSegundos;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split(" ")));
            
            dtFechaIni = format.parse("20-06-1981 " + alTemp.get(0));
            dtFechaFin = format.parse("20-06-1981 " + alTemp.get(1));
            
            lDiferencia = dtFechaIni.getTime() - dtFechaFin.getTime();
            
            if(lDiferencia < 0){
                lDiferencia = lDiferencia * -1;
            }
            
            lHoras = lDiferencia/3600000;
            lDiferencia = lDiferencia%3600000;
            lMinutos = lDiferencia/60000;
            lDiferencia = lDiferencia%60000;
            lSegundos = lDiferencia/1000;
            
            System.out.println(
                    getString(lHoras) + ":" + getString(lMinutos) + ":" + getString(lSegundos));
        }
    }
    
    private static String getString(long lNum){
        String sReturn;
        
        sReturn = Long.toString(lNum);
        if(sReturn.length() != 2){
            sReturn = "0" + sReturn;
        }
        
        return sReturn;
    }
}
