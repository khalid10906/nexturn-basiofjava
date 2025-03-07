interface student{
    void speak(); //abstract method
    int num =10; 
}
class trainer implements student{
    public void speak(){
            System.out.println("speaking");
        }
}
public class InterfaceEx {
    public static void main(String[] args) {
        trainer t = new trainer();
        t.speak();
    }
}