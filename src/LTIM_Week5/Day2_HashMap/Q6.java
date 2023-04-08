package LTIM_Week5.Day2_HashMap;

import java.io.*;
import java.util.*;

class Address{
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private int pincode;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    public Address(){}
    public Address(String addressLine1,String addressLine2,String city,String state,int pincode){
        this.addressLine1=addressLine1;
        this.addressLine2=addressLine2;
        this.city=city;
        this.state=state;
        this.pincode=pincode;
    }
    public void generateCityAddressMap(HashMap<String,ArrayList<Address>> cityAddressMap,Address address){
        String key=address.getCity();
        ArrayList<Address> arrayList=new ArrayList<>();
        if(cityAddressMap.containsKey(key)){
            cityAddressMap.get(key).add(address);
        }
        else{
            arrayList.add(address);
            cityAddressMap.put(key,arrayList);
        }
    }
}
public class Q6 {
    public static void main(String[] args)throws IOException{
        HashMap<String,ArrayList<Address>> h=new HashMap<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of address");
        int n=Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            System.out.println("Enter the address "+(i+1)+" detail");
            String[] d=br.readLine().split(",");
            Address a=new Address(d[0],d[1],d[2],d[3],Integer.parseInt(d[4]));
            a.generateCityAddressMap(h,a);
        }
        System.out.println("Enter the city to be searched");
        String citySearch=br.readLine();
        if(h.containsKey(citySearch)){
            System.out.printf("%-15s%-15s%-15s%-15s%-15s\n","Line 1","Line 2","City","State","Pincode");
            for(Address a:h.get(citySearch)){
                System.out.printf("%-15s%-15s%-15s%-15s%-15s\n",a.getAddressLine1(),a.getAddressLine2(),a.getCity(),a.getState(),a.getPincode());
            }
        }else{
            System.out.println("Searched city not found");
        }

    }
}

