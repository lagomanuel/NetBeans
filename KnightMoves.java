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
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mfrancisco
 */
public class KnightMoves {

    public KnightMoves(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String sOutput;
        String sLetra;
        int iNumero1;
        int iNumero2;
        int iNumX;
        int iNumY;
        boolean bFlagX;
        boolean bFlagY;
        
        Map<String, Integer> mLetras = new HashMap<>();
        mLetras.put("a", 1);
        mLetras.put("b", 2);
        mLetras.put("c", 3);
        mLetras.put("d", 4);
        mLetras.put("e", 5);
        mLetras.put("f", 6);
        mLetras.put("g", 7);
        mLetras.put("h", 8);

        Map<Integer, String> mNumeros = new HashMap<>();
        mNumeros.put(1, "a");
        mNumeros.put(2, "b");
        mNumeros.put(3, "c");
        mNumeros.put(4, "d");
        mNumeros.put(5, "e");
        mNumeros.put(6, "f");
        mNumeros.put(7, "g");
        mNumeros.put(8, "h");
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            sLetra = line.substring(0, 1);
            iNumero2 = Integer.parseInt(line.substring(1, 2));
            
            iNumero1 = 0;
            for(Map.Entry<String, Integer> mLetra : mLetras.entrySet()){
                if(sLetra == null ? mLetra.getKey() == null : sLetra.equals(mLetra.getKey())){
                    iNumero1 = mLetra.getValue();
                }
            }
            
            iNumX = iNumero1 + 2;
            bFlagX = true;
            if(iNumX > 8){
                bFlagX = false;
            }
            
            if(bFlagX == true){
                iNumY = iNumero2 + 1;
                bFlagY = true;
                if(iNumY > 8){
                    bFlagY = false;
                }
                
                if(bFlagX == true){
                    
                }
            }
            
            iNumX = iNumero1 - 2;
            bFlagX = true;
            if(iNumX < 1){
                bFlagX = false;
            }
            
            sOutput = "";
            System.out.println(sOutput);
        }
    }
    
}
