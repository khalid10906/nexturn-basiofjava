

public class ArrayEx{
    public static void main(String[] args) {
        int[] num = new int[8];
        num=new int[]{1,2,3,4,5,6,7,8};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        for(int i=num.length-1;i>=0;i--){
            System.out.println(num[i]);
        }
        for(int nums : num){
                System.out.println(nums);
        }
        int [][] arr = new int[3][3];
        arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        // jagged ArrayEx
        int [][] jagged  = new int[3][];
        jagged[0]= new int[]{1,2};
        jagged[1]=new int[]{1,8,9};
        jagged[2]=new int[]{3};       
    }
}