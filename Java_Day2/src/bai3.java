import java.util.Scanner;

public class bai3 {
    void checktamgiac (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh 1: ");
        int a = sc.nextInt();
        System.out.println("Nhập cạnh 2: ");
        int b = sc.nextInt();
        System.out.println("Nhập cạnh 3: ");
        int c = sc.nextInt();
        if ((a+b)>c&&(a+c)>b&&(b+c)>a){
            System.out.println("Đây chắc chắn là 1 tam giác");
        } else {
            System.out.println("Đây là không phải là hình tam giác");
        }
    }
}
