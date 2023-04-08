package Week6.Day1_Lambda_Expression;
import java.io.*;
import java.util.*;
class Hall{
    private String name;
    private Double costPerDay;
    private String owner;

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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Hall(String name, Double costPerDay, String owner) {
        this.name = name;
        this.costPerDay = costPerDay;
        this.owner = owner;
    }
}
public class Q1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of halls:");
        Integer n=Integer.parseInt(br.readLine());
        List<Hall> list=new ArrayList<>();
        for(int i=0; i<n; i++){
            String[] d=br.readLine().split(",");
            Hall hall=new Hall(d[0],Double.valueOf(d[1]),d[2]);
            list.add(hall);
        }
        Collections.sort(list,(o1,o2)->o1.getOwner().compareTo(o2.getOwner()));
        System.out.printf("%-15s %-10s %s\n","Name","Cost","Owner");
        for(Hall xx:list){
            System.out.printf("%-15s %-10s %s\n",xx.getName(),xx.getCostPerDay(),xx.getOwner());
        }

    }
}
