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
public class BitPositions {

    public BitPositions(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split(",")));
            
            int n = Integer.parseInt(alTemp.get(0));
            int p1 = Integer.parseInt(alTemp.get(1));
            int p2 = Integer.parseInt(alTemp.get(2));

            if (((n >> (p1 - 1)) & 1) == ((n >> (p2 - 1)) & 1)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
    
}
