package LTIM_Week5.Day1_Introduction_to_List;


import java.io.*;
import java.util.*;

public class Q9 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list=new ArrayList<>();
        System.out.println("Enter the number of passengers Booked");
        int noOf=Integer.parseInt(br.readLine());
        System.out.println("Enter the passenger's name who Booked");
        for(int i=0; i<noOf; i++){
            String x=br.readLine();
            list.add(x);
        }
        System.out.println("Enter the number of seats available");
        int seat=Integer.parseInt(br.readLine());
        ArrayList<String> ans=new ArrayList<>();
        for(int j=seat; j<noOf; j++){
            ans.add(list.get(j));
        }
        System.out.println("Extra Passengers list");
        System.out.println(ans);
    }
}

