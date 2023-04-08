package LTIM_Week5.Day2_HashMap;

import java.io.*;
import java.util.*;
class CallLog{
    String email;
    String numberCalled;
    String startTime;
    String endTime;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberCalled() {
        return numberCalled;
    }

    public void setNumberCalled(String numberCalled) {
        this.numberCalled = numberCalled;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public CallLog(){}
    public CallLog(String email,String numberCalled,String startTime,String endTime){
        this.email=email;
        this.numberCalled=numberCalled;
        this.startTime=startTime;
        this.endTime=endTime;
    }
}
public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("./input.txt"));
        String s;
        TreeMap<String,ArrayList<CallLog>> map=new TreeMap<>();
        while(true){
            s=br.readLine();
            if(s == null){
                break;
            }
            String[] d = s.split(",");
            String email = d[0];String numberCalled = d[1];String startTime = d[2];String endTime = d[3];
            CallLog cl = new CallLog(email, numberCalled, startTime, endTime);
            ArrayList<CallLog> l=new ArrayList<>();
            if(map.containsKey(email)){
                map.get(email).add(cl);
            }else {
                l.add(cl);
                map.put(email, l);
            }
        }


        for(Map.Entry<String,ArrayList<CallLog>> xx:map.entrySet()){
            System.out.println("Calls made by "+xx.getKey()+" :");
            for(CallLog ss:xx.getValue()){
                System.out.println("Number Called : "+ss.getNumberCalled()+" Call Time: "+ss.getStartTime());
            }
        }

    }
}

