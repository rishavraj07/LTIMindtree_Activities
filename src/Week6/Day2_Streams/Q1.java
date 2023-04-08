package Week6.Day2_Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Ticketbooking{
    private String customerName;
    private Integer noOfTickets;
    private Double price;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getNoOfTickets() {
        return noOfTickets;
    }

    public void setNoOfTickets(Integer noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Ticketbooking(String customerName, Integer noOfTickets, Double price) {
        this.customerName = customerName;
        this.noOfTickets = noOfTickets;
        this.price = price;
    }

    @Override
    public String toString() {
        String s=String.format("%-10s %-15s %-15s\n",this.getCustomerName(),this.getNoOfTickets(),this.getPrice());
        return s;
    }
}
public class Q1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of bookings");
        int n=Integer.parseInt(br.readLine());
        ArrayList<Ticketbooking> arrayList=new ArrayList<>();
        for(int i=0; i<n; i++){
            System.out.println("Enter customer name");
            String name=br.readLine();
            System.out.println("Enter no of tickets");
            Integer noOfTickets=Integer.parseInt(br.readLine());
            System.out.println("Enter the price");
            Double price=Double.parseDouble(br.readLine());
            Ticketbooking tb=new Ticketbooking(name,noOfTickets,price);
            arrayList.add(tb);
        }
        System.out.printf("%-10s %-15s %-15s\n", "Customer", "No Of Tickets", "Price");
        arrayList.stream().sorted((o1,o2)->o1.getPrice().compareTo(o2.getPrice())).forEach(xx-> System.out.print(xx));


    }

}
