package LTIM_Week5.Day4_Generics;

import java.io.*;
import java.util.*;
class Contact<T1,U1>{
    private T1 _att1;
    private U1 _att2;

    public T1 get_att1() {
        return _att1;
    }

    public void set_att1(T1 _att1) {
        this._att1 = _att1;
    }

    public U1 get_att2() {
        return _att2;
    }

    public void set_att2(U1 _att2) {
        this._att2 = _att2;
    }

    public Contact(T1 _att1, U1 _att2) {
        this._att1 = _att1;
        this._att2 = _att2;
    }
    public Contact(){}
    public void print(){
        if(String.valueOf(this.get_att1()).substring(0,2).equals("91")){
            System.out.println(this.get_att1());
        }

    }
}
public class Q3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of details");
        Integer noOfDetails=Integer.valueOf(br.readLine());
        ArrayList<Contact<String, String>> list=new ArrayList<>();
        System.out.println("Enter contact details");

        for(int i=0; i<noOfDetails; i++){
            String[] d=br.readLine().split(",");
            String pri=d[0];
            String sec=String.valueOf(d[1]);
            Contact<String ,String> contact=new Contact<String, String>(pri,sec);
            list.add(contact);
        }
        System.out.println("List of contact numbers");
        for(Contact xx:list){
            xx.print();
        }

    }
}

