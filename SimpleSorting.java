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
public class SimpleSorting {
    public SimpleSorting(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String sOutput;
        ArrayList<String> alTemp;
        ArrayList<Integer> alNum;
        int iTemp;
        String sTemp;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split(" ")));
            alNum = new ArrayList<>();
                        
            for(int i = 0;i < alTemp.size();i++){
                alNum.add(Integer.parseInt(alTemp.get(i).replace(".", "")));
            }
            
            for(int x = 0;x < alNum.size();x++){
                for(int y = alNum.size() - 1;y > x;y--){
                    if(alNum.get(y) < alNum.get(x)){
                        iTemp = alNum.get(x);
                        alNum.set(x, alNum.get(y));
                        alNum.set(y, iTemp);
                        
                        sTemp = alTemp.get(x);
                        alTemp.set(x, alTemp.get(y));
                        alTemp.set(y, sTemp);
                    }
                }
            }
            
            sOutput = "";
            for(int x = 0;x < alNum.size();x++){
                if(!"".equals(sOutput)){
                    sOutput = sOutput + " ";
                }
                
                sOutput = sOutput + alTemp.get(x);
            }
            
            System.out.println(sOutput);
        }
    }
}
