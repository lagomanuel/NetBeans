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
public class CleanUpTheWords {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
    */
    public CleanUpTheWords(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        char sChar;
        String sVocabulario = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String sText;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            sText = "";
            boolean bFlag = false;
            
            for (int x=0;x<line.length();x++){
                sChar = line.charAt(x);
                
                if(sVocabulario.indexOf(sChar) > -1){
                    sText = sText + sChar;
                    bFlag = false;
                }
                else if(!"".equals(sText) & bFlag == false){
                    sText = sText + " ";
                    bFlag = true;
                }
            }
            
            System.out.println(sText.trim().toLowerCase());
        }
    }
    
}
