public class MethodEx{
    public static int add(int a , int b){
        return a+b;
    }
    public static int findMax(int x, int y){
        if(x>y)
        return x;
        else 
        return y;
    }
    public static void main(String[] args) {

        int sum = add(4,7);
        System.out.println(sum);
        int maximum= findMax(43, 87);
        System.out.println("the maximum number is "+maximum);
    }
}
// using object
// public class MethodEx {
//     // Non-static method for addition
//     public int add(int a, int b) {
//         return a + b;
//     }

//     public static void main(String[] args) {
//         // Create an object of the class
//         MethodEx obj = new MethodEx();

//         // Use the object to call the add method
//         int sum = obj.add(4, 7);

//         // Print the result
//         System.out.println(sum);
//     }
// }
