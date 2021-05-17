import java.util.Scanner;

public class bai8 {
    static void demtu(){
        int a,b =0, loop = 0;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 1 chuỗi bất kỳ: ");
        String str = sc.nextLine();
        String strauth1 = str.replaceAll("\\s+"," ");
        String strauth2 = strauth1.trim();
        while (b >= 0 && b <= str.length()){
            a = strauth2.indexOf(" ", b);
            if(a==-1){
                b=a;
            }else {
                b = a + 1;
                loop += 1;
                c = loop + 1;
            }
        } if (loop > 0) System.out.println("Chuỗi '"+strauth2+"' có "+c+" từ");
        else System.out.println("Chuỗi chỉ có 1 từ hoặc không có từ nào");
    }
}
