package LTIM_Week5.Day1_Introduction_to_List;

import java.io.*;
import java.util.*;

class ItemType{
    private String name;
    private Double deposit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    @Override
    public String toString() {
        Formatter f=new Formatter();
        String ans=f.format("%-20s%-20s%-20s",this.getName(),this.getDeposit(),this.getCostPerDay()).toString();
        return ans;
    }

    private Double costPerDay;
    public ItemType(){}
    public ItemType(String name,Double deposit,Double costPerDay){
        this.name=name;
        this.deposit=deposit;
        this.costPerDay=costPerDay;
    }

}
public class Q3
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i=1;
        List<ItemType> list=new ArrayList<>();
        char choice;
        do{
            System.out.println("Enter the details of Item Type "+(i++));
            System.out.println("Name:");
            String name=br.readLine();
            System.out.println("Deposit:");
            Double deposit=Double.parseDouble(br.readLine());
            System.out.println("Cost per Day:");
            Double costPerDay=Double.parseDouble(br.readLine());
            ItemType it=new ItemType(name,deposit,costPerDay);
            list.add(it);
            System.out.println("Do you want to continue?(y/n)");
            choice=(char)br.read();br.readLine();
        }while(choice == 'y');
        Formatter f2=new Formatter();
        System.out.println(f2.format("%-20s%-20s%-20s","Name","Deposit","CostPerDay"));
        for(int j=0; j<list.size(); j++){
            System.out.println(list.get(j).toString());
        }

    }
}

