public class Ques3{
    public static int sum(int a ){
        if(a==0)
        return 0;
        else{
            return (a%10)+sum(a/10);
        }
    }
    public static void main(String args[]){
            int  n = 100;
            System.out.println("the sum of the digit of the number is "+sum(n));
    }
}