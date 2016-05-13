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
public class LowestUniqueNumber {

    public LowestUniqueNumber(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        ArrayList<String> alEle;
        ArrayList<Integer> alElePos;
        String sEle;
        int nElePos;
        String sDescartes;
        int iCont;
                
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split(" ")));
            alEle = new ArrayList<>();
            alElePos = new ArrayList<>();
            sDescartes = "";
            
            for(int i = 0;i < alTemp.size();i++){
                sEle = alTemp.get(i);
                iCont = 1;
                if(sDescartes.contains(sEle) == false){
                    for (int j = i + 1; j < alTemp.size(); j++) {
                        if (sEle.equals(alTemp.get(j))) {
                            iCont++;

                            break;
                        }
                    }
                }else{
                    iCont++;
                }
                
                if(iCont == 1){
                    alEle.add(sEle);
                    alElePos.add(i+1);
                }else{
                    sDescartes = sDescartes + sEle;
                }
            }
            
            if(alEle.isEmpty()){
                System.out.println("0");
            }else if(alEle.size() == 1){
                System.out.println(alElePos.get(0));
            }else{
                sEle = alEle.get(0);
                nElePos = alElePos.get(0);
                for(int i = 1;i < alEle.size();i++){
                    if(Integer.parseInt(sEle) > Integer.parseInt(alEle.get(i))){
                        sEle = alEle.get(i);
                        nElePos = alElePos.get(i);
                    }
                }
                System.out.println(nElePos);
            }
        }
    }
    
}
