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
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author mfrancisco
 */
public class WordToDigit {

    public WordToDigit(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        String sOutput;
        
        Map<String, String> mLetras = new HashMap<>();
        mLetras.put("zero", "0");
        mLetras.put("one", "1");
        mLetras.put("two", "2");
        mLetras.put("three", "3");
        mLetras.put("four", "4");
        mLetras.put("five", "5");
        mLetras.put("six", "6");
        mLetras.put("seven", "7");
        mLetras.put("eight", "8");
        mLetras.put("nine", "9");
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split(";")));
            sOutput = "";
            
            for(int i = 0;i < alTemp.size();i++){
                for(Entry<String, String> mTemp:mLetras.entrySet()){
                    if(mTemp.getKey().equals(alTemp.get(i))){
                        sOutput = sOutput + mTemp.getValue();
                    }
                }
            }
            
            System.out.println(sOutput);
        }
        
    }
    
}
