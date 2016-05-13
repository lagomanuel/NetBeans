/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeeval.easy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author mfrancisco
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public FizzBuzz(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        
        String line;
        String sResult;
        Integer iDiv1;
        Integer iDiv2;
        Integer iRep;
        Integer iMod;
        Integer iFlag;
        
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            ArrayList<String> alNumeros = new ArrayList<>(Arrays.asList(line.split(" ")));
            
            if (alNumeros.size() != 3) {
                //throw new IOException();
                JOptionPane.showMessageDialog(null, "Número parametros distinto a 3");
                
                System.exit(0);
            }
            
            iDiv1 = Integer.parseInt(alNumeros.get(0));
            iDiv2 = Integer.parseInt(alNumeros.get(1));
            iRep = Integer.parseInt(alNumeros.get(2));
            
            if (iDiv1 < 1 || iDiv1 > 20 ){
                JOptionPane.showMessageDialog(null, "Divisor 1 incorrecto - " + iDiv1.toString());
                
                System.exit(0);
            }
            
            if (iDiv2 < 1 || iDiv2 > 20 ){
                JOptionPane.showMessageDialog(null, "Divisor 2 incorrecto - " + iDiv2.toString());
                
                System.exit(0);
            }
            
            if (iRep < 21 || iRep > 100 ){
                JOptionPane.showMessageDialog(null, "Número repeticiones incorrecto - " + iRep.toString());
                
                System.exit(0);
            }
            
            sResult = "";
            for (Integer i=1;i <= iRep;i++){
                iFlag = 0;
                
                iMod = i%iDiv1;
                if (iMod == 0){
                    iFlag = 1;
                }
                
                iMod = i%iDiv2;
                if (iMod == 0){
                    if(iFlag == 1){
                        iFlag = 3;
                    }
                    else{
                        iFlag = 2;
                    }
                }
                
                if(!"".equals(sResult)){
                    sResult = sResult + " ";
                }
                
                switch (iFlag) {
                    case 1:
                        sResult = sResult + "F";
                        break;
                    case 2:
                        sResult = sResult + "B";
                        break;
                    case 3:
                        sResult = sResult + "FB";
                        break;
                    default:
                        sResult = sResult + i.toString();
                        break;
                }
            }
            
            JOptionPane.showMessageDialog(null, sResult);
            System.out.println(sResult);
        }
    }
}
