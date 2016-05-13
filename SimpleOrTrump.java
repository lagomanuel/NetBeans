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
import java.util.Objects;

/**
 *
 * @author mfrancisco
 */
public class SimpleOrTrump {

    public SimpleOrTrump(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        String sPalo;
        int iOptPalo;
        
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split("\\|")));
            
            sPalo = alTemp.get(1).trim();
            alTemp = new ArrayList<>(Arrays.asList(alTemp.get(0).split(" ")));
            
            if(getPalo(alTemp.get(0)).equals(getPalo(alTemp.get(1)))){
                iOptPalo = 0;
            }else if(getPalo(alTemp.get(0)).equals(sPalo)){
                iOptPalo = 1;
            }else if(getPalo(alTemp.get(1)).equals(sPalo)){
                iOptPalo = 2;
            }else{
                iOptPalo = 3;
            }
            
            if(getValor(alTemp.get(0)) > getValor(alTemp.get(1)) && iOptPalo != 2){
                System.out.println(alTemp.get(0));
            }else if(getValor(alTemp.get(1)) > getValor(alTemp.get(0)) && iOptPalo != 1){
                System.out.println(alTemp.get(1));
            }else if(Objects.equals(getValor(alTemp.get(1)), getValor(alTemp.get(0))) 
                    && (iOptPalo == 0 || iOptPalo == 3)){
                System.out.println(alTemp.get(0) + " " + alTemp.get(1));
            }else if(iOptPalo == 1){
                System.out.println(alTemp.get(0));
            }else if(iOptPalo == 2){
                System.out.println(alTemp.get(1));
            }else{
                System.out.println(alTemp.get(0) + " " + alTemp.get(1));
            }                
        }
    }
    
    private static String getPalo(String sCarta) {
        String sPalo;
        
        if(sCarta.length() == 3){
            sPalo = sCarta.substring(2, 3);
        }else{
            sPalo = sCarta.substring(1, 2);
        }
        
        return sPalo;
    }
    
    private static Integer getValor(String sCarta) {
        Integer iValor;
        String sValorS = "AKQJ";
        
        if(sCarta.length() == 3){
            iValor = Integer.parseInt(sCarta.substring(0, 2));
        }else{
            if(sValorS.contains(sCarta.substring(0, 1))){
                switch (sCarta.substring(0, 1)) {
                    case "A":
                        iValor = 14;
                        break;
                    case "K":
                        iValor = 13;
                        break;
                    case "Q":
                        iValor = 12;
                        break;
                    case "J":
                        iValor = 11;
                        break;
                    default:
                        iValor = 0;
                        break;
                }
            }else{
                iValor = Integer.parseInt(sCarta.substring(0, 1));
            }
        }
        
        return iValor;
    }
}
