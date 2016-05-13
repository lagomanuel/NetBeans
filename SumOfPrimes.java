/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeeval.easy;

/**
 *
 * @author mfrancisco
 */
public class SumOfPrimes {

    public SumOfPrimes() {
        Integer iTotal = 2;
        Integer iTope;
        Integer iNumPrimos = 1;
        Double dRaiz;
        boolean bFlag;
        Integer i = 3;
        
        while(iNumPrimos < 1000){
            if(i%2 != 0){
                dRaiz = Math.sqrt(i);
                iTope = dRaiz.intValue() + 1;
                
                bFlag = false;
                for(Integer x = 3;x <= iTope;x++){
                    if(i%x == 0){
                        bFlag = true;
                        
                        break;
                    }
                }
                
                if(bFlag == false){
                    iTotal = iTotal + i;
                    iNumPrimos++;
                    //System.out.println(i.toString());
                }
            }
            
            i = i + 2;
        }
        
        System.out.println(iTotal.toString());
    }
    
}
