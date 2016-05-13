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
public class SwapElements {

    public SwapElements(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        ArrayList<String> alMovesA;
        ArrayList<String> alMovesB;
        String sOutput;
        String sTemp;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split(":")));
            alMovesA = new ArrayList<>(Arrays.asList(alTemp.get(1).split(",")));
            alTemp = new ArrayList<>(Arrays.asList(alTemp.get(0).split(" ")));
                        
            for(int i = 0;i < alMovesA.size();i++){
                alMovesB = new ArrayList<>(Arrays.asList(alMovesA.get(i).split("-")));
                
                sTemp = alTemp.get(Integer.parseInt(alMovesB.get(0).trim()));
                alTemp.set(Integer.parseInt(alMovesB.get(0).trim()),alTemp.get(Integer.parseInt(alMovesB.get(1).trim())));
                alTemp.set(Integer.parseInt(alMovesB.get(1).trim()),sTemp);
            }
            
            sOutput = "";
            for(int i = 0;i < alTemp.size();i++){
                if(!"".equals(sOutput)){
                    sOutput = sOutput + " ";
                }
                
                sOutput = sOutput + alTemp.get(i);
            }
            
            System.out.println(sOutput);
        }
    }
}
