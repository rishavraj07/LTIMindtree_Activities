package LTIM_Week5.Day2_HashMap;

import java.io.*;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0; i<n; i++){
            int key=sc.nextInt();sc.nextLine();
            int value=sc.nextInt();
            mp.put(key,value);
        }
        int total=0;
        for(Map.Entry<Integer,Integer> xx:mp.entrySet()){
            if(xx.getKey()%2==0){
                total +=xx.getValue();
            }
        }
        System.out.println(total);

    }
}

