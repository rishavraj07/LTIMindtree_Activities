package LTIM_Week5.Day1_Introduction_to_List;

import java.io.*;
import java.util.*;

class Customer{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNO() {
        return phoneNO;
    }

    public void setPhoneNO(String phoneNO) {
        this.phoneNO = phoneNO;
    }

    String email;
    String phoneNO;
    public Customer(String name,String email,String phoneNO){
        this.name=name;
        this.email=email;
        this.phoneNO=phoneNO;
    }
}
public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("./input.txt"));
        String s;
        LinkedList<Customer> stk=new LinkedList<>();
        while(true){
            s=br.readLine();
            if(s == null){
                break;
            }
            String[] d=s.split(",");
            String name=d[0];
            String email=d[1];
            String phoneNo=d[2];
            Customer c1=new Customer(name,email,phoneNo);
            stk.push(c1);
        }
        if(stk.size()>0){
            System.out.println("--------------------------------------------------------------------------------------\n" +
                    "Customer Name        Email                Phone Number        \n" +
                    "--------------------------------------------------------------------------------------");
        }
        while(!stk.isEmpty()){
            Customer top=stk.peek();
            System.out.printf("%-20s %-20s %-20s\n",top.getName(),top.getEmail(),top.getPhoneNO());
            stk.pop();
        }
        System.out.println("--------------------------------------------------------------------------------------");



    }
}

