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
//import java.util.Map;
//import java.util.Scanner;
//import java.util.TreeMap;

/**
 *
 * @author mfrancisco
 */
public class TheMajorElement {

    public TheMajorElement(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> alTemp;
        ArrayList<String> alBuscados;
        int iNVeces;
        String sOutput;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            alTemp = new ArrayList<>(Arrays.asList(line.split(",")));
            alBuscados = new ArrayList<>();
            iNVeces = alTemp.size()/2;
            sOutput = "None";
            
            for(int i = 0;i < alTemp.size();i ++){
                if(getNRepeticiones(alBuscados, alTemp.get(i)) == 0 || alBuscados.isEmpty()){
                    alBuscados.add(alTemp.get(i));
                    
                    if(getNRepeticiones(alTemp, alTemp.get(i)) > iNVeces){
                        iNVeces = getNRepeticiones(alTemp, alTemp.get(i));
                        sOutput = alTemp.get(i);
                    }
                }
            }
            
            System.out.println(sOutput);
        }
    }
    
    private static Integer getNRepeticiones(ArrayList<String> alTemp, String sEle) {
        int iRep = 0;
        
        for(int i = 0;i < alTemp.size();i ++){
            if(alTemp.get(i).equals(sEle)){
                iRep++;
            }
        }
        
        return iRep;
    }
    
    /*
    public TheMajorElement(String[] args)throws IOException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String[] nums = in.nextLine().split(","); 
			int length = nums.length / 2;
			Map<Integer, Integer> store = new TreeMap<Integer, Integer>(); 
			for (int i = 0; i < nums.length; i++) {
				int num = Integer.parseInt(nums[i]);
				if (store.containsKey(num)) {
					store.put(num, store.get(num) + 1);
				} else {
					store.put(num, 1); 
				}
			}
			
			System.out.println(search(store, length));
		}
    }
    
    public static String search(Map<Integer, Integer> map, int length) {
    	for (int key : map.keySet()) {
    		if (map.get(key) > length) {
    			return key + ""; 
    		}
    	}
    	
    	return "None";
    }
    */
}
