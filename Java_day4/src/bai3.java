import java.util.Scanner;

public class bai3 {
    static void giaithua(){
        System.out.print("Nhập số bất kỳ: ");
        int n = (new Scanner(System.in)).nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++){
            a=a*i;
        }
        System.out.println(""+n+"! có giá trị là "+a);
    }
}
