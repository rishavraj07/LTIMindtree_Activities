package Week6.Day5_Exception_Handling;
import java.io.*;

class ContactDetail{
    private String mobileNumber;
    private String alternateMobileNumber;
    private String landline;
    private String email;
    private String address;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAlternateMobileNumber() {
        return alternateMobileNumber;
    }

    public void setAlternateMobileNumber(String alternateMobileNumber) {
        this.alternateMobileNumber = alternateMobileNumber;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ContactDetail(String mobileNumber, String alternateMobileNumber, String landline, String email, String address) {
        this.mobileNumber = mobileNumber;
        this.alternateMobileNumber = alternateMobileNumber;
        this.landline = landline;
        this.email = email;
        this.address = address;
    }
    @Override
    public String toString(){
        String s=String.format("Mobile:%s\nAlternate mobile:%s\nLandLine:%s\nEmail:%s\nAddress:%s\n",this.getMobileNumber(),this.getAlternateMobileNumber(),this.getLandline(),this.getEmail(),this.getAddress());
        return s;
    }
}
class ContactDetailBO{
    static void validate(String mobileNumber,String alternateMobilenumber) throws DuplicateMobileNumberException {
        if(mobileNumber.equals(alternateMobilenumber)){
            throw new DuplicateMobileNumberException("Mobile number and alternate mobile number are same");
        }
    }
    public ContactDetailBO(){}
}
class DuplicateMobileNumberException extends Exception{
    public DuplicateMobileNumberException(String msg){
        super(msg);
    }
}
public class Q5 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the contact details");
        String[] d=br.readLine().split(",");
        ContactDetail cd=new ContactDetail(d[0],d[1],d[2],d[3],d[4]);
        try {
            ContactDetailBO.validate(cd.getMobileNumber(), cd.getAlternateMobileNumber());
            System.out.println(cd.toString());
        }catch (DuplicateMobileNumberException e){
            System.out.println("DuplicateMobileNumberException: "+e.getMessage());
        }


    }
}
