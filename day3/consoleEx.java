
import java.io.Console;

public class consoleEx{
    public static void main(String args[]){
        Console console = System.console();
        if(console==null){
            System.out.println("no console");
            return;
        }
        String username = console.readLine("Enter name");
        char[] passwordchars = console.readPassword("Enter password");
        String password = new String(passwordchars);
        System.out.println("username "+ username);
        System.out.println("password "+ password);
    }
}