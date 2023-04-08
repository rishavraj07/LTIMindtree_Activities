package LTIM_Week5.Day2_TreeSet;

import java.io.*;
import java.util.*;
class Detail implements Comparable<Detail>{
    private String name;
    private String flight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }
    public Detail(){}
    public Detail(String name,String flight){
        this.name=name;
        this.flight=flight;
    }

    @Override
    public int compareTo(Detail o) {
        if(this.getFlight().compareTo(o.getFlight()) == 0){
            return this.getName().compareTo(o.getName());
        }
        return this.getFlight().compareTo(o.getFlight());
    }
}
public class Q4 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        TreeSet<Detail> treeSet=new TreeSet<>();
        for(int i=0; i<n; i++){
            String s=br.readLine();
            String[] d=s.split("\\|");
            String name=d[1];String flight=d[0];
            Detail detail=new Detail(name,flight);
            treeSet.add(detail);
        }
        String previous="";
        System.out.println("Flights and Passengers in ascending order");
        for(Detail dd:treeSet){
            if(!previous.equals(dd.getFlight())){
                System.out.println(dd.getFlight());
            }
            System.out.println("--"+dd.getName());
            previous=dd.getFlight();
        }

    }
}

