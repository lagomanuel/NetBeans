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
public class ArmstrongNumbers {

    public ArmstrongNumbers(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        int iTotal;
        int iNum;
        int iTemp;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split("")));
            
            iTotal = 0;
            for(int i = 0;i < alTemp.size();i++){
                iNum = Integer.parseInt(alTemp.get(i));
                iTemp = iNum;
                
                for(int j = 1;j < alTemp.size();j++){
                    iTemp = iTemp * iNum;
                }
                
                iTotal = iTotal + iTemp;
            }
            
            if(iTotal == Integer.parseInt(line)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }
    
}
