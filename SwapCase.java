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
public class SwapCase {

    public SwapCase(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String sMinus = "abcdefghijklmnopqrstuvwxyz";
        String sMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String sOutput;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            sOutput = "";
            for(int i = 0;i < line.length();i++){
                if(sMinus.contains(line.substring(i, i+1)) == true){
                    sOutput = sOutput + line.substring(i, i+1).toUpperCase();
                }else if(sMayus.contains(line.substring(i, i+1)) == true){
                    sOutput = sOutput + line.substring(i, i+1).toLowerCase();
                }else{
                    sOutput = sOutput + line.substring(i, i+1);
                }
            }
            
            System.out.println(sOutput);
        }
    }
    
}
