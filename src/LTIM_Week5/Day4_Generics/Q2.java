package LTIM_Week5.Day4_Generics;

import java.io.*;
import java.util.*;
class Box<T1,T2,T3>{
    T1 length;
    T2 width;
    T3 depth;
    public Box(){}
    public Box(T1 length,T2 width,T3 depth){
        this.length=length;
        this.width=width;
        this.depth=depth;
    }
    public void print(){
        System.out.println("Length : "+this.length);
        System.out.println("Width : "+this.width);
        System.out.println("Depth : "+this.depth);
    }

}
public class Q2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the values for length,width and depth :");
        Integer l=Integer.parseInt(br.readLine());
        Integer w=Integer.parseInt(br.readLine());
        Integer d=Integer.parseInt(br.readLine());
        Box<Integer,Integer,Integer> box=new Box<>(l,w,d);
        box.print();



    }
}

