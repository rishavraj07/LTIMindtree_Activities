package LTIM_Week5.Day2_HashSet;

import java.io.*;
import java.util.*;

public class Q3{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Set<String> set=new HashSet<>();
        String ch;
        do{
            System.out.println("Enter Email address");
            String eMail=br.readLine();
            set.add(eMail);
            System.out.println("Do you want to Continue?(yes/no)");
            ch=br.readLine();
        }while(ch.equals("yes"));
        System.out.println("Enter the email addresses to be searched separated by comma");
        String in=br.readLine();
        String[] d=in.split(",");
        Set<String> search=new HashSet<>();
        for(String it:d){
            search.add(it);
        }
        if(set.containsAll(search)){
            System.out.println("Email addresses are present");
        }else{
            System.out.println("Email addresses are not present");
        }

    }
}

