package Week6.Day5_Exception_Handling;
import java.io.*;
import java.util.*;
class SeatNotAvailableException extends Exception{
    public SeatNotAvailableException(String msg){
        super(msg);
    }
}
public class Q6 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows and columns of the show:");
        int n=Integer.parseInt(br.readLine());
        int[][] mat=new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(mat[i], 0);
        }

        System.out.println("Enter the number of seats to be booked:");
        int noOfSeat=Integer.parseInt(br.readLine());
        for(int i=0; i<noOfSeat; i++){
            System.out.println("Enter the seat number "+(i+1));
            int num=Integer.parseInt(br.readLine());
            try{
                try {
                    if (mat[num / n][num % n] == 1) {
                        throw new SeatNotAvailableException("Already Booked");
                    }else{mat[num/n][num%n]=1;}
                }catch (SeatNotAvailableException s){
                    System.out.println("SeatNotAvailableException: "+s.getMessage());
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("java.lang.ArrayIndexOutOfBoundsException: "+num);
                break;
            }
        }
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
