import java.util.Random;

public class generateRandom {
    public static void main(String[] args) {
        Random random = new Random();
        
        //Generate any number
        int any = random.nextInt();

        //  Generate a random integer within a bound (0 to bound-1)
        int anyRand = random.nextInt(100);

        //Generate within specific range
        int min = 1;
        int max = 100;
        int rangeRand = random.nextInt(max-min+1)+min;

        System.out.println("Any random number " + any);
        System.out.println("within a bound (0 to bound-1) " + anyRand);
        System.out.println("Generate within specific range "+rangeRand);;
    }
}
