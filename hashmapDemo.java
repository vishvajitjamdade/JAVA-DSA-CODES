import java.util.HashMap;
import java.util.Map;

public class hashmapDemo {
    public static void main(String[] args) {
            //Country,population
        HashMap<String,Integer> map = new HashMap<>();

        map.put("china",180);
        map.put("India",120);
        map.put("USA",50);

        System.out.println(map);

        if(map.containsKey("china")){
            System.out.println("Key is present in the map");
        }
        else {
            System.out.println("Key is not present in map");
        }

        //Iteration in HashMap
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        map.remove("china");
        System.out.println(map);
    }
}
