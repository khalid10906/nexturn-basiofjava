
import java.util.Scanner;

public class whileloopEx{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=1;
        while(b<=a){
            System.out.println(b++);
        }
    }
}