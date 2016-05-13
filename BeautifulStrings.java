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

/**
 *
 * @author mfrancisco
 */
public class BeautifulStrings {

    public BeautifulStrings(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        Map<String, Integer> mapLetras =  new HashMap<>();
        String sAlfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        ArrayList<String> alTemp;
        boolean bFlag;
        int iValMax;
        int iValLetter;
        int iContLetter;
        int iValString;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split("")));
            
            mapLetras.clear();
            iValMax = 1;
            iValLetter = 26;
            
            for(int i = 0;i < alTemp.size();i++){
                if(sAlfabeto.contains(alTemp.get(i))){
                    if(mapLetras.isEmpty()){
                        mapLetras.put(alTemp.get(i).toUpperCase(), 1);
                    }
                    else{
                        bFlag = false;
                        for (Map.Entry<String, Integer> temp : mapLetras.entrySet()) {
                            String key = temp.getKey().toUpperCase();
                            Integer value = temp.getValue();
                            
                            if(alTemp.get(i).toUpperCase() == null ? key == null : alTemp.get(i).toUpperCase().equals(key)){
                                temp.setValue(value + 1);
                                bFlag = true;
                                
                                if(iValMax < value + 1){
                                    iValMax = value + 1;
                                }
                            }
                        }
                        
                        if(bFlag == false){
                            mapLetras.put(alTemp.get(i).toUpperCase(), 1);
                        }
                    }
                }
            }
            bFlag = false;
            iContLetter = 0;
            iValString = 0;
            while(bFlag == false){
                for (Integer value : mapLetras.values()) {
                    if(value == iValMax){
                        iContLetter++;
                        iValString = iValString + iValLetter * value;
                        
                        iValLetter--;
                    }
                }
                iValMax--;
                
                if(iContLetter == mapLetras.size()){
                    bFlag = true;
                }
            }
            System.out.println(Integer.toString(iValString));
        }
    }
}
