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
public class AgeDistribution {

    public AgeDistribution(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            System.out.println(getCategory(Integer.parseInt(line)));
        }
    }
    
    private static String getCategory(int iAge){
        if(iAge >= 0 && iAge <= 2){
            return "Still in Mama's arms";
        }else if(iAge >= 3 && iAge <= 4){
            return "Preschool Maniac";
        }else if(iAge >= 5 && iAge <= 11){
            return "Elementary school";
        }else if(iAge >= 12 && iAge <= 14){
            return "Middle school";
        }else if(iAge >= 15 && iAge <= 18){
            return "High school";
        }else if(iAge >= 19 && iAge <= 22){
            return "College";
        }else if(iAge >= 23 && iAge <= 65){
            return "Working for the man";
        }else if(iAge >= 66 && iAge <= 100){
            return "The Golden Years";
        }else{
            return "This program is for humans";
        }
    }
}
