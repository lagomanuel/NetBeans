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
public class MixedContent {

    public MixedContent(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        String sAlfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String sOutputL;
        String sOutputN;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split(",")));
            
            sOutputL = "";
            sOutputN = "";
            for(int i = 0;i < alTemp.size();i++){
                if(sAlfabeto.contains(alTemp.get(i).substring(0, 1)) == true){
                    if(!"".equals(sOutputL)){
                        sOutputL = sOutputL + ",";
                    }
                    
                    sOutputL = sOutputL + alTemp.get(i); 
                }else{
                    if(!"".equals(sOutputN)){
                        sOutputN = sOutputN + ",";
                    }
                    
                    sOutputN = sOutputN + alTemp.get(i); 
                }
            }
            if(!"".equals(sOutputL) && !"".equals(sOutputN)){
                sOutputL = sOutputL + "|";
            }
            
            System.out.println(sOutputL + sOutputN);
        }
    }
    
}
