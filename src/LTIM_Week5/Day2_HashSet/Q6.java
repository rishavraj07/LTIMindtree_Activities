package LTIM_Week5.Day2_HashSet;

import java.io.*;
import java.util.*;

public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of values in list 1");
        int n1=Integer.parseInt(br.readLine());
        TreeSet<Integer> set1=new TreeSet<Integer>();
        System.out.println("Enter the values");
        for(int i=0; i<n1; i++){
            int val=Integer.parseInt(br.readLine());
            set1.add(val);
        }

        System.out.println("Enter the number of values in list 2");
        int n2=Integer.parseInt(br.readLine());
        TreeSet<Integer> set2=new TreeSet<Integer>();
        System.out.println("Enter the values");
        for(int i=0; i<n2; i++){
            int val=Integer.parseInt(br.readLine());
            set2.add(val);
        }
        System.out.println("Set 1");
        Iterator it1=set1.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println("Set 2");
        Iterator it2=set2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println("Union");
        set1.addAll(set2);
        for(Integer x:set1){
            System.out.println(x);
        }

    }
}

