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
public class MorseCode {

    public MorseCode(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        ArrayList<String> alLetras;
        String sOutput;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split("  ")));
            
            sOutput = "";
            for(int i = 0;i < alTemp.size();i++){
                alLetras = new ArrayList<>(Arrays.asList(alTemp.get(i).split(" ")));
                
                if(!"".equals(sOutput)){
                    sOutput = sOutput + " ";
                }
                
                for(int j = 0;j < alLetras.size();j++){
                    sOutput = sOutput + parseLetra(alLetras.get(j));
                }
            }
            
            System.out.println(sOutput);
        }
    }
    
    private static String parseLetra(String sMorse) {
        String sEle = "";
        
        if(null != sMorse)switch (sMorse) {
            case ".-":
                sEle = "A";
                break;
            case "-...":
                sEle = "B";
                break;
            case "-.-.":
                sEle = "C";
                break;
            case "-..":
                sEle = "D";
                break;
            case ".":
                sEle = "E";
                break;
            case "..-.":
                sEle = "F";
                break;
            case "--.":
                sEle = "G";
                break;
            case "....":
                sEle = "H";
                break;
            case "..":
                sEle = "I";
                break;
            case ".---":
                sEle = "J";
                break;
            case "-.-":
                sEle = "K";
                break;
            case ".-..":
                sEle = "L";
                break;
            case "--":
                sEle = "M";
                break;
            case "-.":
                sEle = "N";
                break;
            case "---":
                sEle = "O";
                break;
            case ".--.":
                sEle = "P";
                break;
            case "--.-":
                sEle = "Q";
                break;
            case ".-.":
                sEle = "R";
                break;
            case "...":
                sEle = "S";
                break;
            case "-":
                sEle = "T";
                break;
            case "..-":
                sEle = "U";
                break;
            case "...-":
                sEle = "V";
                break;
            case ".--":
                sEle = "W";
                break;
            case "-..-":
                sEle = "X";
                break;
            case "-.--":
                sEle = "Y";
                break;
            case "--..":
                sEle = "Z";
                break;
            case ".----":
                sEle = "1";
                break;
            case "..---":
                sEle = "2";
                break;
            case "...--":
                sEle = "3";
                break;
            case "....-":
                sEle = "4";
                break;
            case ".....":
                sEle = "5";
                break;
            case "-....":
                sEle = "6";
                break;
            case "--...":
                sEle = "7";
                break;
            case "---..":
                sEle = "8";
                break;
            case "----.":
                sEle = "9";
                break;
            case "-----":
                sEle = "0";
                break;
            default:
                sEle = "";
                break;
        }
        
        return sEle;
    }
    
}
