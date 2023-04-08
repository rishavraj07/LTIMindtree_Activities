package LTIM_Week5.Day3_Comparator;

import java.io.*;
import java.util.*;
class Hall implements Comparable<Hall>{
    private String name;
    private String contactnumber;
    private Double costPerDay;
    private String ownerName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    @Override
    public String toString() {
        String s=String.format("%-15s%-15s%-15s%-15s",this.getName(),this.getContactnumber(),this.getCostPerDay(),this.getOwnerName());
        return s;
    }

    public Hall(String name, String contactnumber, Double costPerDay, String ownerName) {
        this.name = name;
        this.contactnumber = contactnumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }
    public Hall(){}

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public int compareTo(Hall o) {
        return this.getCostPerDay().compareTo(o.getCostPerDay());
    }
}
public class Q5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of halls:");
        int noOfHalls=Integer.parseInt(br.readLine());
        List<Hall> list=new ArrayList<>();
        for(int i=1; i<=noOfHalls; i++){
            System.out.println("Enter the details of hall "+i);
            String[] d=br.readLine().split(",");
            Hall h=new Hall(d[0],d[1],Double.valueOf(d[2]),d[3]);
            list.add(h);
        }
        Collections.sort(list);
        System.out.println("Sorted Order (from the least expensive to the most):");
        System.out.printf("%-15s%-15s%-15s%-15s\n","Name","Contact number","Cost per day","Owner name");
        for(Hall xx:list){
            System.out.println(xx);
        }


    }
}

