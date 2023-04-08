package LTIM_Week5.Day2_HashMap;


import java.io.*;
import java.util.*;

public class Q2 {
    public static void findPass(HashMap<Integer,Integer> map){
        for(Map.Entry<Integer,Integer> xx:map.entrySet()){
            if(xx.getValue()>75){
                System.out.println(xx.getKey());
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=sc.nextInt();sc.nextLine();
        for(int i=0; i<n; i++){
            int id=sc.nextInt();sc.nextLine();
            int mark=sc.nextInt();
            map.put(id,mark);
        }
        findPass(map);

    }
}

