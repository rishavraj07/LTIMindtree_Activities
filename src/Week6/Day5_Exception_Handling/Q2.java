package Week6.Day5_Exception_Handling;

import java.util.*;
public class Q2 {

    public static void main(String[] args) {
        // your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer input");
        try {
            int in = sc.nextInt();
            System.out.println("Entered value is "+in);
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }

    }

}

