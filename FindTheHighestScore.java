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
public class FindTheHighestScore {

    public FindTheHighestScore(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp1;
        ArrayList<Integer> alScore = new ArrayList<>();
        Integer iInd;
        boolean bFlagIni;
        String sOutput;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp1 = new ArrayList<>(Arrays.asList(line.split(" ")));
            alScore.clear();

            iInd = 0;
            bFlagIni = true;
            for(Integer i = 0;i < alTemp1.size();i++){
                if("|".equals(alTemp1.get(i)) ){
                    iInd = 0;
                    bFlagIni = false;
                }
                else{
                    if(bFlagIni == true){
                        alScore.add(Integer.parseInt(alTemp1.get(i)));
                    }
                    else{
                        if(Integer.parseInt(alTemp1.get(i)) > alScore.get(iInd)){
                            alScore.set(iInd, Integer.parseInt(alTemp1.get(i)));
                        }
                    }
                    iInd++;
                }
            }
            
            sOutput = "";
            for(Integer i = 0;i < alScore.size();i++){
                if(!"".equals(sOutput)){
                    sOutput = sOutput + " ";
                }
                
                sOutput = sOutput + alScore.get(i).toString();
            }
            
            System.out.println(sOutput);
        }
        
    }
    
}
