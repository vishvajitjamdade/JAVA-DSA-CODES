import java.util.ArrayList;

public class nestedArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> outerList = new ArrayList<>();
        for(int i = 0;i<3;i++){
            ArrayList<Integer> innerList = new ArrayList<>();
            for(int j = 0;j<3;j++){
                innerList.add((i+1)*(j+1));
            }
            outerList.add(innerList);
        }

        System.out.println("Numbers in arraylist : ");
        for(ArrayList<Integer> inner : outerList){
            System.out.println(inner);
        }

    }
}
