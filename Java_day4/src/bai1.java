import java.util.Scanner;

public class bai1 {
    static void nguyentoN (){
        System.out.print("Nhập số bất kỳ: ");
        int n = (new Scanner(System.in)).nextInt();
        for (int i = 3; i <= n; i++){
            if (checksonguyento(i)){
                System.out.println(i+"\tlà số nguyên tố");
                break;
            }
        }
    }

    static void listnguyento () {
        System.out.println("Các số nguyên tố là: ");
        for (int i = 2; i <= 100; i++) {
            if (checksonguyento(i)) {
                System.out.print(i+"\t");
            }
        }
    }

    public static boolean checksonguyento(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n%i == 0){
                return false;
            }
        } return true; }

}
