/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeeval.easy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author mfrancisco
 */
public class StringMask {

    public StringMask(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        ArrayList<String> alString;
        ArrayList<String> alMask;
        String sOutput;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split(" ")));
            alString = new ArrayList<>(Arrays.asList(alTemp.get(0).split("")));
            alMask = new ArrayList<>(Arrays.asList(alTemp.get(1).split("")));
            
            sOutput = "";
            for(Integer i = 0;i < alString.size();i++){
                if("1".equals(alMask.get(i))){
                    sOutput = sOutput + alString.get(i).toUpperCase();
                }
                else{
                    sOutput = sOutput + alString.get(i).toLowerCase();
                }
            }
            
            System.out.println(sOutput);
        }
    }
    
}
