public class Ques5{
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr =new int[]{3,5,3,7,4};
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<5;i++){
            ans=Math.max(ans,arr[i]);
        }
        System.out.println("largest number in this array is "+ans);
    }
}