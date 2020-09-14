import task1.Methods;
import task2.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(2,8);
        Fraction fr2 = new Fraction(24,96);
        fr1.showFraction();
        fr2.showFraction();

        Fraction fr = new Fraction();
        fr = fr.add(fr1,fr2);
        System.out.println("Tong 2 phan so: ");
        fr.showFraction();

        fr = fr.subtract(fr1,fr2);
        System.out.println("Hieu 2 phan so: ");
        fr.showFraction();

        fr = fr.multiply(fr1,fr2);
        System.out.println("Tich 2 phan so: ");
        fr.showFraction();

        fr = fr.divide(fr1,fr2);
        System.out.println("Thuong 2 phan so: ");
        fr.showFraction();

        if(fr1.equals(fr2) == true ) System.out.println("2 phan so bang nhau");
        else System.out.println("2 phan so khong bang nhau");
    }
}
