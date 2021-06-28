public class CUVLUX extends CUV {
    public String congNghe;

    public CUVLUX(String brandName,String name, int price, int maLuc, String tienIch, String congNghe) {
        super(brandName,name, price, maLuc, tienIch);
        this.congNghe = congNghe;
    }

    @Override
    public String toString() {
        return "CUVLUX{" +
                "tienIch='" + tienIch + '\'' +
                ", brandName='" + brandName + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maLuc=" + maLuc +
                ", congNghe='" + congNghe + '\'' +
                '}';
    }

    public void missionCUVLUX(){
        System.out.println("Hát trên xe");
    }

}
