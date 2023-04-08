package LTIM_Week5.Day2_HashMap;

import java.io.*;
import java.util.*;

public class Q10 {
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
        System.out.println("Enter the cap number of the player to be searched");
        int toBeSearch=Integer.parseInt(br.readLine());
        if(map.containsKey(toBeSearch)){
            System.out.println("Player Details");
            System.out.println(map.get(toBeSearch));
        }else{
            System.out.println("Player not found");
        }

    }
}

