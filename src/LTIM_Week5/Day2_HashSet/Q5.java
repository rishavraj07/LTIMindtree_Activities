package LTIM_Week5.Day2_HashSet;

import java.io.*;
import java.util.*;

public class Q5 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Set<String> set=new LinkedHashSet<>();
        System.out.println("Enter number of colleges");
        int noOfColleges=Integer.parseInt(br.readLine());
        System.out.println("Enter the college details one by one");
        for(int i=0; i<noOfColleges; i++){
            String s=br.readLine();
            set.add(s);
        }
        System.out.println("Enter number of colleges to be displayed");
        int toDisplay=Integer.parseInt(br.readLine());
        if(toDisplay<=set.size()) {
            System.out.println("First " + toDisplay + " college details");
            int j=0;
            for(String it:set){
                System.out.println(it);
                if((++j) == toDisplay){
                    break;
                }

            }
            System.out.println("Enter the collage code to search :");
            String toSearch=br.readLine();
            int match=0;
            for(String it:set){
                String[] arr=it.split("-");
                if(toSearch.equals(arr[0])){
                    match=1;
                    System.out.println("Entered college code is found");
                }
            }
            if(match ==0){
                System.out.println("Entered college code is not found");
            }
        }else{
            System.out.println("Invalid");
        }



    }
}

