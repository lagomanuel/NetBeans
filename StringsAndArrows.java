package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mfrancisco
 */
public class StringsAndArrows {

    public StringsAndArrows(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String sTemp;
        String sArrow;
        int iContador;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            sTemp = line;
            iContador = 0;
            sArrow = "<--<<";
            for(int i = 0;i < 2;i++){
                while (sTemp.contains(sArrow)) {
                    sTemp = sTemp.substring(sTemp.indexOf(sArrow) - 1 + sArrow.length(), sTemp.length());
                    iContador++;
                }
                sTemp = line;
                sArrow = ">>-->";
            }
            
            System.out.println(Integer.toString(iContador));
        }
    }
    
}
