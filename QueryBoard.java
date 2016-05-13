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
public class QueryBoard {

    //public int[][] matrix  = new int[256][256];
    
    public QueryBoard(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        int[][] matrix  = new int[256][256];
        
        for(int i = 0;i < 256;i++){
            for(int j = 0;j < 256;j++){
                matrix[i][j] = 0;
            }
        }
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            alTemp = new ArrayList<>(Arrays.asList(line.split(" ")));
            
            if(null != alTemp.get(0))switch (alTemp.get(0)) {
                case "SetCol":
                    setCol(matrix, Integer.parseInt(alTemp.get(1)), Integer.parseInt(alTemp.get(2)));
                    break;
                case "SetRow":
                    setRow(matrix, Integer.parseInt(alTemp.get(1)), Integer.parseInt(alTemp.get(2)));
                    break;
                case "QueryCol":
                    System.out.println(queryCol(matrix, Integer.parseInt(alTemp.get(1))));
                    break;
                case "QueryRow":
                    System.out.println(queryRow(matrix, Integer.parseInt(alTemp.get(1))));
                    break;
                default:
                    break;
            }
        }
    }
    
    private static void setCol(int[][] matrix, int iNum1, int iNum2) {
        for(int j = 0;j < 256;j++){
            matrix[iNum1][j] = iNum2;
        }
    }
    
    private static void setRow(int[][] matrix, int iNum1, int iNum2) {
        for(int j = 0;j < 256;j++){
            matrix[j][iNum1] = iNum2;
        }
    }
    
    private static int queryCol(int[][] matrix, int iNum) {
        int iTotal = 0;
        
        for(int j = 0;j < 256;j++){
            iTotal = iTotal + matrix[iNum][j];
        }
        
        return iTotal;
    }
    
    private static int queryRow(int[][] matrix, int iNum) {
        int iTotal = 0;
        
        for(int j = 0;j < 256;j++){
            iTotal = iTotal + matrix[j][iNum];
        }
        
        return iTotal;
    }
}
