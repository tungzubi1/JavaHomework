import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        tamgiac();
        tugiac();
    }
    static void tamgiac(){
        int h;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập chiều cao của tam giác: ");
            h = sc.nextInt();
        } while (h <= 0);

        for (int i=0; i<(h*2); i+=2){
                for (int k=0; k < (h-i/2); k++){
                    System.out.print("   ");
                }
            if (i%2==0){
                for (int j=0; j<i+1; j++){
                    System.out.print(" * ");
                }
            } System.out.println(" ");
        }
    }

    static void tugiac(){
        int h,w;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập chiều cao của tứ giác: ");
            h = sc.nextInt();
        } while (h <= 0);
        do {
            System.out.print("Nhập chiều rộng của tứ giác: ");
            w = sc.nextInt();
        } while (h <= 0);

        for (int i=0; i<h; i++){
                for (int j=0; j<w; j++){
                    System.out.print(" * ");
                }
            System.out.println(" ");
        }
    }

}
