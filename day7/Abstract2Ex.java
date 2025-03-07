abstract class Database{
    abstract void connecting();
    void disconnect(){
        System.out.println("Disconnected");
    }
}
class Mydata extends Database{

    void connecting() {
        //codeblock for connecting
        System.out.println("Connected to Database");
    }
    
}
public class Abstract2Ex{
    public static void main(String[] args) {
        Mydata obj = new Mydata();
        obj.connecting();
    }
} 