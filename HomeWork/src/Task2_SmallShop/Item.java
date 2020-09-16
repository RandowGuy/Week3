package Task2_SmallShop;

public class Item {
    private int id;
    private String name;
    private double price;
    private int numItem;

    public Item(){
    }
    public Item(int id,String name,double price, int numItem){
        this.name = name;
        this.id = id;
        this.price = price;
        this.numItem = numItem;
    }
    public Item(Item s){
        this.name = s.name;
        this.id = s.id;
        this.price = s.price;
        this.numItem = s.numItem;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setNumItem(int Nums){
        this.numItem = Nums;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getId() {
        return this.id;
    }

    public int getNumItem() {
        return this.numItem;
    }

    public String getInfo(){
        return this.name + " " + this.id;
    }


}
