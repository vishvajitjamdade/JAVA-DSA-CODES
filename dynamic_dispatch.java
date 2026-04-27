class parent{
    void method1(){
        System.out.println("This is parent class method1");
    }
    void method2(){
        System.out.println("This is parent class method2");
    }
}

class child extends parent{
    void method2(){
        System.out.println("This is child class method2");
    }
    void methpd3(){
        System.out.println("This is child class method3");
    }
}

public class dynamic_dispatch {
    public static void main(String[] args) {
        parent p = new child();
        p.method1();
    }
}
