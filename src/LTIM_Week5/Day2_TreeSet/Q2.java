package LTIM_Week5.Day2_TreeSet;

import java.io.*;
import java.util.*;
class NumberSet{
    private HashSet<Integer> numberSet;
    public NumberSet(){
        numberSet=new HashSet<>();
    }

    public HashSet<Integer> getNumberSet() {
        return numberSet;
    }

    public void insertElement(int elment){
        numberSet.add(elment);
    }
    public TreeSet<Integer> getSumDigits(){
        TreeSet<Integer> ans=new TreeSet<>();
        for(Integer i:this.getNumberSet()){
            int sum=0;
            while(i>0){
                int rem=i%10;
                sum=sum+rem;
                i=i/10;
            }
            ans.add(sum);
        }
        return ans;
    }
}
public class Q2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of integers:");
        int noOfInteger=Integer.parseInt(br.readLine());
        NumberSet ns=new NumberSet();
        for(int i=0; i<noOfInteger; i++){
            int n=Integer.parseInt(br.readLine());
            ns.insertElement(n);
        }
        System.out.println("Unique digit sum");
        TreeSet<Integer> res=ns.getSumDigits();
        for(Integer it:res){
            System.out.println(it);
        }

    }
}
