package LTIM_Week5.Day3_Comparator;

import java.io.*;
import java.util.*;
class Role{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role(String name) {
        this.name = name;
    }

}
class User{
    private String name;
    private String username;
    private String password;
    private String email;
    private String mobileNumber;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(String name, String username, String password, String email, String mobileNumber, String address) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }
    public User(){}
}
class Customer extends User{
    private String customerId;
    private User user;
    public Customer(){}

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Customer(String name, String username, String password, String email, String mobileNumber, String address, String customerId, User user) {
        super(name, username, password, email, mobileNumber, address);
        this.customerId = customerId;
        this.user = user;
    }

    public Customer(String customerId, User user) {
        this.customerId = customerId;
        this.user = user;
    }
}
class AccountType{
    private String accountType;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public AccountType(String accountType) {
        this.accountType = accountType;
    }
    public AccountType(){}
}
class Account {
    private Integer id;
    private String accountNumber;
    private AccountType accountType;
    private Customer customer;

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) && Objects.equals(accountNumber, account.accountNumber) && Objects.equals(accountType, account.accountType) && Objects.equals(customer, account.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber, accountType, customer);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Account(Integer id, String accountNumber, AccountType accountType, Customer customer) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.customer = customer;
    }

    @Override
    public String toString() {
        String s=String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s",this.getCustomer().getCustomerId(),this.getCustomer().getUser().getName(),this.getCustomer().getUsername(),this.getCustomer().getMobileNumber(),this.getCustomer().getEmail(),this.getCustomer().getAddress(),this.getAccountNumber(),this.getAccountType().getAccountType());
        return s;
    }
}

public class Q3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        List<Account> list=new ArrayList<>();
        for(int i=1; i<=2; i++) {
            System.out.println("Enter the details of Account"+i);
            System.out.println("Enter Name:");
            String name=br.readLine();
            System.out.println("Enter Email:");
            String email=br.readLine();
            System.out.println("Enter mobile number:");
            String mobileNumber=br.readLine();
            System.out.println("Enter Address:");
            String address=br.readLine();
            System.out.println("Enter Password:");
            String password=br.readLine();
            System.out.println("Enter Customer Id:");
            String customerId=br.readLine();
            System.out.println("Enter Account Id:");
            Integer accountId=Integer.valueOf(br.readLine());
            System.out.println("Enter the Account Number:");
            String accountNumber=br.readLine();
            System.out.println("Enter Account Type:");
            String accountType=br.readLine();

            User user=new User(name,email,password,email,mobileNumber,address);
            Customer customer = new Customer(customerId,email,password,email,mobileNumber,address,customerId,user);
            AccountType at=new AccountType(accountType);
            Account account = new Account(accountId,accountNumber,at,customer);
            list.add(account);
        }
        System.out.println("Account Details");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n","Customer Id","Customer Name","Customer Username","Customer MobileNumber","Customer Email","Customer Address","Account Number","Account Type");
        for(Account xx:list){
            System.out.println(xx);
        }
        if(list.get(0).getAccountNumber().compareTo(list.get(1).getAccountNumber()) == 0){
            System.out.println("Both Account Numbers are same");
        }else{
            System.out.println("Both Account Numbers are different");
        }

    }
}

