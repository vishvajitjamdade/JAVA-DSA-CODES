import java.util.Scanner;

public class buyAndSellStocks_OA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers in array : ");
        int prices[] = new int[n];

        for(int i = 0;i<n;i++){
            prices[i] = sc.nextInt();
        }

        int buyPrice = prices[0];
        
        int profit = 0;
        for(int i = 1;i<n;i++){
            if(buyPrice > prices[i]){
                buyPrice = prices[i];
            }
            // buyPrice = Math.min(buyPrice,prices[i]);
            profit = Math.max(profit,prices[i]-buyPrice);            
        }

        System.out.println("Maximum Profit : " + profit);
        sc.close();
    }
}
