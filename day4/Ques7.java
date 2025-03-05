public class Ques7{
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        arr1 = new int[][]{{2,5,8},{3,5,7},{3,6,8}};
        arr2 = new int[][]{{2,5,8},{3,5,7},{3,6,8}};
        int[][] arr3= new int[3][3];
        for (int i =0; i < 3; i++) {
            for(int j=0;j<3;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }   
        }
         for (int i =0; i < 3; i++) {
            for(int j=0;j<3;j++){
              System.out.print(arr3[i][j]+" "); 
            }   
            System.out.println("");
        }
       
    }
}