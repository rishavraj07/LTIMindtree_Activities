package Week6.Day5_Exception_Handling;
import java.util.*;
class ItemType{
    String name;
    Double deposit;
    Double costPerDay;

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

    public ItemType(String name, Double deposit, Double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }
    public ItemType(){}
    @Override
    public String toString(){
        String s=String.format("The details of the item type are:\nName:"+this.getName()+"\nDeposit:"+this.getDeposit()+"\nCost Per Day:"+this.getCostPerDay());
        return s;
    }
}
public class Q3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Item type details:");
        String name;
        Double deposit=null;
        Double costPerDay=null;
        try {
            System.out.println("Enter the name:");
            name = sc.nextLine();
            System.out.println("Enter the deposit:");
            deposit = Double.parseDouble(sc.nextLine());
            System.out.println("Enter the cost per day:");
            costPerDay = Double.parseDouble(sc.nextLine());
            ItemType it=new ItemType(name,deposit,costPerDay);
            System.out.println(it.toString());
        }catch (NumberFormatException e){
            System.out.println(e);
        }

    }
}
