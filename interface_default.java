interface vehicle{
    abstract void start();
    default void fuel(){
        System.out.println("Filling fuel...");
    }
}

class car implements vehicle{
    public void start(){
        System.out.println("Car is started...");
    }
}


public class interface_default {
    public static void main(String[] args) {
        car c = new car();
        c.fuel();
        c.start();
    }
}
