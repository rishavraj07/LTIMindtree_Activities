package LTIM_Week5.Day3_Comparator;

import java.io.*;
import java.util.*;

public class Q4 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of passengers");
        int noOfPassengers=Integer.parseInt(br.readLine());
        Map<String,Integer> map=new HashMap<>();
        for(int i=1; i<=noOfPassengers; i++){
            System.out.println("Enter the name of the passenger "+i);
            String name=br.readLine();
            System.out.println("Enter the age of the passenger "+i);
            Integer age=Integer.parseInt(br.readLine());
            map.put(name,age);
        }
        Set<Map.Entry<String,Integer>> set=map.entrySet();
        List<Map.Entry<String,Integer>> list=new ArrayList<>(set);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o2.getValue().compareTo(o1.getValue())==0){
                    return o2.getKey().compareTo(o1.getKey());
                }
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println("Passengers Details by age(High to Low)");
        int elm=1;
        for(Map.Entry<String,Integer> xx:list){
            System.out.println(elm+" "+xx.getKey()+" "+xx.getValue());
            elm++;
        }
    }
}

