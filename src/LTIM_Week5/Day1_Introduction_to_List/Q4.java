package LTIM_Week5.Day1_Introduction_to_List;

import java.io.*;
import java.util.*;


class Hall{
    String name;
    String contactNumber;
    Double costPerDay;
    String ownerName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

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
    public Hall(String name,String contactNumber,Double costPerDay,String ownerName){
        this.name=name;
        this.contactNumber=contactNumber;
        this.costPerDay=costPerDay;
        this.ownerName=ownerName;
    }
    public Hall(){}
}
class HallBO{
    List<Hall> list=new ArrayList<>();
    Hall h1=new Hall("SPK hall","12345",10000.0,"John");
    Hall h2=new Hall("DRG hall","67890",15000.0,"Joe");
    Hall h3=new Hall("EFG hall","45678",20000.0,"Jack");
    public HallBO() {
        list.add(h1);
        list.add(h2);
        list.add(h3);
    }
    public void add(Hall hall){
        list.add(hall);
        System.out.println("Hall added successfully");
    }
    public void set(Hall h,int i){
        list.set(i,h);
        System.out.println("Hall replaced successfully");
    }

    public List<Hall> getHallList(){
        return list;
    }
    public void displayAll(){
        System.out.printf("%-20s%-20s%-20s%-20s\n","Name","Contact Number","Cost per Day","Owner Name");
        for(int i=0; i<this.getHallList().size(); i++) {
            System.out.printf("%-20s%-20s%-20s%-20s\n",list.get(i).getName(),list.get(i).getContactNumber(),list.get(i).getCostPerDay(),list.get(i).getOwnerName() );
        }
    }

}
public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        HallBO hbo=new HallBO();
        while(true) {
            System.out.println("Enter an option:\n" +
                    "1.Add\n" +
                    "2.Replace\n" +
                    "3.Display\n" +
                    "4.Exit");
            int choice = Integer.parseInt(br.readLine());
            if (choice == 1) {
                System.out.println("Enter the name of the hall:");
                String hallName = br.readLine();
                System.out.println("Enter the contact number of the hall:");
                String contactNo = br.readLine();
                System.out.println("Enter the cost per day of the hall:");
                Double costPerDay = Double.parseDouble(br.readLine());
                System.out.println("Enter the owner name of the hall:");
                String ownerName = br.readLine();
                Hall h = new Hall(hallName, contactNo, costPerDay, ownerName);
                hbo.add(h);

            }
            else if(choice ==2){
                System.out.println("Enter the hall number which should be replaced:");
                int ind=Integer.parseInt(br.readLine());
                System.out.println("Enter the name of the replacement hall:");
                String hallName = br.readLine();
                System.out.println("Enter the contact number of the replacement hall:");
                String contactNo = br.readLine();
                System.out.println("Enter the cost per day of the replacement hall:");
                Double costPerDay = Double.parseDouble(br.readLine());
                System.out.println("Enter the owner name of the replacement hall:");
                String ownerName = br.readLine();
                Hall h = new Hall(hallName, contactNo, costPerDay, ownerName);
                hbo.set(h,ind-1);
            }
            else if(choice ==3){
                hbo.displayAll();
            }else{
                System.out.println("Exiting Application");
                break;
            }
        }

    }
}
