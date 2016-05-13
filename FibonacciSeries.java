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

/**
 *
 * @author mfrancisco
 */
public class FibonacciSeries {

    public FibonacciSeries(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int iN1;
        int iN2;
        int iN3 = 0;
        int iNTotal;
        
        ArrayList<Integer> alTemp = new ArrayList<>();
        alTemp.add(1);
        alTemp.add(1);
                
        while ((line = buffer.readLine()) != null) {
            iNTotal = Integer.parseInt(line.trim());
            
            if(iNTotal == 0){
                iN3 = 0;
            }
            else if(alTemp.size() > iNTotal){
                iN3 = alTemp.get(iNTotal - 1);
            }else{
                iN1 = alTemp.get(alTemp.size() - 1);
                iN2 = alTemp.get(alTemp.size() - 2);
                
                for(int i = alTemp.size();i < iNTotal;i++){
                    iN3 = iN1 + iN2;
                    iN2 = iN1;
                    iN1 = iN3;
                    alTemp.add(iN3);
                }
            }
            
            System.out.println(Integer.toString(iN3));
        }
    }
    
}
