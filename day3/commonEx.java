public class commonEx{
    public static void main(String args[]){
        if(args.length < 2){
            System.out.println("Enter provide your name and age in commond line argument");
            return;
        }
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        System.out.println("name is "+ name + " and age is "+age);
    }
}