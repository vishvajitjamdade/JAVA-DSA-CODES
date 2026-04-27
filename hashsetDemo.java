import java.util.HashSet;
import java.util.Iterator;

public class hashsetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //creation of set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);  //duplicate elements are not add in set

        //For searching element in set
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }

        //to remove or delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Set does not contain 1");
        }

        System.out.println("Size of set is : "+ set.size());
        System.out.println(set);

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
}
