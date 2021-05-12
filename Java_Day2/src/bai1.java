public class bai1 {

    void demngay1 (int t)  {
        if (t==1 || t==3 || t==5 || t==7 || t==8 || t==10 || t==12) {
        System.out.println("31 ngày");
    }
        else if (t==4 || t==6 || t==9 || t==11) {
        System.out.println("30 ngày");
    } else if (t==2){
        System.out.println("28 hoặc 29 ngày");
        } else {
              System.out.println("Vui lòng nhập tháng từ 1 - 12:");
          }
      }


      void demngay2 (int t){
        switch (t) {
            case 1:
                System.out.println("Tháng 1 có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày");
                break;
            case 3:
                System.out.println("Tháng 3 có 31 ngày");
                break;
            case 4:
                System.out.println("Tháng 4 có 30 ngày");
                break;
            case 5:
                System.out.println("Tháng 5 có 31 ngày");
                break;
            case 6:
                System.out.println("Tháng 6 có 30 ngày");
                break;
            case 7:
                System.out.println("Tháng 7 có 31 ngày");
                break;
            case 8:
                System.out.println("Tháng 8 có 31 ngày");
                break;
            case 9:
                System.out.println("Tháng 9 có 30 ngày");
                break;
            case 10:
                System.out.println("Tháng 10 có 31 ngày");
                break;
            case 11:
                System.out.println("Tháng 11 có 30 ngày");
                break;
            case 12:
                System.out.println("Tháng 12 có 31 ngày");
                break;
            default:
                System.out.println("Vui lòng nhập tháng từ 1 - 12");
                break;
        }
      }


}
