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
public class RomanNumerals {

    public RomanNumerals(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        String sOutput;
        int iTemp;
        int iInd;
        String s1;
        String s2;
        String s3;
                
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split("")));
            
            sOutput = "";
            iInd = 0;
            for(int i = alTemp.size() - 1;i >= 0;i--){
                switch (i) {
                    case 3:
                        s1 = "M";
                        s2 = "";
                        s3 = "";
                        break;
                    case 2:
                        s1 = "C";
                        s2 = "D";
                        s3 = "M";
                        break;
                    case 1:
                        s1 = "X";
                        s2 = "L";
                        s3 = "C";
                        break;
                    case 0:
                        s1 = "I";
                        s2 = "V";
                        s3 = "X";
                        break;
                    default:
                        s1 = "";
                        s2 = "";
                        s3 = "";
                        break;
                
                }
                    
                iTemp = Integer.parseInt(alTemp.get(iInd));
                if (iTemp < 4) {
                    for (int x = 0; x < iTemp; x++) {
                        sOutput = sOutput + s1;
                    }
                } else if (iTemp == 4) {
                    sOutput = sOutput + s1 + s2;
                } else if (iTemp < 9) {
                    sOutput = sOutput + s2;
                    for (int x = 0; x < iTemp - 5; x++) {
                        sOutput = sOutput + s1;
                    }
                } else if (iTemp == 9) {
                    sOutput = sOutput + s1 + s3;
                }                
                
                iInd++;
            }
            
            System.out.println(sOutput);
        }
        
    }
    
}
