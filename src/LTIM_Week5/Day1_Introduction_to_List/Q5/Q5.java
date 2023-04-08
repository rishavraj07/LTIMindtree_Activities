package LTIM_Week5.Day1_Introduction_to_List.Q5;

import java.io.*;
import java.util.*;


class Hall{
    private String name;
    private String contactNumber;
    private Double costPerDay;
    private String ownerName;

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
    void display(){
        System.out.printf("%-20s%-20s%-20s%-20s\n",this.getName(),this.getContactNumber(),this.getCostPerDay(),this.getOwnerName());
    }
}

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        List<Hall> list=new ArrayList<>();
        char C;
        do{
            System.out.println("Action\n" +
                    "1.Add Hall\n" +
                    "2.Remove Hall\n" +
                    "Enter your choice");
            int choice = Integer.parseInt(br.readLine());
            int flag=0;
            if (choice == 1) {
                System.out.println("Enter the Hall details in CSV format");
                String details = br.readLine();
                String[] d = details.split(",");
                String hallName = d[0];
                String contact = d[1];
                Double cost = Double.parseDouble(d[2]);
                String owner = d[3];
                Hall h = new Hall(hallName, contact, cost, owner);
                list.add(h);

            }else if(choice ==2 && flag==1){
                System.out.println("The list is empty");
                break;
            }
            else if(choice == 2){
                if(!list.isEmpty()){
                    System.out.println("Enter the index of the hall to be removed");
                    int ind=Integer.parseInt(br.readLine());
                    if(ind<list.size()) {
                        list.remove(ind);
                        if(!list.isEmpty()) {
                            System.out.printf("%-20s%-20s%-20s%-20s\n", "Hall name", "Contact number", "Cost per day", "Owner name");
                            for (int i = 0; i < list.size(); i++) {
                                list.get(i).display();
                            }
                        }else{
                            System.out.println("No Hall details to display");
                        }
                    }
                    else{
                        System.out.println("Please enter a valid choice");
                        break;
                    }
                }
                else {
                    flag=1;
                    System.out.println("The list is empty");
                    break;
                }
            }
            else{
                System.out.println("Please enter a valid choice");
            }
            System.out.println("Do you want to continue?(Y/N)");
            C=(char)br.read();br.readLine();

        }while(C == 'Y');

    }
}

