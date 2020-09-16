package Task2_SmallShop;

public class VendingMachine {
    private static Item itemList[];
    private int amounts;
    private int numAll;

    public static boolean findIdItem(Item item){
        byte temp = 0;
        for(Item it:itemList){
            if(it.getId() == item.getId()){
                temp++;
            }
        }
        if(temp == 0) return false;
        else return true;
    }
    public void restock(Item item){
        if(VendingMachine.findIdItem(item)){
            for(Item it:itemList){
                if(it.getId() == item.getId()){
                    int num = it.getNumItem() + item.getNumItem();
                    it.setNumItem(num);
                    break;
                }
            }
        }
    }
    public static double insert(Coin coin){
        return coin.getDenominations();
    }
    public static Item dispenseItem(Item item){
        item.setNumItem(item.getNumItem()-1);
        return item;
    }
    public Coin refund (Item item,Coin coin){
        Item it = VendingMachine.dispenseItem(item);
        Coin refundCoin = new Coin();
        refundCoin.setDenominations(VendingMachine.insert(coin) - it.getPrice());
        return refundCoin;
    }
}
