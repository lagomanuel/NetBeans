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
public class BigDigits {

    public BigDigits(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String sNumeros = "0123456789";
        ArrayList<String> alTemp;
        ArrayList<String> alNumero;
        String sOutput;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split("")));
            alNumero = new ArrayList<>();
            for(int i = 0;i < alTemp.size();i++){
                if(sNumeros.contains(alTemp.get(i)) == true){
                    alNumero.add(alTemp.get(i));
                }
            }
            
            for(int i = 0;i < 6;i++){
                sOutput = "";
                for(int j = 0;j < alNumero.size();j++){
                    sOutput = sOutput + getNum(Integer.parseInt(alNumero.get(j)), i);
                }
                
                System.out.println(sOutput);
            }
        }
        
        
    }
    
    private static String getNum(int iNum, int iPos){
        String sNum = "";
        
        switch (iNum) {
            case 0:
                switch (iPos) {
                    case 0:
                        sNum = "-**--";
                        break;
                    case 1:
                        sNum = "*--*-";
                        break;
                    case 2:
                        sNum = "*--*-";
                        break;
                    case 3:
                        sNum = "*--*-";
                        break;
                    case 4:
                        sNum = "-**--";
                        break;
                    default:
                        sNum = "-----";
                        break;
                }   break;
            case 1:
                switch (iPos) {
                    case 0:
                        sNum = "--*--";
                        break;
                    case 1:
                        sNum = "-**--";
                        break;
                    case 2:
                        sNum = "--*--";
                        break;
                    case 3:
                        sNum = "--*--";
                        break;
                    case 4:
                        sNum = "-***-";
                        break;
                    default:
                        sNum = "-----";
                        break;
                }   break;
            case 2:
                switch (iPos) {
                    case 0:
                        sNum = "***--";
                        break;
                    case 1:
                        sNum = "---*-";
                        break;
                    case 2:
                        sNum = "-**--";
                        break;
                    case 3:
                        sNum = "*----";
                        break;
                    case 4:
                        sNum = "****-";
                        break;
                    default:
                        sNum = "-----";
                        break;
                }   break;
            case 3:
                switch (iPos) {
                    case 0:
                        sNum = "***--";
                        break;
                    case 1:
                        sNum = "---*-";
                        break;
                    case 2:
                        sNum = "-**--";
                        break;
                    case 3:
                        sNum = "---*-";
                        break;
                    case 4:
                        sNum = "***--";
                        break;
                    default:
                        sNum = "-----";
                        break;
                }   break;
            case 4:
                switch (iPos) {
                    case 0:
                        sNum = "-*---";
                        break;
                    case 1:
                        sNum = "*--*-";
                        break;
                    case 2:
                        sNum = "****-";
                        break;
                    case 3:
                        sNum = "---*-";
                        break;
                    case 4:
                        sNum = "---*-";
                        break;
                    default:
                        sNum = "-----";
                        break;
                }   break;
            case 5:
                switch (iPos) {
                    case 0:
                        sNum = "****-";
                        break;
                    case 1:
                        sNum = "*----";
                        break;
                    case 2:
                        sNum = "***--";
                        break;
                    case 3:
                        sNum = "---*-";
                        break;
                    case 4:
                        sNum = "***--";
                        break;
                    default:
                        sNum = "-----";
                        break;
                }   break;
            case 6:
                switch (iPos) {
                    case 0:
                        sNum = "-**--";
                        break;
                    case 1:
                        sNum = "*----";
                        break;
                    case 2:
                        sNum = "***--";
                        break;
                    case 3:
                        sNum = "*--*-";
                        break;
                    case 4:
                        sNum = "-**--";
                        break;
                    default:
                        sNum = "-----";
                        break;
                }   break;
            case 7:
                switch (iPos) {
                    case 0:
                        sNum = "****-";
                        break;
                    case 1:
                        sNum = "---*-";
                        break;
                    case 2:
                        sNum = "--*--";
                        break;
                    case 3:
                        sNum = "-*---";
                        break;
                    case 4:
                        sNum = "-*---";
                        break;
                    default:
                        sNum = "-----";
                        break;
                }   break;
            case 8:
                switch (iPos) {
                    case 0:
                        sNum = "-**--";
                        break;
                    case 1:
                        sNum = "*--*-";
                        break;
                    case 2:
                        sNum = "-**--";
                        break;
                    case 3:
                        sNum = "*--*-";
                        break;
                    case 4:
                        sNum = "-**--";
                        break;
                    default:
                        sNum = "-----";
                        break;
                }   break;
            case 9:
                switch (iPos) {
                    case 0:
                        sNum = "-**--";
                        break;
                    case 1:
                        sNum = "*--*-";
                        break;
                    case 2:
                        sNum = "-***-";
                        break;
                    case 3:
                        sNum = "---*-";
                        break;
                    case 4:
                        sNum = "-**--";
                        break;
                    default:
                        sNum = "-----";
                        break;
                }   break;
            default:
                break;
        }
        
        return sNum;
    }
    
}
