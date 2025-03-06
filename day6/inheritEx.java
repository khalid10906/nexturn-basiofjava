
//         void speak(){
//             System.out.println("Yes students can speak");
//         }
//     }
//     class Teacher extends Student{
//         void teach(){
//             System.out.println("Teacher can tech to the students");
//         }
//     }
//     class Principle extends Teacher{
//         void manage(){
//             System.out.println("Principle is managing the school");
//         }
//     }
//------------------------------------hairarchical inheritance
class Parent{
    void show(){
        System.out.println("i have two childrens");
    }
}
class Student1 extends Parent{
    void show1(){
        System.out.println("I am the child number 1");
    }
}
class Student2 extends Parent{
    void show2(){
        System.out.println("I am the child number 2");
    }
}
public class inheritEx{
    
    public static void main(String[] args) {
        // Teacher t1 = new Teacher();
        // t1.speak();
        // Principle p = new Principle();
        // p.teach();
        // p.speak();
        //-------------------
        Student1 s1= new Student1();
        s1.show();
        Student2 s2 = new Student2();
        s2.show();
    }
}