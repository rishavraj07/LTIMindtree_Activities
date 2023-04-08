package LTIM_Week5.Day2_HashSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Q1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Set<String> set=new HashSet<>();
        char ch;
        do{
            System.out.println("Enter the username");
            String userName=br.readLine();
            set.add(userName);
            System.out.println("Do you want to continue?(Y/N)");
            ch=(char)br.read();br.readLine();

        }while(ch == 'Y');
        System.out.println("The unique number of usernames is "+set.size());

    }
}

