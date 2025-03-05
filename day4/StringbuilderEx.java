public class StringbuilderEx{
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("khalid");
        name.append("Ansari");
        System.out.println(name);
        StringBuffer name1= new StringBuffer("mohd");
        name1.append("Khalid");
        System.out.println(name1);
        name1.insert(5,"abcd");
        System.out.println(name1);
        name1.replace(3,7,"repl");
        System.out.println(name1);
        name1.delete(1,5);
        System.out.println(name1);
        name1.reverse();
        System.out.println(name1);
        System.out.println(name1.length());
        System.out.println( name1.charAt(6));
        name1.setCharAt(3, 'Z');
        System.out.println(name1);

    }
}