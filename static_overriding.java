class O{
    static void display(){
        System.out.println("This is class O method");
    }
}

class A extends O{
    static void display(){
        System.out.println("This is the Class A method");
    }
}

class B extends A{
    static void display(){
        System.out.println("This is Class B method");
    }
}

public class static_overriding {
    public static void main(String[] args) {
        // O a = new B();
        // a.display();     
        
        //static method always looks for the reference type It does not depends on object 
        //Hence here even if we created object of child class B but it execute method of O class
    }
}
