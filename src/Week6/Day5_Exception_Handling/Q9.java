package Week6.Day5_Exception_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Hall{
    private String name;
    private String contactNumber;
    private Double costPerDay;
    private String ownerName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Hall(String name, String contactNumber, Double costPerDay, String ownerName) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }
    public Hall(String name){
        this.name=name;
    }

}
class Event {
    private String name;
    private String detail;
    private String ownerName;
    private String type;

    public Event(String name){
        this.name=name;
    }

    public Event(String name,String detail,String ownerName,String type){
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
        this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDetail(String detail){
        this.detail = detail;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getName(){
        return this.name;
    }
    public String getOwnerName(){
        return this.ownerName;
    }
    public String getType(){
        return this.type;
    }
    public String getDetail(){
        return this.detail;
    }
}
class HallBooking{
    Hall hall;
    Event event;
    String eventDate;
    Double price;

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public HallBooking(Hall hall, Event event, String eventDate, Double price) {
        this.hall = hall;
        this.event = event;
        this.eventDate = eventDate;
        this.price = price;
    }

    @Override
    public String toString() {
        String s=String.format("%-15s%-15s%-15s%-15s\n",this.getHall().getName(),this.getEvent().getName(),this.getEventDate(),this.getPrice());
        return s;
    }
}
class HallBookingBO{
    public static boolean validateHallbooking(ArrayList<HallBooking> bookingsList,HallBooking booking) throws HallNotAvailableException{
        String fName=booking.getHall().getName();
        String fEventDate=booking.getEventDate();
        HashMap<String,String> map=new HashMap<>();
        bookingsList.stream().forEach(e->map.put(e.getEventDate(),e.getHall().getName()));
        if(map.containsKey(fEventDate)){
            if(map.get(fEventDate).equals(fName)){
                throw new HallNotAvailableException("Hall Already Booked");
            }
        }
        return true;
    }
}
class HallNotAvailableException extends Exception{
    public HallNotAvailableException(String msg){
        super(msg);
    }
}
public class Q9 {
    public static void main(String[] args)throws IOException {
        ArrayList<Event> eventList = new ArrayList<>();
        ArrayList<Hall> hallList = new ArrayList<>();
        eventList.add(new Event("Book Fair", "All books available", "John", "Exhibition"));
        eventList.add(new Event("Furniture Fair", "Discount of 20%", "Joe", "Exhibition"));
        eventList.add(new Event("Magic show", "Magic without Logic", "Jack", "Stage event"));
        hallList.add(new Hall("Sdf hall", "123456", 10000.0, "Jill"));
        hallList.add(new Hall("JKL hall", "135790", 25000.0, "James"));
        hallList.add(new Hall("TUV hall", "246800", 15000.0, "Jane"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char choice;
        ArrayList<HallBooking> hallBookingArrayList = new ArrayList<>();
            do {
                System.out.println("Enter the booking details:");
                String[] d = br.readLine().split(",");
                String hallName = d[0];
                String eventName = d[1];
                String eventDate = d[2];
                Double price = Double.valueOf(d[3]);
                Hall h = null;
                for (Hall hall : hallList) {
                    if (hall.getName().equals(hallName)) {
                        h = hall;
                        break;
                    }
                }
                Event e = null;
                for (Event event : eventList) {
                    if (event.getName().equals(eventName)) {
                        e = event;
                        break;
                    }
                }
                try {
                    if (h==null || e==null) {
                        throw new HallNotAvailableException("Hall or event does not exist");
                    }
                    HallBooking hb = new HallBooking(h, e, eventDate, price);
                    if (HallBookingBO.validateHallbooking(hallBookingArrayList, hb)) {
                        hallBookingArrayList.add(hb);
                    }
                }catch (HallNotAvailableException exp) {
                    System.out.println(exp);
                }

                System.out.println("Do you want to continue?(y/n)");
                choice = (char) br.read();
                br.readLine();

            } while (choice == 'y');


        System.out.printf("The booking entered are:\n%-15s%-15s%-15s%-15s\n","Hall name","Event name","Event date","Price");
        hallBookingArrayList.stream().forEach(e-> System.out.print(e));
    }
}
