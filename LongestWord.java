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
public class LongestWord {

    public LongestWord(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        String sOutput;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split(" ")));
            
            sOutput = alTemp.get(0);
            for(int i = 1;i < alTemp.size();i++){
                if(sOutput.length() < alTemp.get(i).length()){
                    sOutput = alTemp.get(i);
                }
            }
            
            System.out.println(sOutput);
        }
    }
    
}
