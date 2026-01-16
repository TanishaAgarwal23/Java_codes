package DaaPracTanisha;
import java.util.Arrays;
import java.util.Comparator;
class Item {
    int weight;
    int value;
    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}
public class FractionalKnapsack {

    public static double getMaxValue(int knapsackCapacity, Item[] items) {
        Arrays.sort(items, Comparator.comparingDouble(i -> (double) i.value / i.weight));
        double totalValue = 0;
        int remainingWeight = knapsackCapacity;
        for (Item item : items) {
            if (item.weight <= remainingWeight) {
                totalValue += item.value;
                remainingWeight -= item.weight;
            } else {
                totalValue += ((double) item.value / item.weight) * remainingWeight;
                break;
            }
        }
        return totalValue;
    }
    public static void main(String[] args) {
        int knapsackCapacity = 50;
        Item[] items = {
                new Item(10, 60),
                new Item(20, 100),
                new Item(30, 120)
        };
        double maxValue = getMaxValue(knapsackCapacity, items);
        System.out.println("Maximum value that can be achieved: " + maxValue);
    }
}
