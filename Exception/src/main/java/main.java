import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

//        int result = 7/0;
//        System.out.println(result); // ArithmeticException

//        try{
//            int result = 1/0;
//            System.out.println(result);
//        } catch(Exception e){
//            System.out.println("Ko chia dc ");
//            e.printStackTrace();
//        } finally {
//            System.out.println("Chạy tiếp");
//        }

//        String str = null;
//        System.out.println(str.length()); // NullPointerException

//        String str1 = "abc";
//        int num = Integer.parseInt(str1); //NumberFormatException

//        int arr[] = new int[5];
//        arr[5] = 50; // ArrayIndexOutOfBoundsException

//        try{
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số phần từ trong mảng: ");
//        int n = sc.nextInt();
//        int arr1[] = new int[n];
//        for (int i = 0; i<n; i++){
//            System.out.printf("Nhập phần tử %d " ,i);
//            arr1[i] = sc.nextInt();
//        }
//
//        for(int i=0; i<n; i++){
//            System.out.print(arr1[i]+" ");
//        }
//        } catch(NegativeArraySizeException ex1){
//            System.out.println("Kích thước ko âm " + ex1.getMessage());
//
//        } catch (InputMismatchException ex2){
//            System.out.println("Ko đc nhập chữ");
//        }
        try {
            inputWeight();
        } catch (WeightCheckingException e) {
            e.printStackTrace();
        }
    }
    static int inputWeight() throws WeightCheckingException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap can nang cua ban ");
        int weight;
        try {
            weight = sc.nextInt();
            if (weight <= 0) throw new WeightCheckingException("Can nang ko dc nho hon hoac bang 0");
        } catch (InputMismatchException ex1) {
            throw new WeightCheckingException("Can nang phai la so");
        }
        return weight;
    }
}
