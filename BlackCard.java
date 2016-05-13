/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeeval.easy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author mfrancisco
 */
public class BlackCard {

    public BlackCard(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String sOutput;
        ArrayList<String> alsTemp;
        ArrayList<String> alsNames;
        int iNum;
        boolean bFlag;
        int iInd;
        int iSize;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alsTemp = new ArrayList<>(Arrays.asList(line.split("\\|")));
            
            alsNames = new ArrayList<>(Arrays.asList(alsTemp.get(0).split(" ")));
            iNum = Integer.parseInt(alsTemp.get(1).trim());
            
            iNum = iNum - 1;
            bFlag = false;
                        
            while (bFlag == false){
                if(alsNames.size() == 1){
                    bFlag = true;
                }
                else{
                    iSize = alsNames.size() - 1;
                    
                    if(iNum <= iSize){
                        iInd = iNum;
                    }
                    else{
                        iInd = (iNum - iSize) - 1;
                        
                        while(iInd > iSize){
                            iInd = (iInd - iSize) - 1;
                        }
                    }
                
                    alsNames.remove(iInd);
                }
            }            
            sOutput = alsNames.get(0);
            
            System.out.println(sOutput);
        }
    }
    
}
