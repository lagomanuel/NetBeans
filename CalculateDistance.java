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
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author mfrancisco
 */
public class CalculateDistance {

    public CalculateDistance(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        ArrayList<String> alTemp2;
        DecimalFormat df = new DecimalFormat("#,###,##0");
        int x1;
        int x2;
        int y1;
        int y2;
                
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split("\\) \\(")));
            
            alTemp2 = new ArrayList<>(Arrays.asList(alTemp.get(0).trim().split(",")));
            x1 = Integer.parseInt(alTemp2.get(0).replaceAll("\\(", "").trim());
            y1 = Integer.parseInt(alTemp2.get(1).trim());
            
            alTemp2 = new ArrayList<>(Arrays.asList(alTemp.get(1).trim().split(",")));
            x2 = Integer.parseInt(alTemp2.get(0).trim());
            y2 = Integer.parseInt(alTemp2.get(1).replaceAll("\\)", "").trim());
            
            x1 = x1 - x2;
            y1 = y1 - y2;
            
            x1 = x1 * x1;
            y1 = y1 * y1;
            
            System.out.println(df.format(Math.sqrt(x1 + y1)));
        }
        
    }
    
}
