public class bai5 {
    static void index(){
        String str = "You only live once, but if you do it right, once is enough";
        int a, b = 0, loop = 0;
        String chuoi = "";
        System.out.println(str);
        while( b >= 0 && b <= str.length()){
            a = str.indexOf('u', b);
            if(a==-1){
                b=a;
            } else {
                chuoi = chuoi + a + "; ";
                b = a + 1;
                loop += 1;
            }
        } if (loop > 0){
            System.out.println("Ký tự \"u\" ở vị trí : " + chuoi);
            System.out.println("Bài 15");
        System.out.println("Số lần ký tự 'u' xuất hiện trong chuỗi: "+loop);
        }
        else
            System.out.println("Ko có ký tự \"u\"");
}
}