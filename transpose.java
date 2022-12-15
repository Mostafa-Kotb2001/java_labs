import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner row = new Scanner(System.in);
        Scanner col = new Scanner(System.in);
        System.out.println("enter number of row :");
        a = row.nextInt();
        System.out.println("enter number of col :");
        b = col.nextInt();
        double[][] arr1;
        arr1 = new double[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                Scanner input1 = new Scanner(System.in);
                System.out.println("enter number of arr1:" + (i+1) + "-" + (j+1));
                arr1[i][j] = input1.nextFloat();
            }
        }
        for (int j = 0; j < b; j++) {
            for (int i = 0; i < a; i++) {
                System.out.println( arr1[i][j] + "\n" );

                }
            }
    }
}
