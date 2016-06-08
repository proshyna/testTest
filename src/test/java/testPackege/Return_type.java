package testPackege;

public class Return_type {
    static int c;
    static double d;

    public static void main(String[] args) {
    //    Mul(2, 3);
        Doub(1, 2);
        System.out.print("INTEGER = "+c +"\n");
        System.out.print("DOUBLE = "+d +"\n");
        Message();
    }

    public static int Mul(int a, int b) {
        c = a * b;
        return c;
    }

    public static double Doub(double a, double b) {
         d = a / b;
        return d;
    }
    public static void Message(){
        System.out.println("Test Message");
    }
}
