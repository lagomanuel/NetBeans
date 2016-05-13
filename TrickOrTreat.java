/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeeval.easy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author mfrancisco
 */
public class TrickOrTreat {
    
    public TrickOrTreat(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        Double dTotal;
        Integer iChilds;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            line = line.replaceAll(",", ":");
            
            alTemp = new ArrayList<>(Arrays.asList(line.split(":")));
            
            dTotal = 0.0;
            iChilds = 0;
            for(Integer i = 0;i < alTemp.size();i = i + 2){
                if(null != alTemp.get(i))switch (alTemp.get(i).trim()) {
                    case "Vampires":
                        dTotal = dTotal + (3 * Integer.parseInt(alTemp.get(i+1).trim()));
                        iChilds = iChilds + Integer.parseInt(alTemp.get(i+1).trim());
                        break;
                    case "Zombies":
                        dTotal = dTotal + (4 * Integer.parseInt(alTemp.get(i+1).trim()));
                        iChilds = iChilds + Integer.parseInt(alTemp.get(i+1).trim());
                        break;
                    case "Witches":
                        dTotal = dTotal + (5 * Integer.parseInt(alTemp.get(i+1).trim()));
                        iChilds = iChilds + Integer.parseInt(alTemp.get(i+1).trim());
                        break;
                    case "Houses":
                        dTotal = (dTotal * Integer.parseInt(alTemp.get(i+1).trim())) / iChilds;
                        break;
                    default:
                        break;
                }
            }
            
            System.out.println(Integer.toString(dTotal.intValue()));
        }               
    }
    
}
