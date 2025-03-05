public class Ques2{
    public static int fabonaci(int a ){
        if(a<=1){
        return a;
        }
       
        else{
                 return fabonaci(a-1)+fabonaci(a-2);
        }
    }
    public static void main(String args[]){
            for(int i=0;i<20;i++){
                System.out.print(fabonaci(i)+" ");
            }
    }
}