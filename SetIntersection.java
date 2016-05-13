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
public class SetIntersection {

    public SetIntersection(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        ArrayList<String> alLst1;
        ArrayList<String> alLst2;
        String sOutput;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split(";")));
            alLst1 = new ArrayList<>(Arrays.asList(alTemp.get(0).split(",")));
            alLst2 = new ArrayList<>(Arrays.asList(alTemp.get(1).split(",")));
            sOutput = "";
            
            for(int i = 0;i < alLst1.size();i++){
                if(valAddEle(alLst2, alLst1.get(i)) == true) {
                    if(!"".equals(sOutput)){
                        sOutput = sOutput + ",";
                    }
                    
                    sOutput = sOutput + alLst1.get(i);
                }
            }
            
            System.out.println(sOutput);
        }
    }
    
    private static boolean valAddEle(ArrayList<String> alTemp, String sEle) {
        boolean bFlag = false;
        
        for(int i = 0;i < alTemp.size();i++){
            if(alTemp.get(i).equals(sEle)){
                bFlag = true;
                
                break;
            }
        }
        
        return bFlag;
    }
}
