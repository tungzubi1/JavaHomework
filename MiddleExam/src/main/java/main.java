import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws MonthCheckingException {
        Scanner sc = new Scanner(System.in);
        //bai1
        System.out.println("Bài 1.");
        String str = "You Only Live Once. But if You do it right. once is Enough";
        NoOfUpperCase(str);
        System.out.println(capitalize(str));

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

    public static void NoOfUpperCase(String str) {
        char ch;
        int chuthuong = 0, chuhoa = 0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            int asciivalue = (int) ch;
            if (asciivalue >= 65 && asciivalue <= 90) {
                chuhoa++;
            } else if (asciivalue >= 97 && asciivalue <= 122) {
                chuthuong++;
            }
        }
        System.out.println("Số chữ cái thường : " + chuthuong);
        System.out.println("Số chữ cái hoa : " + chuhoa);
    }

    public static String capitalize(String string) {
        final int sl = string.length();
        final StringBuilder sb = new StringBuilder(sl);
        boolean lod = false;
        for (int s = 0; s < sl; s++) {
            final int cp = string.codePointAt(s);
            sb.appendCodePoint(lod ? Character.toLowerCase(cp) : Character.toUpperCase(cp));
            lod = Character.isLetterOrDigit(cp);
            if (!Character.isBmpCodePoint(cp)) s++;
        }
        return sb.toString();
    }
}
