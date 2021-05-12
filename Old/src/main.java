public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int c = rectangle.chuvichunhat();
        System.out.println("Chu vi hình chữ nhật: " + c);
        int s = rectangle.dientichchunhat();
        System.out.println("Diện tích hình chữ nhật: " + s);

        Circle circle = new Circle();
        circle.chuvihinhtron();
        circle.dientichhinhtron();
    }
}
