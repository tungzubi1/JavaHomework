public class Script {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public boolean checkTriangle(int a, int b, int c) {
        if (a + b > c & b + c > a & c + a > b) {
            return true;
        } else return false;
    }

    public boolean sole(int a, int b, int c) {
        if ((a + b + c)%2==1) {
            return true;
        } else return false;
    }

}
