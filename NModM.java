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
public class NModM {

    public NModM(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        int iNum1;
        int iNum2;
        int iNum3;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split(",")));
            iNum1 = Integer.parseInt(alTemp.get(0));
            iNum2 = Integer.parseInt(alTemp.get(1));
            
            iNum3 = iNum1 / iNum2;
            iNum2 = iNum2 * iNum3;
            iNum3 = iNum1 - iNum2;
            
            System.out.println(iNum3);
        }
    }
}
