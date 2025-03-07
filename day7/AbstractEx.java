abstract class Trainer{
    abstract  void Teach();
    //abstract don't have implementation details
}
class Student extends Trainer{
    //child class only having the implementation.
    void Teach(){
        System.out.println("Training is going on");
    }
}

public  class AbstractEx{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.Teach();
    }
}