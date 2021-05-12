public class Circle {

    float r = 8;

    void chuvihinhtron (){
        double x = 2*r*Math.PI;
        System.out.println("Chu vi hình tròn: " + x);
    }

    void dientichhinhtron () {
        double s = r*r* Math.PI;
        System.out.println("Diện tích hình tròn: " + s);
    }
}

