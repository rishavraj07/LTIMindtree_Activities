package Week6.Day5_Exception_Handling;
import java.util.*;


public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        System.out.println("Enter the number of seats to be booked:");
        int n=sc.nextInt();
        int flag=0;
        for(int i=0; i<n; i++){
            System.out.println("Enter the seat number "+(i+1));
            int seat=sc.nextInt();
            try{
                arr[seat-1]=1;
            }catch(ArrayIndexOutOfBoundsException e){
                flag=1;
                System.out.println("java.lang.ArrayIndexOutOfBoundsException: 100");
                break;
            }
        }
        if(flag == 0) {
            System.out.println("The seats booked are:");
            for (int j = 0; j < 100; j++) {
                if (arr[j] == 1)
                    System.out.println(j + 1);
            }
        }

    }
}
