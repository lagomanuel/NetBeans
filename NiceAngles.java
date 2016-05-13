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
public class NiceAngles {

    public NiceAngles(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        double dNum;
        int iNum1;
        int iNum2;
        int iNum3;
        String sOutput;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            dNum = Double.parseDouble(line);
            iNum1 = (int) dNum;
            
            dNum = dNum - iNum1;
            dNum = dNum * 60;
            
            iNum2 = (int) dNum;
            
            dNum = dNum - iNum2;
            dNum = dNum * 60;
            
            iNum3 = (int) dNum;
            
            sOutput = Integer.toString(iNum1) + "." + getNum(iNum2) + "'" + getNum(iNum3) + "\"";
            
            System.out.println(sOutput);
        }
    }
    
    private static String getNum(int iNum){
        String sNum;
        
        sNum = Integer.toString(iNum);
        if(sNum.length() == 1){
            sNum = "0" + sNum;
        }
        
        return sNum;
    }
    
}
