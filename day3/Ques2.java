public class Ques2 {
    public static void main(String[] args) {
       int num=1; 
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
