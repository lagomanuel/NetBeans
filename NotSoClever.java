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
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author mfrancisco
 */
public class NotSoClever {

    public NotSoClever(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        ArrayList<String> alNumeros;
        int iCambios;
        int iContador;
        boolean bFlag;
        String sOutput;
        String sTemp;
                
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split("\\|")));
            alNumeros = new ArrayList<>(Arrays.asList(alTemp.get(0).trim().split(" ")));
            iCambios = Integer.parseInt(alTemp.get(1).trim());
            iContador = 0;
                        
            bFlag = true;
            while(iContador < iCambios && bFlag == true){
                bFlag = false;
                for(int i = 0;i < alNumeros.size() - 1;i++){
                    if(Integer.parseInt(alNumeros.get(i)) > Integer.parseInt(alNumeros.get(i+1)))
                    {
                        sTemp = alNumeros.get(i);
                        alNumeros.set(i, alNumeros.get(i+1));
                        alNumeros.set(i+1, sTemp);
                        
                        bFlag = true;
                        break;
                    }
                }
                
                if(bFlag == true){
                    iContador++;
                }   
            }
            
            sOutput = "";
            for(int i = 0;i < alNumeros.size();i++){
                if(!"".equals(sOutput)){
                    sOutput = sOutput + " ";
                }
                
                sOutput = sOutput + alNumeros.get(i);
            }
            
            System.out.println(sOutput);
        }
        
    }
    
}
