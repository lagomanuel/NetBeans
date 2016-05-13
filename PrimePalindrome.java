/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeeval.easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author mfrancisco
 */
public class PrimePalindrome {

    public PrimePalindrome() {
        int iResult = 2;
        
        for(int i = 2;i < 1000;i++){
            if(isPrime(i) && isPalindrome(Integer.toString(i))){
                iResult = i;
            }
        }
        
        System.out.println(Integer.toString(iResult));
    }
    
    public static boolean isPrime(int n){
        int root = (int) Math.sqrt(n);

        for (int i = 2;i <= root;i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    public static boolean isPalindrome(String str)
    {
        ArrayList<String> alTemp;
        int iTotal;
        int iReverso;
        
        alTemp = new ArrayList<>(Arrays.asList(str.split("")));
        iTotal = (alTemp.size()/2) + 1;
        iReverso = alTemp.size() - 1;
        
        for(int i = 0;i < iTotal;i++){
            if(!alTemp.get(i).equals(alTemp.get(iReverso))){
                return false;
            }
            
            iReverso--;
        }
        
        return true;
    }
}
