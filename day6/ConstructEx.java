



public class ConstructEx{
    String name;
    int num;
    // constructor is a special method to initialize the object.
    // it automatically initialize whhen object is called
    //1.same name as class
    //2.no return type
    //3.called automatically
    //4.ParameterizedType
    //overloading is possible
    //type:
    //default constructor and parametrized constructor
    ConstructEx(){//default constructor
        name="khalid";
        num = 10;
    }

    public ConstructEx(String name, int num) {//parametrized Constructor
        this.name = name;
        this.num = num;
    }
    
    void show(){
        System.out.println(name + " and " +num);
    }
    public static void main(String args[]){
        ConstructEx obj = new ConstructEx();
        ConstructEx obj1 = new ConstructEx("Abid",20);
        obj.show();
        obj1.show();
    }
}