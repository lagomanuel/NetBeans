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
public class RightmostChar {

    public RightmostChar(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        ArrayList<String> alLetras;
        String sOutput;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split(",")));
            alLetras = new ArrayList<>(Arrays.asList(alTemp.get(0).split("")));
            sOutput = "";
            
            if(alTemp.size() == 2){
                for(int i = 0;i < alLetras.size();i++){
                    if(alLetras.get(i).equals(alTemp.get(1))){
                        sOutput = Integer.toString(i);
                    }
                }
            }
            
            if("".equals(sOutput)){
                sOutput = "-1";
            }
            
            System.out.println(sOutput);
        }    
    }
}
