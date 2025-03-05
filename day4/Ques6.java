public class Ques6{
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr =new int[]{3,5,3,7,4};
        int ans=0;
        for(int i=0;i<5;i++){
            ans=ans+arr[i];
        }
        System.out.println("Sum of the array is "+ans);
    }
}