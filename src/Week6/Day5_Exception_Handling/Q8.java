package Week6.Day5_Exception_Handling;
import java.io.*;
import java.util.*;
class User{
    private String name;
    private String mobile;
    private String username;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public User(String name, String mobile, String username, String password) {
        this.name = name;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }
    @Override
    public String toString(){
        String s=String.format("Name:%s\nMobile:%s\nUsername:%s\nPassword:%s\n",this.getName(),this.getMobile(),this.getUsername(),this.getPassword());
        return s;
    }
}
class UserBO {
    public static void validate(User u)throws WeakPasswordException{
        //Your code here
        String passWord=u.getPassword();
        List<Character> digit=Arrays.asList('0','1','2','3','4','5','6','7','8','9');
        Boolean isDigit=false;
        ArrayList<Character> specialChar=new ArrayList<>(List.of('!','@','#','$','%','^','&'));
        Boolean isSpecialChar=false;
        Boolean isLetter=false;
        for(int i=0; i<passWord.length(); i++){
            if(digit.contains(passWord.charAt(i))){
                isDigit=true;
            }
            if(specialChar.contains(passWord.charAt(i))){
                isSpecialChar=true;
            }
            if((passWord.charAt(i)>='a' && passWord.charAt(i)<='z') || (passWord.charAt(i)>='A' && passWord.charAt(i)<='Z')){
                isLetter=true;
            }
        }
        if(!(passWord.length()>=8 && passWord.length()<=20 && isSpecialChar&& isDigit && isLetter)){
            throw new WeakPasswordException("Your password is weak");
        }
    }
}
class WeakPasswordException extends Exception{
    //Your code here
    public WeakPasswordException(String msg){
        super(msg);
    }

}
public class Q8 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the user details");
        String[] d=br.readLine().split(",");
        User u=new User(d[0],d[1],d[2],d[3]);
        try {
            UserBO.validate(u);
            System.out.println(u.toString());
        }catch(WeakPasswordException e){
            System.out.println(e);
        }

    }
}
