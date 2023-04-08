package LTIM_Week5.Day4_Generics;

import java.io.*;
import java.util.*;

public class Q1 {
    public static <T> void sort(T[] arr){
        Arrays.sort(arr);
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n");
        Integer n=Integer.valueOf(br.readLine());
        System.out.println("Enter integers one by one");
        Integer[] arr=new Integer[n];
        for(int i=0;i <n; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Double[] arrd=new Double[n];
        System.out.println("Enter double values one by one");
        for(int i=0;i <n; i++){
            arrd[i]=Double.parseDouble(br.readLine());
        }
        sort(arr);
        sort(arrd);
        System.out.println("Printing Integer Array");
        for(int i=0;i <n; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Printing Double Array");
        for(int i=0;i <n; i++){
            System.out.println(arrd[i]);
        }

    }
}

