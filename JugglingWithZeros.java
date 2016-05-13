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
public class JugglingWithZeros {

    public JugglingWithZeros(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        String sBynary;
        long iBits;
        long iDecimal;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split(" ")));
            
            sBynary = "";
            for(int i = 0;i < alTemp.size();i = i + 2){
                if("00".equals(alTemp.get(i))){
                    sBynary = sBynary + alTemp.get(i+1).replaceAll("0", "1");
                }else{
                    sBynary = sBynary + alTemp.get(i+1);
                }
            }
            
            alTemp = new ArrayList<>(Arrays.asList(sBynary.split("")));
            iBits = 1;
            iDecimal = 0;
            for (int j = alTemp.size() - 1;j >= 0;j--) {
                iDecimal = iDecimal + (Integer.parseInt(alTemp.get(j)) * iBits);

                iBits = iBits * 2;
            }
            
            System.out.println(iDecimal);
        }
    }
    
}
