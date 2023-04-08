package Week6.Day2_Streams;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Book implements Comparable<Book> {
    String title;
    String category;
    String author;
    Double price;
    public Book() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Book(String title, String category, String author, Double price) {
        super();
        this.title = title;
        this.category = category;
        this.author = author;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Book that) {
        return this.getTitle().compareTo(that.getTitle());
    }
}

public class Q5 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        List<Book> list=new ArrayList<>();
        System.out.println("Enter no. of Books");
        Integer n=Integer.parseInt(br.readLine());
        System.out.println("Enter the book details in CSV format");
        for(int i=0;i<n; i++){
            String[] s=br.readLine().split(",");
            Book b=new Book(s[0],s[1],s[2],Double.valueOf(s[3]));
            list.add(b);
        }
        System.out.format("%-20s %-20s %-10s %s\n","Title","Category","Author","Price");
        List<String> l=new ArrayList<>();
        list.stream().filter(e->{
            if(l.contains(e.getTitle())){
                return false;
            }else{
                l.add(e.getTitle());
            }
            return true;
        }).forEach(xx-> System.out.format("%-20s %-20s %-10s %s\n",xx.getTitle(),xx.getCategory(),xx.getAuthor(),xx.getPrice()));
        Map<String,String> mp=list.stream().collect(Collectors.toMap(Book::getAuthor,Book::getTitle,(book1,book2)->book1+","+book2));
        for(Map.Entry<String,String> xx:mp.entrySet()){
            System.out.println(xx);
        }
        int result = Arrays.stream(new int[]{}).min().orElse(0);
        System.out.println(result);
    }
}
