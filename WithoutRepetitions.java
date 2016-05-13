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
public class WithoutRepetitions {

    public WithoutRepetitions(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String sOutput;
        String sTemp;
        
        while ((line = buffer.readLine()) != null) {
            sTemp = "";
            sOutput = "";
            for(int i = 0;i < line.length();i++){
                if(!sTemp.equals(line.substring(i, i+1))){
                    sTemp = line.substring(i, i+1);
                    sOutput = sOutput + sTemp;
                }
            }
            
            System.out.println(sOutput);
        }
    }
    
}
