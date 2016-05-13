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
public class JsonMenuIds {

    public JsonMenuIds(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String sLabel;
        ArrayList<String> alTemp;
        String sNumeros = "0123456789";
        String sNum;
        int iNum;
        int iTotal;
        
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            iTotal = 0;
            
            while (line.indexOf("Label") > -1) {
                sLabel = line.substring(line.indexOf("Label") + 6, line.indexOf("Label") + 9);
                line = line.substring(line.indexOf("Label") + 8, line.length());
                
                alTemp = new ArrayList<>(Arrays.asList(sLabel.split("")));
                sNum = "";
                for(int i = 0;i < alTemp.size();i++){
                    if(sNumeros.contains(alTemp.get(i)) == true){
                        sNum = sNum + alTemp.get(i);
                    }
                }
                iTotal = iTotal + Integer.parseInt(sNum);
	    }
            
            System.out.println(iTotal);
        }
    }
    
}
