public class SUV extends Car{
    public String mode;

    public SUV(String brandName, String name, int price, int maLuc, String mode) {
        super(brandName, name, price, maLuc);
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "SUV{" +
                "brandName='" + brandName + '\'' +
                ", name='" + name + '\'' +
                ", type='" + price + '\'' +
                ", maLuc=" + maLuc +
                ", mode='" + mode + '\'' +
                '}';
    }

    public void ghost(){
        System.out.println("Khởi động chế độ turbo boost speed");
    }
}
