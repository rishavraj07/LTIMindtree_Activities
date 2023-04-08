package LTIM_Week5.Day2_HashMap;

import java.util.*;
import java.io.*;

public class Q5{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String ch,ch2;
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        do{
            ArrayList<String> arrayList=new ArrayList<>();
            System.out.println("Enter the player name");
            String playerName=br.readLine();
            System.out.println("Enter wickets - seperated by \"|\" symbol ");
            String wicket=br.readLine();
            String[] d=wicket.split("\\|");
            for(String xx:d){
                arrayList.add(xx);
            }
            map.put(playerName,arrayList);
            System.out.println("Do you want to add another player(yes/no)");
            ch=br.readLine();
        }while(ch.equals("yes"));

        do {
            System.out.println("Enter the player name to search");
            String search = br.readLine();
            if (map.containsKey(search)) {
                System.out.println("Player Name : "+search);
                System.out.println("Wickets :");
                for(String xx:map.get(search)){
                    System.out.println(xx);
                }

            } else {
                System.out.println("No player found with the name " + search);
            }
            System.out.println("Do you want to search another player (yes/no)");
            ch2 = br.readLine();
        }while(ch2.equals("yes"));

    }
}

