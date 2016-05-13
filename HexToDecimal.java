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
public class HexToDecimal {

    public HexToDecimal(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        ArrayList<String> alBinarios;
        String sBinario;
        int iBits;
        int iDecimal;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split("")));
            
            sBinario = "";
            for(int i = 0;i < alTemp.size();i ++){
                sBinario = sBinario + parseBinario(alTemp.get(i).toUpperCase());
            }
            
            alBinarios = new ArrayList<>(Arrays.asList(sBinario.split("")));

            iBits = 1;
            iDecimal = 0;
            for (int j = alBinarios.size() - 1;j >= 0;j--) {
                iDecimal = iDecimal + (Integer.parseInt(alBinarios.get(j)) * iBits);

                iBits = iBits * 2;
            }
            
            System.out.println(iDecimal);
        }
    }
    
    private static String parseBinario(String sNum) {
        String sBinario;
        
        switch (sNum) {
            case "0":
                sBinario = "0000";
                break;
            case "1":
                sBinario = "0001";
                break;
            case "2":
                sBinario = "0010";
                break;
            case "3":
                sBinario = "0011";
                break;
            case "4":
                sBinario = "0100";
                break;
            case "5":
                sBinario = "0101";
                break;
            case "6":
                sBinario = "0110";
                break;
            case "7":
                sBinario = "0111";
                break;
            case "8":
                sBinario = "1000";
                break;
            case "9":
                sBinario = "1001";
                break;
            case "A":
                sBinario = "1010";
                break;
            case "B":
                sBinario = "1011";
                break;
            case "C":
                sBinario = "1100";
                break;
            case "D":
                sBinario = "1101";
                break;
            case "E":
                sBinario = "1110";
                break;
            case "F":
                sBinario = "1111";
                break;    
            default:
                sBinario = "0000";
                break;
        }
        
        return sBinario;
    }
}
