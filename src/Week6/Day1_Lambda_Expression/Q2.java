package Week6.Day1_Lambda_Expression;

import java.io.*;
import java.util.*;
class ItemType{
    private String name;
    private Double costPerDay;
    private Double deposit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public ItemType(String name, Double costPerDay, Double deposit) {
        this.name = name;
        this.costPerDay = costPerDay;
        this.deposit = deposit;
    }
    public ItemType(){}

}

public class Q2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<ItemType> list=new ArrayList<>();
        for(int i=0; i<n; i++){
            String[] d=br.readLine().split(",");
            ItemType it=new ItemType(d[0],Double.valueOf(d[1]),Double.valueOf(d[2]));
            list.add(it);
        }
        Collections.sort(list,(o1,o2)->o1.getName().compareTo(o2.getName()));
        System.out.printf("%-10s %-10s %s\n","Name","Cost","Deposit");
        for(ItemType xx:list){
            System.out.printf("%-10s %-10s %s\n",xx.getName(),xx.getCostPerDay(),xx.getDeposit());
        }

    }
}