
import java.util.Scanner;

public class Ques1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pin");
        int pin = sc.nextInt();
        int attemp=4;
        int i=1;
        while(i<=attemp){
            System.out.println("Enter your pin");
            int pine=sc.nextInt();
            if(pin!=pine){
                System.out.println("Try again");
            }
            else {
            System.out.println("sucessfull");
            break;
            }
            i++;
        }
        if(i==5)
        System.out.println("locked you have no attemp");
    }
}