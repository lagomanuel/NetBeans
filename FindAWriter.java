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
public class FindAWriter {

    public FindAWriter(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        ArrayList<String> alTexto;
        ArrayList<String> alNumeros;
        String sOutput;
        int iPos;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split("\\|")));
            alTexto = new ArrayList<>(Arrays.asList(alTemp.get(0).trim().split("")));
            alNumeros = new ArrayList<>(Arrays.asList(alTemp.get(1).trim().split(" ")));
            
            sOutput = "";
            for(int i = 0;i < alNumeros.size();i++){
                iPos = Integer.parseInt(alNumeros.get(i)) - 1;
                
                sOutput = sOutput + alTexto.get(iPos);
            }
            
            System.out.println(sOutput);
        }
        
    }
    
}
