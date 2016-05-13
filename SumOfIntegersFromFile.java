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

/**
 *
 * @author mfrancisco
 */
public class SumOfIntegersFromFile {

    public SumOfIntegersFromFile(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int iTotal = 0;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            iTotal = iTotal + Integer.parseInt(line);
        }
        
        System.out.println(iTotal);
    }
    
}
