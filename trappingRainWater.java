import java.util.Scanner;

public class trappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int height[] = new int[n];
        System.out.println("Enter the height of bars : ");
        for(int i = 0;i<n;i++){
            height[i] = sc.nextInt();
        }

        int leftmax[] = new int[n];
        int rightmax[] = new int[n];
        leftmax[0] = height[0];
        rightmax[n-1] = height[n-1];

        for(int i = 1;i<n;i++){
            leftmax[i] = Math.max(leftmax[i-1],height[i]);
        }

        for(int i = n-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1],height[i]);
        }

        int trapped = 0;

        for(int i = 0;i<n;i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trapped = trapped + (waterlevel-height[i])*1;
        }

        System.out.println("Total trapped water : " + trapped);

    }
}
