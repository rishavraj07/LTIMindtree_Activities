package LTIM_Week5.Day2_HashMap;

import java.io.*;
import java.util.*;

public class Q7 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of address:");
        TreeMap<String,TreeMap<String,Integer>> map=new TreeMap<>();
        int n=Integer.parseInt(br.readLine());
        for(int i=0; i<n ;i++){
            System.out.println("Enter the address:");
            String[] d=br.readLine().split(",");
            String state=d[2];
            String city=d[1];
            TreeMap<String,Integer> value=new TreeMap<>();
            value.put(city,1);
            if(map.containsKey(state)){
                if(map.get(state).containsKey(city)){
                    int count=map.get(state).get(city);
                    map.get(state).put(city,count+1);

                }
                else{
                    map.get(state).put(city,1);
                }
            }
            else{
                TreeMap<String,Integer> temp=new TreeMap<>();
                temp.put(city,1);
                map.put(state,temp);
            }
        }
        System.out.println("Number of entries in city/state wise:");
        for(Map.Entry<String,TreeMap<String,Integer>> xx:map.entrySet()){
            System.out.println("\nState:"+xx.getKey());
            for(Map.Entry<String,Integer> xxx:xx.getValue().entrySet()){
                System.out.println("City:"+xxx.getKey()+" Count:"+xxx.getValue());
            }
        }
    }
}

