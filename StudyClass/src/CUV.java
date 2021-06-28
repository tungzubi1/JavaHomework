public class CUV extends Car{
    public String tienIch;

    public CUV(String brandName, String name, int price, int maLuc, String tienIch) {
        super(brandName, name, price, maLuc);
        this.tienIch = tienIch;
    }

    @Override
    public String toString() {
        return "CUV{" +
                "tienIch='" + tienIch + '\'' +
                ", brandName='" + brandName + '\'' +
                ", name='" + name + '\'' +
                ", type='" + price + '\'' +
                ", maLuc=" + maLuc +
                '}';
    }

    public void gamCao(){
        System.out.println("Lên vỉa hè ko sập gầm");
    }

}
