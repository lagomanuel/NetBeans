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
public class CompressedSequence {

    public CompressedSequence(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        String[][] sSequence;
        int iCont;
        String sOutput;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split(" ")));
            sSequence = new String[100][2];
            iCont = 0;
            
            sSequence[iCont][0] = alTemp.get(0);
            sSequence[iCont][1] = "1";
            iCont++;
            
            for(int i = 1;i < alTemp.size();i++){
                iCont = setValor(sSequence, iCont, alTemp.get(i));
            }
            
            sOutput = "";
            for(int i = 0;i < iCont;i++){
                if(!"".equals(sOutput)){
                    sOutput = sOutput + " ";
                }
                
                sOutput = sOutput + sSequence[i][1] + " " + sSequence[i][0];
            }
            
            System.out.println(sOutput);
        }
    }
    
    private static int setValor(String[][] sSequence, int iCont, String sEle){
        if(sSequence[iCont-1][0].equals(sEle)){
            sSequence[iCont-1][1] = Integer.toString(Integer.parseInt(sSequence[iCont-1][1]) + 1);
        }else{
            sSequence[iCont][0] = sEle;
            sSequence[iCont][1] = "1";
            iCont++;
        }
        
        return iCont;
    }
}