package Task2_SmallShop;
public class Coin {
    private double denominations;

    public Coin(){
    }
    public Coin (String kind, double denominations){
        this.denominations = denominations;
    }

    public void setDenominations(double denominations){
        this.denominations = denominations;
    }
    public double getDenominations(){
        return this.denominations;
    }
    public Coin getCoind(){
        return this;
    }
}
