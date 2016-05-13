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
public class StepwiseWord {

    public StepwiseWord(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        int iInd;
        int iLength;
        String sOutput;
        String sTemp;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split(" ")));
            
            iLength = 0;
            iInd = 0;
            for(int i = 0;i < alTemp.size();i++){
                if(alTemp.get(i).length() > iLength){
                    iLength = alTemp.get(i).length();
                    iInd = i;
                }
            }
            
            alTemp = new ArrayList<>(Arrays.asList(alTemp.get(iInd).split("")));
            
            sOutput = "";
            sTemp = "";
            for(int i = 0;i < alTemp.size();i++){
                if(!"".equals(sOutput)){
                    sOutput = sOutput + " ";
                }
                
                sOutput = sOutput + sTemp + alTemp.get(i);
                
                sTemp = sTemp + "*";
            }
            
            System.out.println(sOutput);
        }
    }
}
