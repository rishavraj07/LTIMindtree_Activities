package LTIM_Week5.Day2_HashMap;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class Q9 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer,String> map=new TreeMap<>();
        System.out.println("Enter the number of players");
        int noOfPlayer=Integer.parseInt(br.readLine());
        for(int i=0; i<noOfPlayer; i++){
            System.out.println("Enter the details of the player "+(i+1));
            int capNo=Integer.parseInt(br.readLine());
            String playerName=br.readLine();String teamName=br.readLine();String specificationName=br.readLine();
            String value=playerName+"--"+teamName+"--"+specificationName;
            map.put(capNo,value);
        }
        System.out.println("Player Details");
        for(Map.Entry<Integer,String> xx:map.entrySet()){
            System.out.println(xx.getKey()+"--"+xx.getValue());
        }

    }
}

