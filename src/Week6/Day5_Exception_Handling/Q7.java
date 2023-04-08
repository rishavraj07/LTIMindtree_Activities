package Week6.Day5_Exception_Handling;
import java.io.*;
import java.util.*;

class Event2{
    private String name;
    private String detail;
    private String ownerName;
    private Long typeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Event2(String name, String detail, String ownerName, Long typeId) {
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        String s=String.format("%-15s%-15s%-15s%-15s\n",this.getName(),this.getDetail(),this.getOwnerName(),this.getTypeId());
        return s;
    }
}
class EventType{
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Constructor.
    public EventType(String name,Long id) {
        this.id = id;
        this.name = name;
    }

}
class EventTypeDoesNotExistsException extends Exception{
    public EventTypeDoesNotExistsException(String msg){
        super(msg);
    }
}
public class Q7 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Event2> list=new ArrayList<>();
        ArrayList<EventType> typeList=new ArrayList<>();
        typeList.add(new EventType("Stage Event", 1L));
        typeList.add(new EventType("Exhibition", 2L));
        typeList.add(new EventType("Sports meet", 3L));

        System.out.println("Enter the number of the events:");
        int n=Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            System.out.println("Enter the details of event "+(i+1));
            String[] d=br.readLine().split(",");
            Long typeId = Long.parseLong(d[3]);
            while(true) {
                try {
                    if (isValid(typeId, typeList)) {
                        Event2 e = new Event2(d[0], d[1], d[2], typeId);
                        list.add(e);
                        break;
                    }
                } catch (EventTypeDoesNotExistsException e) {
                    System.out.println(e);
                }
                System.out.println("Enter the correct event type id:");
                typeId = Long.parseLong(br.readLine());
            }
        }
        System.out.printf("The events entered are:\n%-15s%-15s%-15s%-15s\n","Name","Details","Owner name","Event typeid");
        list.stream().forEach(e-> System.out.print(e));


    }
    public static Boolean isValid(Long typeId, List<EventType> typeList) throws EventTypeDoesNotExistsException {
        //write your code here
        for(EventType xx:typeList){
            if(xx.getId() == typeId){
                return true;
            }
        }
        throw new EventTypeDoesNotExistsException("No event type available with the given id");
    }
}
