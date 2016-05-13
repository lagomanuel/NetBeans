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

/**
 *
 * @author mfrancisco
 */
public class HiddenDigits {

    public HiddenDigits(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String sNumbers = "0123456789";
        String sOutput;
                
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            line = line.replaceAll("a", "0");
            line = line.replaceAll("b", "1");
            line = line.replaceAll("c", "2");
            line = line.replaceAll("d", "3");
            line = line.replaceAll("e", "4");
            line = line.replaceAll("f", "5");
            line = line.replaceAll("g", "6");
            line = line.replaceAll("h", "7");
            line = line.replaceAll("i", "8");
            line = line.replaceAll("j", "9");
            
            sOutput = "";
            for(int i = 0;i < line.length();i++){
                if(sNumbers.contains(line.substring(i, i+1)) == true){
                    sOutput = sOutput + line.substring(i, i+1);
                }
            }
            
            if("".equals(sOutput)){
                sOutput = "NONE";
            }
            
            System.out.println(sOutput);
        }
        
    }
    
    
}
