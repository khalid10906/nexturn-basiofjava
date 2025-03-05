import java.util.Scanner;
public class  Basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line");
        String line = sc.nextLine();
        System.out.println(line);
        System.out.println("enter a word");
        String word = sc.next();
        System.out.println(word);
        System.out.println("Enter an integer number");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("Enter a double number");
        double d = sc.nextDouble();
        System.out.println(d);
        System.out.println("Enter a float number");
        float f = sc.nextFloat();
        System.out.println(f);
        System.out.println("Enter a long number");
        long l = sc.nextLong();
        System.out.println(l);
        System.out.println("Enter boolean");
        boolean b = sc.nextBoolean();
        System.out.println(b);
        
    }
}