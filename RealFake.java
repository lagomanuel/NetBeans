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
public class RealFake {

    public RealFake(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        int iNum;
        int iTotal;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split(" ")));
            
            iTotal = 0;
            for(int i = 0;i < alTemp.size();i++){
                iNum = Integer.parseInt(alTemp.get(i).substring(0, 1));
                iTotal = iTotal + ( iNum * 2 );
                
                iNum = Integer.parseInt(alTemp.get(i).substring(1, 2));
                iTotal = iTotal + iNum;
                
                iNum = Integer.parseInt(alTemp.get(i).substring(2, 3));
                iTotal = iTotal + ( iNum * 2 );
                
                iNum = Integer.parseInt(alTemp.get(i).substring(3, 4));
                iTotal = iTotal + iNum;
            }
            
            if((iTotal % 10) == 0){
                System.out.println("Real");
            }else{
                System.out.println("Fake");
            }
            
        }
    }
    
}
