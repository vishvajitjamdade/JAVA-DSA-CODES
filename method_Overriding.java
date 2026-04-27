class A{
    public void method1(){
        System.out.println("This is the method1 in class A");
    }
}

class B extends  A{

    @Override
    public void method1(){
        System.out.println("This is the method1 in class B");
    }

    public void method2(){
        System.out.println("This is the method2 in class B");
    }

    public void method3(){
        System.out.println("This is the method3 in class B");
    }
}


public class method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.method1();
        b.method2();
        b.method1();

        // A obj = new B();   // With help of this object we can call only methods those are present in parent class and same method present in child class
        // obj.method3();    
    }
}
