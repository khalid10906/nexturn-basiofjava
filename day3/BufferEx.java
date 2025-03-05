
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferEx{
    public static void main(String args[])throws IOException{
        InputStreamReader name = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(name);
        System.out.println("Enter your name");
        String myname = br.readLine();
        System.out.println("my name is "+ myname);
        System.out.println("Enter integer ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("integer is "+ a);
        System.out.println("Enter double number ");
        double d = Double.parseDouble(br.readLine());
        System.out.println("the double nubmer is "+ d);
        System.out.println("Enter a char ");
        char c = br.readLine().charAt(0);
        System.out.println("the charecter is "+c);
        System.out.println("Enter boolean number ");
        boolean b = Boolean.parseBoolean(br.readLine());
        System.out.println("the boolean is "+b);
    }
}