import java.util.Scanner;

public class bai2 {
    static void CheckPassword(String str1) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        String pattern = "(^.*(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$)";
        while (check == false) {
            System.out.println("Nhập mật khẩu của bạn.");
            str1 = sc.nextLine();
            if (str1.length() < 10) {
                if (str1.matches(pattern) == true) {
                    System.out.println("Chưa đủ mạnh.");
                } else
                    System.out.println("Mật khẩu yếu.");
            }
            else check = true;
        }
            System.out.println("Xịn");
    }
}
