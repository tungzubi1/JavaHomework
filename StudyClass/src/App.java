public class App {
    public static void main(String[] args) {
        listCar();
        SuperCar supercar = new SuperCar();
        System.out.println("\nTest Inheritance:"+"\n" + supercar.TinhNang);

    }

    public static void listCar(){
        CUV cuv = new CUV("Mazda", "CuvHangSang", 1000, 140, "Cửa sổ trời");
        System.out.println(cuv);
        cuv.gamCao();
        CUVLUX cuvlux = new CUVLUX("Huyndai","TUCSON", 2000, 200, "Chắn bùn", "Khóa cửa tự động");
        System.out.println(cuvlux);
        cuvlux.missionCUVLUX();
        SUV suv = new SUV("VinFast", "Lux SA President",10000, 300,"Chống đạn");
        System.out.println(suv);
        suv.ghost();
    }
}
