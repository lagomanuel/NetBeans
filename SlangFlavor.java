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
public class SlangFlavor {

    public SlangFlavor(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String sOutput;
        String sTemp;
        String[] sSlang = {", yeah!", ", this is crazy, I tell ya.", ", can U believe this?", ", eh?", ", aw yea.", ", yo.", "? No way!", ". Awesome!"};
        
        while ((line = buffer.readLine()) != null) {
            for(int i = 0;i < line.length();i++){
                
            }
        }
    }
    
}
