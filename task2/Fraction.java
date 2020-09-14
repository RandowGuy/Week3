package task2;
import task1.Methods;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(){
        this.numerator = 1;
        this.denominator = 1;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
    public int getNumerator(){
        return this.numerator;
    }
    public int getDenominator(){
        return this.denominator;
    }

    public Fraction(int numerator, int denominator){
        if(denominator == 0 ){
            System.out.println("demoniator cant not be 0");
        }
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }
    public Fraction reduce(){
        int gcd = Methods.gcd(this.numerator,this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
        return this;
    }
    public Fraction add(Fraction fr1, Fraction fr2){
        Fraction fr = new Fraction();
        fr.setNumerator((fr1.getNumerator() * fr2.getDenominator()) + (fr2.getNumerator() * fr1.getDenominator()));
        fr.setDenominator(fr1.getDenominator()*fr2.getDenominator());
        return fr;
    }
    public Fraction subtract(Fraction fr1, Fraction fr2){
        Fraction fr = new Fraction();
        fr.numerator = (fr1.numerator*fr2.denominator) - (fr2.numerator * fr1.denominator);
        fr.denominator = fr1.denominator*fr2.denominator;
        return fr;
    }
    public Fraction multiply(Fraction fr1, Fraction fr2){
        Fraction fr = new Fraction();
        fr.numerator = fr1.numerator * fr2.numerator;
        fr.denominator = fr1.denominator * fr2.denominator;
        return fr;
    }
    public Fraction divide(Fraction fr1, Fraction fr2){
        Fraction fr = new Fraction(fr2.denominator,fr2.numerator);

        fr = multiply(fr1,fr);
        return fr;
    }
    public void showFraction(){
        this.reduce();
        System.out.println("Phan so: " + this.getNumerator() + "/" + this.getDenominator());
    }
    public boolean equals(Object obj){
        if (obj instanceof Fraction ) {
            Fraction other = (Fraction) obj;
            ((Fraction) obj).reduce();
            other.reduce();
            if(this.getNumerator() == other.getNumerator()
                    && this.getDenominator() == other.getDenominator()){
                return true;
            }
            else return false;
        }
        else return false;
    }
}

