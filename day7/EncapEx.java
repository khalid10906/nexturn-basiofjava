class class1{
    //hiding fields and methods
    //contrlled access
    //secure
    private String name;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
}
public class EncapEx{
    public static void main(String[] args) {
        class1 c= new class1();
        c.setName("khalid");
        System.out.println(c.getName());
        
    }
}