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
public class RollerCoaster {

    public RollerCoaster(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String sOutput;
        String sAlfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        ArrayList<String> alTemp;
        boolean bFlag;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split("")));
            
            bFlag = true;
            sOutput = "";
            for(int i = 0;i < alTemp.size();i++){
                if(sAlfabeto.contains(alTemp.get(i))){
                    if (bFlag == true) {
                        sOutput = sOutput + alTemp.get(i).toUpperCase();
                        bFlag = false;
                    } else {
                        sOutput = sOutput + alTemp.get(i).toLowerCase();
                        bFlag = true;
                    }
                }
                else{
                    sOutput = sOutput + alTemp.get(i);
                }
            }
            
            System.out.println(sOutput);
        }
    }
}
