package LTIM_Week5.Day1_Introduction_to_List;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of halls:");
        int n=Integer.parseInt(br.readLine());
        List<String> list=new ArrayList<String>();
        for(int i=1; i<=n; i++){
            System.out.println("Enter the Hall Name "+i);
            String in=br.readLine();
            list.add(in);
        }
        System.out.println("Enter the hall name to be searched:");
        String s=br.readLine();
        if(list.contains(s)){
            System.out.println(s+" hall is found in the list at position "+list.indexOf(s));

        }else{
            System.out.println(s+" hall is not found");
        }

    }
}

