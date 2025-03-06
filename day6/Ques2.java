public class Ques2{
    String title;
    String author;
    double price;

    public Ques2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Ques2(Ques2 p){
         this.title = p.title;
        this.author = p.author;
        this.price = p.price;
    }
    void show1(){
        System.out.println("Original book details: ");
        System.out.println("title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
    void show2(){
        System.out.println("Copy book details: ");
        System.out.println("title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

    public static void main(String args[]){
        Ques2 obj1 = new Ques2("java programming" , "James Gosling" , 150.0);
        obj1.show1();
        Ques2 obj2 = new Ques2(obj1);
        obj2.show2();
    }
    
}