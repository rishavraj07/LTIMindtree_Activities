package LTIM_Week5.Day2_HashSet;


import java.io.*;
import java.util.*;
public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Set<String> set=new HashSet<>();
        String ch;
        do{
            System.out.println("Enter Username");
            String userName=br.readLine();
            set.add(userName);
            System.out.println("Do you want to continue?(yes/no)");
            ch=br.readLine();
        }while(ch.equals("yes"));
        System.out.println("Number of Users = "+set.size());

    }
}

