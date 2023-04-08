package Week6.Day2_Streams;

import java.io.*;
import java.util.*;
class Expenses{
    private String expenseType;
    private Double cost;

    public Expenses(String expenseType, Double cost){
        this.expenseType=expenseType;
        this.cost=cost;
    }
    String getExpenseType(){
        return this.expenseType;
    }
    Double getCost(){
        return this.cost;
    }
}


public class Q3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        List<Expenses> list=new ArrayList<>();
        System.out.println("Enter expense for food");
        Expenses food=new Expenses("food",Double.valueOf(br.readLine()));
        list.add(food);

        System.out.println("Enter expense for rent");
        Expenses rent=new Expenses("rent",Double.valueOf(br.readLine()));
        list.add(rent);

        System.out.println("Enter expense for shopping");
        Expenses shopping=new Expenses("shopping",Double.valueOf(br.readLine()));
        list.add(shopping);

        System.out.println("Enter expense for groceries");
        Expenses groceries=new Expenses("groceries",Double.valueOf(br.readLine()));
        list.add(groceries);

        System.out.println("Enter expense for electricity");
        Expenses electricity=new Expenses("electricity",Double.valueOf(br.readLine()));
        list.add(electricity);

        System.out.println("Enter salary");
        Double salary=Double.parseDouble(br.readLine());
        Double reduceSum = list.stream().map(e -> e.getCost()).mapToDouble(i->i).reduce(0, (a, b) -> a + b);
        if(reduceSum>salary){
            System.out.println("Expenses exceeds Salary");
        }else{
            System.out.printf("Savings amount will be Rs.%.1f\n",Double.valueOf(salary-reduceSum));
        }


    }
}
