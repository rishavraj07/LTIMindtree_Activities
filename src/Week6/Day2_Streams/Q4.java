package Week6.Day2_Streams;
import java.util.*;
import java.io.*;

class Employee{
    private String name;
    private Double salary;

    public Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }
    String getName(){
        return this.name;
    }
    Double getSalary(){
        return this.salary;
    }
    @Override
    public String toString() {
        String s=String.format("%-15s%-15s\n",this.getName(),this.getSalary());
        return s;
    }
}
public class Q4 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("./input.txt"));
        List<Employee> list=new ArrayList<>();
        String s;
        while(true){
            s=br.readLine();
            if(s==null){
                break;
            }
            String[] d=s.split(",");
            Employee e=new Employee(d[0],Double.valueOf(d[1]));
            list.add(e);
        }
        System.out.printf("%-15s%-15s\n","Name","Salary");
        list.stream().forEach(xx-> System.out.println(xx));

    }
}
