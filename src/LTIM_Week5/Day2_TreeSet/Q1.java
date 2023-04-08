package LTIM_Week5.Day2_TreeSet;

import java.io.*;
import java.util.*;
class Expense implements Comparable<Expense>{
    String expenseCategory;
    int amount;

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(String expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Expense(){}
    public Expense(String expenseCategory,int amount){
        this.amount=amount;
        this.expenseCategory=expenseCategory;
    }
    @Override
    public int compareTo(Expense that) {
        return that.amount - this.getAmount();
    }
}
public class Q1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String choice;
        TreeSet<Expense> treeSet=new TreeSet<>();
        do {
            System.out.println("Enter expense category");
            String expenseCategory = br.readLine();
            System.out.println("Enter expense amount");
            int amount = Integer.parseInt(br.readLine());
            Expense e = new Expense(expenseCategory, amount);
            treeSet.add(e);
            System.out.println("Do you want to continue(yes/no):");
            choice=br.readLine();
        }while(choice.equals("yes"));
        System.out.println("Top spending categories");
        System.out.printf("%-15s%-15s\n","Category", "Amount");
        int total=0;
        for(Expense ex:treeSet){
            total +=ex.getAmount();
            System.out.printf("%-15s%-15s\n",ex.getExpenseCategory(),ex.getAmount());
        }
        System.out.println("Total amount spent: "+total);




    }
}

