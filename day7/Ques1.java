




abstract class Employee{
    String name;
    int empID;
    abstract void CalculateS();
    public void showDetails(String name,int empID){
    
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + name);
    }
}
class FullTime extends Employee{
    int salary=50000;
    void CalculateS(){
        System.out.println("the salary is "+salary);
    }
}
class PartTime extends Employee{
    int salary=500;
    int hour=4;
    void CalculateS(){
         System.out.println("the salary is "+salary*hour);
    }
}

public class Ques1{
    

    public static void main(String[] args) {
        PartTime p= new PartTime();
        p.showDetails("Khalid",123);
        p.CalculateS();
        FullTime f= new FullTime();
        p.showDetails("Khalid",234);
        p.CalculateS();
    }
}