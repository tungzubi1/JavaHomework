import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Bài 1");
        System.out.println("Nhập tháng: ");
        int t = (new Scanner(System.in)).nextInt();
        bai1 dem = new bai1();
        dem.demngay1(t);
        dem.demngay2(t);
        System.out.println("Bài 2");
        bai2 pt = new bai2();
        pt.phuongtrinh();
        System.out.println("Bài 3");
        bai3 check = new bai3();
        check.checktamgiac();
        }
    }