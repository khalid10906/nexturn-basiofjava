public class Ques4{
    public static String reverse(String s){
       if(s.length()==1 || s.isEmpty())
       return s;
       else{
            return reverse(s.substring(1))+s.charAt(0);
       }
    }
    public static void main(String args[]){
           String s = "khalid";
           System.out.println("the reverse of the string is "+reverse(s));
    }
}