public class binary_search {

    public static int binary(int num[],int key){
        int left = 0;
        int right = num.length-1;
        while(left<=right){

            int mid = (right+left)/2;

            if(num[mid] == key){
                return mid;
            }
            else if(num[mid]>key){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8};
        int key = 4;
        System.out.println("Number found at index : "+binary(num, key));
    }
}
