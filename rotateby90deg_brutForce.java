import java.util.Scanner;

public class rotateby90deg_brutForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc.nextInt();
        System.out.println("Enter the column");
        int col = sc.nextInt();

        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];

        System.out.println("Enter the values into matrix");
        //Input from user
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                mat1[i][j] = sc.nextInt();
            }
        }


        //print matrix
        System.out.println("Original matrix : ");
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }

        //rotate matrix
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                mat2[j][col-1-i] = mat1[i][j];
            }
        }

        //print matrix
        System.out.println("Rotated matrix by 90deg");
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
