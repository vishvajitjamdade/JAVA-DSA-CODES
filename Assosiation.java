class Driver{
    public void start(Car c){
        System.out.println("Car is starting...");
    }
}

class Car{
    public void car(){
        System.out.println("This is car class method");
    }
}

public class Assosiation {
    public static void main(String[] args) {
        Driver d = new Driver();
        Car c = new Car();
        d.start(c);
    }
}
