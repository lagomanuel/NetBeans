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
public class MultiplicationTables {

    public MultiplicationTables() {
        String sCadeF;
        String sCadeT;
        
        for(Integer x = 1;x <= 12;x++){
            sCadeF = "";
            
            for(Integer y = 1;y <= 12;y++){
                sCadeT = Integer.toString(x * y);
                
                for(Integer i = sCadeT.length();i < 4;i++){
                    sCadeT = " " + sCadeT;
                }
                
                sCadeF = sCadeF + sCadeT;
            }
            
            System.out.println(sCadeF);
        }
    }
    
}
