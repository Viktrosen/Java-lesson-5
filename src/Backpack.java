class Item {
    private int weight;
    private int value;

    public Item(int weight, int value){
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }


}




public class Backpack {
    static final int MAX_WEIGHT = 85;

    static Item[] items = {
            new Item(15, 30),
            new Item(30, 80),
            new Item(50, 100)
    };

    public static void main(String[] args) {
        System.out.println(findBestRes(items.length - 1, MAX_WEIGHT));
    }

    private static int findBestRes(int i, int weigth) {
        if (i < 0) {
            return 0;
        }
        if (items[i].getWeight() > weigth) {
            return findBestRes(i-1, weigth);
        }
        else {
            return Math.max(findBestRes(i-1, weigth), findBestRes(i-1, weigth - items[i].getWeight()) + items[i].getValue());
        }
    }
}
