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
public class HappyNumbers {

    public HappyNumbers(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        ArrayList<String> alTemp;
        int iRep = 10;
        int iNum;
        int iInd;
        int iTotal;
        String sNum;
        boolean bFlag;
        
        while ((sNum = buffer.readLine()) != null) {
            sNum = sNum.trim();            
            bFlag = false;
            
            iInd = 0;
            while(bFlag == false && iInd < iRep){
                alTemp = new ArrayList<>(Arrays.asList(sNum.split("")));
                
                iTotal = 0;
                for(int i = 0;i < alTemp.size();i++){
                    iNum = Integer.parseInt(alTemp.get(i));
                    
                    iNum = iNum * iNum;
                    
                    iTotal = iTotal + iNum;
                }
                
                if(iTotal == 1){
                   bFlag = true; 
                }else{
                    sNum = Integer.toString(iTotal);
                }
                
                iInd++;
            }
            
            if(bFlag == false){
                System.out.println("0");
            }else{
                System.out.println("1");
            }
                    
            
        }
    }
    
}
