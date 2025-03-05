public class Ques4{
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];
        arr1 = new int[]{2,5,8,5};
        arr2 = new int[]{5,6,4,9};
        int ans =0;
        for(int i=0;i<4;i++){
            if(arr1[i]!=arr2[i]){
                ans =1;
                break;
            }
        } 
        if(ans==1){
            System.out.println("not equal");
        }
        else{
            System.out.println("equal");
        }
    }
}