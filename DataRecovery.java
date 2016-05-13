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
public class DataRecovery {

    public DataRecovery(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String sOutput;
        boolean bFlag;
        ArrayList<String> alWords;
        ArrayList<String> alIndex;
        ArrayList<String> alTemp;
        Integer iTemp;
        Integer iTotal;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split(";")));
            alWords = new ArrayList<>(Arrays.asList(alTemp.get(0).split(" ")));
            alIndex = new ArrayList<>(Arrays.asList(alTemp.get(1).split(" ")));
            
            alTemp.clear();
            iTotal = alIndex.size();
            for(Integer i = 0;i < alWords.size(); i++){
                alTemp.add("");
                
                bFlag = false;
                for(Integer x = 0;x < iTotal; x++){
                    if(Integer.parseInt(alIndex.get(x)) == (i + 1)){
                        bFlag = true;
                        
                        break;
                    }
                }
                
                if(bFlag == false){
                    iTemp = i + 1;
                    
                    alIndex.add(iTemp.toString());
                }
            }
            
            for(Integer i = 0;i < alWords.size(); i++){
                iTemp = Integer.parseInt(alIndex.get(i)) - 1;
                
                alTemp.set(iTemp, alWords.get(i));
            }
            
            sOutput = "";
            for(Integer i = 0;i < alWords.size(); i++){
                if(!"".equals(sOutput)){
                    sOutput = sOutput + " ";
                }
                
                sOutput = sOutput + alTemp.get(i);
            }
            
            System.out.println(sOutput);
        }
    }
    
}
