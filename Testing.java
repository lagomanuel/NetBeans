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
public class Testing {

    public Testing(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        int iNumErr;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split("\\|")));
            
            alTemp.set(0, alTemp.get(0).trim());
            alTemp.set(1, alTemp.get(1).trim());
            
            iNumErr = 0;
            for(int i = 0;i < alTemp.get(0).length();i++){
                if(i + 1 > alTemp.get(1).length()){
                    iNumErr++;
                }
                else if(!alTemp.get(0).substring(i, i + 1).equals(alTemp.get(1).substring(i, i + 1))){
                    iNumErr++;
                }
            }
            
            if(iNumErr == 0){
                System.out.println("Done");
            }
            else if(iNumErr <= 2){
                System.out.println("Low");
            }
            else if(iNumErr <= 4){
                System.out.println("Medium");
            }
            else if(iNumErr <= 6){
                System.out.println("High");
            }
            else if(iNumErr > 6){
                System.out.println("Critical");
            }
        }
    }
}
