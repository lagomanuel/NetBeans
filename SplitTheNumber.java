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
public class SplitTheNumber {

    public SplitTheNumber(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        ArrayList<String> alPattern;
        int iTotal;
        int iInd;
        int iSigno;
                        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            iTotal = 0;
            iInd = 0;
            iSigno = 0;
            alTemp = new ArrayList<>(Arrays.asList(line.split(" ")));
            alPattern = new ArrayList<>(Arrays.asList(alTemp.get(1).trim().split("")));
            
            for(int i = 0;i < alPattern.size();i++){
                if("+".equals(alPattern.get(i)) || "-".equals(alPattern.get(i))){
                    if(iSigno == 0 || iSigno == 1){
                        iTotal = iTotal + Integer.parseInt(alTemp.get(0).substring(iInd, i));
                    }else{
                        iTotal = iTotal - Integer.parseInt(alTemp.get(0).substring(iInd, i));
                    }
                    
                    iInd = i;

                    if ("+".equals(alPattern.get(i))) {
                        iSigno = 1;
                    } else if ("-".equals(alPattern.get(i))) {
                        iSigno = 2;
                    }
                }
            }
            
            if (iSigno == 0 || iSigno == 1) {
                iTotal = iTotal + Integer.parseInt(alTemp.get(0).substring(iInd, alTemp.get(0).length()));
            } else {
                iTotal = iTotal - Integer.parseInt(alTemp.get(0).substring(iInd, alTemp.get(0).length()));
            }
            
            System.out.println(iTotal);
        }
    }
    
}
