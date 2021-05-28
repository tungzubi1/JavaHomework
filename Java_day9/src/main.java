import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        bai2();
    }

    static void bai2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();
        String str2 = new String();
        for(int i=0; i<str.length(); i++){
            int count=0;
            for(int j=0; j<str2.length(); j++){
                if (str.charAt(i) == str2.charAt(j)){
                    count++;
                }
            } if(count == 0){
                str2 = str2 + str.charAt(i);
            }
        }
        System.out.println(str2.length());
        System.out.println("Chuỗi mới: "+str2);
    }
}

