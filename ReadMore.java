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
public class ReadMore {

    public ReadMore(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int iFin;
        
        while ((line = buffer.readLine()) != null) {
            iFin = 39;
            if(line.length() <= 55){
                System.out.println(line);
            }else{
                while(iFin >= 0 && line.charAt(iFin) != ' '){
                    iFin--;
                }

                iFin = iFin == -1 ? 40 : iFin;
                System.out.println(line.substring(0, iFin) + "... <Read More>");
            }
        }
    }
}
