package Week6.Day1_Lambda_Expression;
import java.io.*;
import java.util.*;
class User implements Comparable<User>{
    private String name;
    private String mobileNumber;
    private String username;
    private String password;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this .name;
    }
    public void setMobileNumber(String mobileNumber){
        this.mobileNumber=mobileNumber;
    }
    public String getMobileNumber(){
        return this.mobileNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, String mobileNumber, String username, String password) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.username = username;
        this.password = password;
    }
    public User(){}
    @Override
    public String toString(){
        String s=String.format("%-15s%-15s\n",this.getName(),this.getMobileNumber());
        return s;
    }

    @Override
    public int compareTo(User that) {
        return this.getName().compareTo(that.getName());
    }
}
public class Q3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of users:");
        int n=Integer.parseInt(br.readLine());
        ArrayList<User> list=new ArrayList<>();
        for(int i=0; i<n; i++){
            System.out.println("Enter the details of User "+(i+1));
            String[] d=br.readLine().split(",");
            User u=new User(d[0],d[1],d[2],d[3]);
            list.add(u);
        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.printf("%-15s%-15s\n","Name","Mobile number");
        for(User xx:list){
            System.out.print(xx);
        }

    }
}
