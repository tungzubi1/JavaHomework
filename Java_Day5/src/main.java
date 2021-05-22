import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        bai1();
        bai2();
    }

    static void bai1() {
        System.out.println("Nhap so phan tu: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] chuoi = new int[size];
        int i = 0;
        for (i = 0; i < size; i++) {
            System.out.printf("Phan tu %d la: ", i, chuoi[i]);
            chuoi[i] = sc.nextInt();
        }
        System.out.print("Chuoi bao gom: ");
        int sum=0;
        for (i = 0; i < size; i++) {
            System.out.print(+chuoi[i]+"\t");
            sum=sum+chuoi[i];
        }
        System.out.println("\nTong la: "+sum);
        System.out.println("Phan tu vi tri thu 2 la: "+chuoi[1]);
        int max=chuoi[0];
        int indexmax=0;
        int min=chuoi[0];
        int indexmin=0;
        for (i = 0; i < size; i++){
            if (max < chuoi[i]) {
                max = chuoi[i];
                indexmax = i;
            }
            if (min > chuoi[i]) {
                min = chuoi[i];
                indexmin = i;
            }
        }
        System.out.println("Phan tu lon nhat la: "+max+" va o phan tu thu "+indexmax);
        System.out.println("Phan tu nho nhat la: "+min+" va o phan tu thu "+indexmin);
    }

    static void bai2(){
        System.out.print("Nhập số lượng học sinh: ");
        Scanner sc = new Scanner(System.in);
        int totalStr = Integer.parseInt(sc.nextLine());
        String[] str = new String[totalStr];
        for (int i = 0; i < str.length; i++) {
            System.out.printf("Học sinh thứ %d la: ",(i+1));
            str[i] = sc.nextLine();
        }
        System.out.println("Danh sách lớp: ");
        for(int j = 0; j < str.length; j++){
            System.out.printf("%d. ",(j+1));
            System.out.println(str[j]);
        }

        //Chưa tìm ra nguyên nhân vì sao ko đếm được số lần xuất hiện + vị trí của chuỗi
        int count=0;
        System.out.println("Tìm kiếm học sinh: ");
        String str1 = sc.nextLine();
        for(int j = 0; j < str.length; j++){
            if(str[j].equalsIgnoreCase(str1)){
            count++;
            }
        }
        System.out.print("Trong lớp có "+count+" bạn tên "+str1+" và ở số thứ tự ");
        for(int j=0; j < str.length; j++){
            if(str[j].equalsIgnoreCase(str1)){
                System.out.print((j+1)+", ");
            }
        }
    }
}