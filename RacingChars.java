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
public class RacingChars {

    public RacingChars(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String sDire;
        boolean bFlagCheck;
        boolean bFlagIni = true;
        int iInd = 0;
        int iIndAnt = 0;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            bFlagCheck = line.contains("C") == true;
            
            if(bFlagCheck == true){
                iInd = line.indexOf("C");
                line = line.replaceAll("C", "&");
            }else{
                iInd = line.indexOf("_");
                line = line.replaceAll("_", "&");
            }
            
            if(bFlagIni == true){
                bFlagIni = false;
                iIndAnt = iInd;
            }
            
            if(iInd == iIndAnt){
                sDire = "|";
            }else if(iInd > iIndAnt){
                sDire = "\\\\";
            }else{
                sDire = "/";
            }
            
            iIndAnt = iInd;
            
            System.out.println(line.replaceAll("&", sDire));
        }
    }
    
}
