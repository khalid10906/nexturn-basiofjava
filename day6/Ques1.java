public class Ques1{
    String name;
    int roll;
    double grade;

    public Ques1(String name, int roll, double  grade) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
    }
    void show(){
        System.out.println("Student details:");
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+roll);
        System.out.println("grade: "+grade);
    }
    public static void main(String args[]){
        Ques1 obj = new Ques1("khalid", 41, 7.0);
        obj.show();
    }
}