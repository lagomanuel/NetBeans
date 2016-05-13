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
public class MultiplesOfANumber {

    public MultiplesOfANumber(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        int iTotal;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split(",")));
            
            iTotal = 0;
            while(Integer.parseInt(alTemp.get(0)) > iTotal){
                iTotal += Integer.parseInt(alTemp.get(1));
            }
            
            System.out.println(Integer.toString(iTotal));
        }
    }
    
}
