import java.util.HashSet;

public class Contains_Duplicate {
   public static void main(String[] args) {
    boolean ans = false;
    int nums[] = {1,2,3,1};
    HashSet<Integer> set = new HashSet<>();
    for(int num : nums){
        if(set.contains(num)){
            ans = true;
            break;
        }
        set.add(num);
    }

    System.out.println(ans);
   } 
}
