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
public class EvenNumbers {

    public EvenNumbers(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int iNum;
        
        while ((line = buffer.readLine()) != null) {
            iNum = Integer.parseInt(line.trim());
            
            if(iNum%2==0){  
                System.out.println("1");  
            }else{  
                System.out.println("0");
            }  
        }
    }
    
}
