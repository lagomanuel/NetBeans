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
public class MultiplyLists {

    public MultiplyLists(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        ArrayList<String> alTempA;
        ArrayList<String> alTempB;
        String sOutput;
                
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split("\\|")));
            alTempA = new ArrayList<>(Arrays.asList(alTemp.get(0).trim().split(" ")));
            alTempB = new ArrayList<>(Arrays.asList(alTemp.get(1).trim().split(" ")));
            
            sOutput = "";
            for(int i = 0;i < alTempA.size();i++){
                if(!"".equals(sOutput)){
                    sOutput = sOutput + " ";
                }
                
                sOutput = sOutput + 
                        Integer.toString(
                                Integer.parseInt(alTempA.get(i)) * 
                                Integer.parseInt(alTempB.get(i))
                        );
            }
            
            System.out.println(sOutput);
        }
    }
    
}
