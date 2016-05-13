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
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author mfrancisco
 */
public class LettercasePercentageRatio {

    public LettercasePercentageRatio(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        String sAlfabetoU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String sOutput;
        int iNumU;
        double dPorU;
        double dPorL;
        DecimalFormat decimales = new DecimalFormat("0.00");
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split("")));
            
            iNumU = 0;
            for(int i = 0;i < alTemp.size();i++){
                if(sAlfabetoU.contains(alTemp.get(i))){
                    iNumU++;
                }
            }
            
            dPorU =(double) (iNumU * 100)/alTemp.size();
            dPorL =(double) 100.00 - dPorU;
            
            sOutput = "lowercase: " + decimales.format(dPorL) + " uppercase: " + decimales.format(dPorU);
            
            System.out.println(sOutput);
        }
    }
    
}
