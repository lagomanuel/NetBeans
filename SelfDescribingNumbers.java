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
public class SelfDescribingNumbers {

    public SelfDescribingNumbers(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            if (isSelfDescribing(line)) {
		System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
    
    public static boolean isSelfDescribing(String line) {
    	ArrayList<String> alEle;   
        alEle = new ArrayList<>(Arrays.asList(line.split("")));
        
        for (int i = 0; i < alEle.size(); i++) {
            int amount = Integer.parseInt(alEle.get(i));
            int count = 0;

            for (int j = 0; j < alEle.size(); j++) {
                if ((alEle.get(j)).equals(Integer.toString(i))) {
                    count++;
                }
            }

            if (count != amount) {
                return false;
            }
        }
        
    	return true;
    }
}
