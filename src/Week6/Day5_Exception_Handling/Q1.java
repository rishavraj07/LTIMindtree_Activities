package Week6.Day5_Exception_Handling;

import java.util.*;
public class Q1 {

    public static void main(String[] args) {
        // your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost of the item for n days");
        int cost=sc.nextInt();
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        try {
            int costPerDay=cost/n;
            System.out.println("Cost per day of the item is "+costPerDay);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

    }

}

