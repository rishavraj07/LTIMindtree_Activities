package LTIM_Week5.Day1_Introduction_to_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of participants to be registered :");
        int noOfParticipant=Integer.parseInt(br.readLine());
        ArrayList<String> list=new ArrayList<>();
        System.out.println("Enter the participants details");
        for(int i=0; i<noOfParticipant; i++){
            String in=br.readLine();
            String[] d=in.split("_");
            String depName=d[1];String rollNo=d[2];
            if((depName.equals("ECE")|| depName.equals("IT")|| depName.equals("CSE")) && rollNo.length()==7){
                list.add(in);
            }
        }

        if(list.isEmpty()){
            System.out.println("No valid participants");
        }else {
            System.out.println("List of valid participants");
        }
        for(String it:list){
            System.out.println(it);
        }

    }
}

