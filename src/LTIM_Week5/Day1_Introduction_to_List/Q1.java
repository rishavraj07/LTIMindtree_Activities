package LTIM_Week5.Day1_Introduction_to_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        List<String> list=new ArrayList<String>();
        int i=1;
        char choice;
        do{
            System.out.println("Enter the username "+i);
            i++;
            String username=br.readLine();
            list.add(username);
            System.out.println("Do you want to continue?(y/n)");
            choice = (char)br.read();br.readLine();


        }while(choice == 'y');
        System.out.println("The Names entered are:");
        for(int j=0 ;j<list.size(); j++){
            System.out.println(list.get(j));
        }
    }
}

