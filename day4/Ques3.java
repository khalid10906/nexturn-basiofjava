public class Ques3{
    public static void main(String args[]){
        // int n =324;
        // String s1=Integer.toString(n);
         
        String s = "khahk";
        String s1=s.toLowerCase();
        int l=s.length()-1;
        int i=0;
        boolean b = true;
        while(i<l){
            if(s.charAt(i++)!=s.charAt(l--)){
                b= false;
                break;
            }
        }
        if(b==false){
            System.out.println("not palndrome");
        }
        else{
            System.out.println("palindrom");
        }
    }
}