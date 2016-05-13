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
public class SwapNumbers {

    public SwapNumbers(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        String sOutput;
        int iIni;
        int iFin;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split(" ")));
            sOutput = "";
            
            for(int i = 0;i < alTemp.size();i++){
                if(!"".equals(sOutput)){
                    sOutput = sOutput + " ";
                }
                iIni = 0;
                iFin = alTemp.get(i).length() - 1;
                
                sOutput = sOutput + 
                        alTemp.get(i).substring(iFin, iFin + 1) +
                        alTemp.get(i).substring(iIni + 1, iFin) +
                        alTemp.get(i).substring(iIni, iIni + 1);
            }
            
            System.out.println(sOutput);
        }
        
    }
    
}
