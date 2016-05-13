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
public class RoadTrip {

    public RoadTrip(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp1;
        ArrayList<String> alTemp2;
        ArrayList<Integer> alDistancias;
        String sOutput;
        int iEle;
        int iTemp;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp1 = new ArrayList<>(Arrays.asList(line.split(";")));
            alDistancias = new ArrayList<>();
            
            for(int i = 0;i < alTemp1.size();i++){
                alTemp2 = new ArrayList<>(Arrays.asList(alTemp1.get(i).trim().split(",")));
                
                iEle = Integer.parseInt(alTemp2.get(1));
                if(alDistancias.size() > 0){
                    for(int j = 0;j < alDistancias.size();j++){
                        if(alDistancias.get(j) > iEle){
                            iTemp = alDistancias.get(j);
                            alDistancias.set(j, iEle);
                            iEle = iTemp;
                        }
                    }
                }    
                alDistancias.add(iEle);
            }
            
            sOutput = Integer.toString(alDistancias.get(0));
            for(int i = 1;i < alDistancias.size();i++){
                if(sOutput != ""){
                    sOutput = sOutput + ",";
                }
                
                sOutput = sOutput + Integer.toString(alDistancias.get(i) - alDistancias.get(i-1));
            }
            
            System.out.println(sOutput);
        }
    }
}
