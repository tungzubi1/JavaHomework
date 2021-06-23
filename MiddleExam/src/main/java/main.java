import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws MonthCheckingException {
        //bai1

        System.out.println("Bài tập số 1: ");
        String str = "You Only Live Once. But if You do it right. once is Enough";
        System.out.println(str);
        bai1 ex_01 = new bai1();
        int count = ex_01.count(str);
        System.out.println("Chuỗi trên có " + count + " ký tự in hoa");
        String str2 = "";
        str2 = ex_01.Uppercase(str);
        System.out.println("Chuỗi viết hoa toàn bộ chữ cái đầu: \n" + str2);
        String str3 = "";
        str3 = ex_01.Uppercase2(str);
        System.out.println("Chuỗi viết hoa chữ cái đầu hoặc sau dấu chấm: \n" + str3);


        Scanner sc = new Scanner(System.in);
        //bai2
        System.out.println("Bài 2.");
        bai2 pass = new bai2();
        String str1 = "";
        pass.CheckPassword(str1);

        //bai3
        System.out.println("Bài 3.");
        System.out.println("Nhập tháng: ");
        try {
            int t = sc.nextInt();
            bai3 check = new bai3();
            check.CheckMonth(t);
            if (t < 1 || 12 < t) throw new ArithmeticException("Không phải tháng.");
        } catch (InputMismatchException ex1) {
            throw new MonthCheckingException("Tháng phải nhập số vào. ");
        }
    }
}

