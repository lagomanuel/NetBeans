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
//import java.util.Scanner;

/**
 *
 * @author mfrancisco
 */
public class CapitalizeWords {

    public CapitalizeWords(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String sOutput;
        String sTemp;
        ArrayList<String> alTemp;
        String sVocabulario = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split(" ")));
            
            sOutput = "";
            for(int i = 0;i < alTemp.size();i++){
                if(!"".equals(sOutput)){
                    sOutput = sOutput + " ";
                }
                
                sTemp = alTemp.get(i).substring(0, 1);
                    
                if(sVocabulario.contains(sTemp) == true){
                    sOutput = sOutput + alTemp.get(i).substring(0, 1).toUpperCase() + alTemp.get(i).substring(1, alTemp.get(i).length());
                }else{
                    sOutput = sOutput + alTemp.get(i);
                }
            }
            
            System.out.println(sOutput);
        }
        
        /*Scanner in = new Scanner(file);
		
        while (in.hasNextLine()) {
            String result = "";
            String line = in.nextLine();
            Scanner lineScan = new Scanner(line);
            while (lineScan.hasNext()) {
                String word = lineScan.next();
                result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }

            System.out.println(result.trim());
        }*/
        
    }
    
}
