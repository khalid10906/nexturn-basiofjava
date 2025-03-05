public class Factorial{
    public static int rec(int a){
        if (a==1)
        return 1;
        else 
        return a*rec(a-1);
    } 
    public static void main(String[] args) {
        int ans = rec(5);
        System.out.println("factorial of 5 is "+ans);
        int ans1=1;
        for(int i=1;i<=5;i++){
            ans1=ans1*i;
        }
        System.out.println("factorial of 5 is "+ans1);
    }
}