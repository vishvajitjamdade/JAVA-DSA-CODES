public class main_method_overload {

    public static void main(){
        System.out.println("Main method without parameters");
    }
    public static void main(String[] args) {
        System.out.println("This is our MAIN method");
        main();
        main("vishvajit");
    }

    public static void main(String name){
        System.out.println("Main method with name : " + name);
    }
}
