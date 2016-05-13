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
public class ShortestRepetition {

    public ShortestRepetition(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        String sRep;
        String sIni;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split("")));
            
            sIni = alTemp.get(0);
            sRep = sIni;
            for(int i = 1;i < alTemp.size();i++){
                if(!alTemp.get(i).equals(sIni)){
                   sRep = sRep + alTemp.get(i);
                }else{
                    break;
                }
            }
            
            System.out.println(sRep.length());
        }
    }
    
}
