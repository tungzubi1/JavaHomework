import java.util.Scanner;

public class bai2 {
    void phuongtrinh(){
        double d, x1, x2;
    Scanner sc = new Scanner(System.in);
        System.out.println("Giải phương trình!");
        System.out.println("Nhập a: ");
    double a = sc.nextInt();
        System.out.println("Nhập b: ");
    double b = sc.nextInt();
        System.out.println("Nhập c: ");
    double c = sc.nextInt();
        d = b*b-4*a*c;

        if (d>0){
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("Phương trình có nghiệm x1 là: "+x1);
            System.out.println("Phương trình có nghiệm x2 là: "+x2);
        } if (d==0){
            x1 = x2 = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép x1 = x2 = "+x1);
        } else if (d<0){
            System.out.println("Phương trình vô nghiệm");
        }
}
}
