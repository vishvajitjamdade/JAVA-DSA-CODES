import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(3);
        l1.add(4);
        l1.add(0,5);
        l1.add(6);
        l1.add(4,3);

        l2.add(12);
        l2.add(13);
        l2.add(14);

        l1.set(1, 7);  // replace element at specific index  

        l1.addAll(l2); //added l2 list in l1 list

        System.out.println(l1.contains(12));
        System.out.println(l1.indexOf(6));

        System.out.println("Numbers in the list are : ");
        for(int i = 0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
