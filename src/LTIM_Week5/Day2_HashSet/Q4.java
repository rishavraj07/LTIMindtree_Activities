package LTIM_Week5.Day2_HashSet;

import java.io.*;
import java.util.*;
class User implements Comparable<User>{
    private String username;
    private String bankname;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(bankname, user.bankname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, bankname);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }
    public User(){}
    public User(String username,String bankname){
        this.bankname=bankname;
        this.username=username;
    }


    @Override
    public int compareTo(User o) {
        return this.username.compareTo(o.username);
    }
}
public class Q4 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> user1 =new TreeSet<String>();
        TreeSet<User> users=new TreeSet<User>();
        TreeSet<String> user2=new TreeSet<String>();
        System.out.println("Enter number of users:");
        int noOfUsers=Integer.parseInt(br.readLine());
        for(int i=0; i<noOfUsers; i++){
            System.out.println("Enter details of user "+(i+1));
            System.out.println("Username:");
            String userName=br.readLine();
            user1.add(userName);
            System.out.println("Bank name:");
            String bankName=br.readLine();
            User u=new User(userName,bankName);
            users.add(u);
        }
        System.out.println("Enter username(Expire in one month) seperated by comma");
        String userExpire=br.readLine();
        String[] d=userExpire.split(",");
        TreeSet<User> users2=new TreeSet<User>();
        for(String x:d){
            User temp=new User(x,null);
            users2.add(temp);
        }
        users.retainAll(users2);
        System.out.println("Users going to expire within a month");
        int us=1;
        for(User ex:users){
            System.out.println("User "+(us++));
            System.out.println("User Name = "+ex.getUsername());
            System.out.println("Bank Name = "+ex.getBankname());
        }
    }
}

