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
public class UniqueElements {

    public UniqueElements(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        ArrayList<String> alEle;
        String sOutput;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split(",")));
            alEle = new ArrayList<>();
            alEle.add(alTemp.get(0));
            sOutput = alTemp.get(0);
            
            for(int i = 1;i < alTemp.size();i ++){
                if(valAddEle(alEle, alTemp.get(i)) == true) {
                    alEle.add(alTemp.get(i));
                    
                    if(!"".equals(sOutput)){
                        sOutput = sOutput + ",";
                    }
                    
                    sOutput = sOutput + alTemp.get(i);
                }
            }
            
            System.out.println(sOutput);
        }
    }
    
    private static boolean valAddEle(ArrayList<String> alTemp, String sEle) {
        boolean bFlag = true;
        
        for(int i = 0;i < alTemp.size();i++){
            if(alTemp.get(i).equals(sEle)){
                bFlag = false;
                
                break;
            }
        }
        
        return bFlag;
    }
    
}
