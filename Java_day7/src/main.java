import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        bai1();
    }

    static void bai1() {
        System.out.print("Nhập số hàng của ma trận A: ");
        int n = (new Scanner(System.in)).nextInt();
        System.out.print("Nhập số cột và cột của ma trận A: ");
        int m = (new Scanner(System.in)).nextInt();
        int[][] arrayA = new int[n][m];
        System.out.println("Nhập giá trị các phần tử: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrayA[i][j] = (new Scanner(System.in)).nextInt();
            }
        }
        System.out.println("Ma trận vuông: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf(arrayA[i][j] + " ");
            }
            System.out.println();
        }
        int sum1 = 0;
        int sum2 = 0;
        System.out.print("Các phần tử nằm trên đường chéo 1 là: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum1 = sum1 + arrayA[i][j];
                    System.out.printf(arrayA[i][j] + " ");
                }
            }
        }
        System.out.println("\nTổng các phần tử đường chéo 1 là: " + sum1);
        System.out.print("Các phần tử nằm trên đường chéo 2 là: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (n == m & (i + j) == (n - 1)) {
                    sum2 = sum2 + arrayA[i][j];
                    System.out.printf(arrayA[i][j] + " ");
                }
            }
        }
        System.out.println("\nTổng các phần tử đường chéo 2 là: " + sum2);
        System.out.print("Thứ tự hàng 2: ");
        int i, j, k;
        int index;
        for (i = 1; i < 2; i++) {
            for (j = 0; j < m; j++) {
                for (k = j + 1; k < m; k++)
                    if (arrayA[i][k] < arrayA[i][j]) {
                        index = arrayA[i][k];
                        arrayA[i][k] = arrayA[i][j];
                        arrayA[i][j] = index;
                    }
                System.out.print(arrayA[i][j] + " ");
//                sort(arrayA,n,m);
            }
        }
//        sort(arrayA, n, m);
    }

//    static void sort(int arrayA[][], int n, int m) {
//        for (int i = 1; i < 2; i++) {
//            for (int j = 0; j < m; j++) {
//        for (int k = j + 1; k < m; k++)
//            if (arrayA[i][k] < arrayA[i][j]) {
//                int index = arrayA[i][k];
//                arrayA[i][k] = arrayA[i][j];
//                arrayA[i][j] = index;
//            }
//                System.out.print(arrayA[i][j] + " ");
//            }
//        }
//    }
}