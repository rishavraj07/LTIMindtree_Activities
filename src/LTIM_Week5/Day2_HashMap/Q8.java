package LTIM_Week5.Day2_HashMap;

import java.util.*;
public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of events:");
        int n = sc.nextInt();
        sc.nextLine();

        Map<Integer,Integer> map = new TreeMap<>();
        System.out.println("Enter event details in CSV(Customer Name,Ticket Price,No of Seats Booked)");
        for(int i=0;i<n;i++){
            String [] arr =  sc.nextLine().split(",");
            if(map.containsKey(Integer.valueOf(arr[1]))){
                int value = map.get(Integer.valueOf(arr[1]));
                map.put(Integer.valueOf(arr[1]),value+Integer.valueOf(arr[2]));
            }else
                map.put(Integer.valueOf(arr[1]),Integer.valueOf(arr[2]));
        }
        System.out.println(String.format("%-15s %s","Ticket Price","Tickets Booked"));
        for(Map.Entry<Integer,Integer> em : map.entrySet()){
            System.out.println((String.format("%-15s %s",em.getKey(),em.getValue())));
        }
    }
}
