package LTIM_Week5.Day3_Comparator;


import java.io.*;
import java.util.*;

class Address implements Comparable<Address>{
    private String username;
    private String addressLine1;
    private String addressLine2;
    private Integer pinCode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public Address(String username, String addressLine1, String addressLine2, Integer pinCode) {
        this.username = username;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.pinCode = pinCode;
    }

    @Override
    public int compareTo(Address o) {
        if(this.getPinCode().compareTo(o.getPinCode())==0)
            return this.getAddressLine1().compareTo(o.getAddressLine1());

        return this.getPinCode().compareTo(o.getPinCode());
    }
}
public class Q6 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        List<Address> list=new ArrayList<>();
        System.out.println("Enter the number of users:");
        int noOfUser=Integer.parseInt(br.readLine());
        System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");
        for(int i=0; i<noOfUser; i++){
            String[] d=br.readLine().split(",");
            Address a=new Address(d[0],d[1],d[2],Integer.valueOf(d[3]));
            list.add(a);
        }
        Collections.sort(list);
        System.out.println("User Details:");
        for(Address xx:list){
            System.out.println(xx.getUsername()+","+xx.getAddressLine1()+","+xx.getAddressLine2()+","+xx.getPinCode());
        }

    }
}

