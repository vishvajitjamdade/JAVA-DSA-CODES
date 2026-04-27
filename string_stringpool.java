public class string_stringpool {
    public static void main(String[] args) {
        String s1 = "Java";  //object created in pool
        String s2 = "Java";  //object created in pool
        String s3 = new String("Java"); //object created in heap at different location
        String s4 = new String("Java"); //object created in heap at different location
        System.out.println(s1 == s2);   //true
        System.out.println(s1 == s3);   //false
        System.out.println(s3 == s4);   //false
    }
}
